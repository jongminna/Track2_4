package com.jslhrd.service.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jslhrd.domain.user.UserDAO;
import com.jslhrd.domain.user.UserVO;
import com.jslhrd.service.Action;

public class UserLoginProService implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		
		UserDAO dao = UserDAO.getInstance();
		int row = dao.userLogin(userid, passwd);
		request.setAttribute("row", row);
		if(row==1) {
			UserVO vo = dao.userSelect(userid);
			HttpSession session = request.getSession();
			session.setAttribute("user", vo);
			session.setMaxInactiveInterval(1800);//30분
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/User/user_login_ok.jsp");
		rd.forward(request, response);

	}

}
