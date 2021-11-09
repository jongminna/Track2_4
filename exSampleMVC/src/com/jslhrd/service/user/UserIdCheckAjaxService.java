package com.jslhrd.service.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.domain.user.UserDAO;
import com.jslhrd.service.Action;

public class UserIdCheckAjaxService implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		UserDAO dao = UserDAO.getInstance();
		int row = dao.idCheck(userid);
		PrintWriter out = response.getWriter();
		out.print(row);
		
		
	}

}
