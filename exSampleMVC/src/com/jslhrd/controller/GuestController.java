package com.jslhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.service.Action;
import com.jslhrd.service.guest.*;

/**
 * Servlet implementation class GuestController
 */
@WebServlet("/Guest")
public class GuestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuestController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		System.out.println("요청을 받음 :" + cmd);
		
		Action action = null;
		if(cmd.equals("guest_list")) {
			action = new GuestListService();
		}else if(cmd.equals("guest_write")) {
			action = new GuestWriteService();
		}else if(cmd.equals("guest_write_pro")) {
			action = new GuestWriteProService();
		}else if(cmd.equals("guest_view")) {
			action = new GuestViewService();
		}else if(cmd.equals("guest_delete")) {
			action = new GuestDeleteService();
		}else if(cmd.equals("guest_modify")) {
			action = new GuestModifyService();
		}else if(cmd.equals("guest_modify_pro")) {
			action = new GuestModifyProService();	
		}
		
		action.execute(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
