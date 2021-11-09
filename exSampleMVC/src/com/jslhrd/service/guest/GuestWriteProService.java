package com.jslhrd.service.guest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.domain.guest.GuestDAO;
import com.jslhrd.domain.guest.GuestVO;
import com.jslhrd.service.Action;

public class GuestWriteProService implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GuestVO vo = new GuestVO();
		vo.setName(request.getParameter("name"));
		vo.setSubject(request.getParameter("subject"));
		vo.setContents(request.getParameter("contents"));
		
		GuestDAO dao = GuestDAO.getInstance();
		int row = dao.guestWrite(vo);
		/*
		 *  등록 성공 메시지 미출력
		 *  response.sendRedirect("guest_list");
		 */
		request.setAttribute("row", row);
		RequestDispatcher rd = request.getRequestDispatcher("/Guest/guest_write_pro.jsp");
		rd.forward(request, response);
	}

}
