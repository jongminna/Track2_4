package com.jslhrd.service.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jslhrd.service.Action;

public class UserLogoutService implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();//세션 객체 생성
		session.invalidate();
		response.sendRedirect("/index");
/*		
		RequestDispatcher rd = request.getRequestDispatcher("/User/user_login.jsp");
		rd.forward(request, response);
*/		
	}

}
