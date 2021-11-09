package com.jslhrd.service.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jslhrd.service.Action;

public class AdminLoginProService implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminid="admin";
		String adminpass="1234";
		String url="";
		//DB 연결
		int row=1;
		if(row==1) {
			HttpSession session = request.getSession();
			session.setAttribute("adminuser", adminid);
			session.setMaxInactiveInterval(1800);
			url="/Admin?cmd=notice_list";
		}else {
			request.setAttribute("row", row);
			url="/AdminLogin?cmd=login";
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
