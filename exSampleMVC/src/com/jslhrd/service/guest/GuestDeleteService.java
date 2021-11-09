package com.jslhrd.service.guest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.domain.guest.GuestDAO;
import com.jslhrd.domain.guest.GuestVO;
import com.jslhrd.service.Action;

public class GuestDeleteService implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		
		GuestDAO dao = GuestDAO.getInstance();
		int row = dao.guestDelete(idx);
		
		request.setAttribute("row", row);
		RequestDispatcher rd = request.getRequestDispatcher("/Guest/guest_delete_pro.jsp");
		rd.forward(request, response);
	}

}
