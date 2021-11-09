package com.jslhrd.service.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.service.Action;
import com.jslhrd.util.GmailConfirm;

public class UserEmailCheckService implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email1")+"@"+request.getParameter("email2");
		//메일발송
		GmailConfirm instance = GmailConfirm.getInstance();
		String authNum = instance.connectEmail(email);
		
		request.setAttribute("authNum", authNum);
		
		RequestDispatcher rd = request.getRequestDispatcher("/User/user_emailcheck.jsp");
		rd.forward(request, response);
	}

}
