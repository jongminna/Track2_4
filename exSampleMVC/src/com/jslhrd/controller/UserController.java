package com.jslhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.service.Action;
import com.jslhrd.service.user.UserEmailCheckService;
import com.jslhrd.service.user.UserIdCheckProService;
import com.jslhrd.service.user.UserIdCheckService;
import com.jslhrd.service.user.UserInsertProService;
import com.jslhrd.service.user.UserInsertService;
import com.jslhrd.service.user.UserLoginProService;
import com.jslhrd.service.user.UserLoginService;
import com.jslhrd.service.user.UserLogoutService;

@WebServlet("/User")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		
		Action action = null;
		if(cmd.contentEquals("user_insert")) {//회원가입 폼
			action=new UserInsertService();
		}else if(cmd.contentEquals("user_idcheck")) {//아이디중복검사 폼
			action=new UserIdCheckService();
		}else if(cmd.contentEquals("user_idcheck_pro")) {//아이디중복검사 처리
			action=new UserIdCheckProService();
		}else if(cmd.contentEquals("user_insert_pro")) {//등록처리
			action=new UserInsertProService();
		}else if(cmd.contentEquals("user_login")) {//로그인 폼
			action=new UserLoginService();
		}else if(cmd.contentEquals("user_login_pro")) {//로그인 처리(DB)
			action=new UserLoginProService();
		}else if(cmd.contentEquals("user_logout")) {//로그아웃처리(DB)
			action=new UserLogoutService();
		}else if(cmd.contentEquals("user_email_check")) {//이메일 인증
			action=new UserEmailCheckService();
		}
		action.execute(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
