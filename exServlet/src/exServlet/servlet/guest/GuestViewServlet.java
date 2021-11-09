package exServlet.servlet.guest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exServlet.model.guest.GuestDAO;
import exServlet.model.guest.GuestVO;

/**
 * Servlet implementation class GuestViewServlet
 */
@WebServlet("/guest_view.do")
public class GuestViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuestViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx=Integer.parseInt(request.getParameter("idx"));
		int nowpage=Integer.parseInt(request.getParameter("page"));
		
		GuestDAO dao = GuestDAO.getInstance();
		//쿠키 검사 및 생성
		boolean bool = false;
		Cookie info = null;
		//사용자의 컴퓨터에서 모든 쿠기정보 가져오기
		Cookie[] cookies = request.getCookies();
		for(int x=0; x<cookies.length; x++) {
			info = cookies[x];
			if(info.getName().equals("Guest"+idx)) {
				bool = true;
				break;
			}
		}
		String newValue=""+System.currentTimeMillis();
		if(!bool) { //쿠키가 존재하지 않으면
			dao.guestHits(idx);
			info = new Cookie("Guest"+idx, newValue);
			info.setMaxAge(60*60);//쿠키유효시간(한시간)
			response.addCookie(info);//쿠키정보 전송
		}
		GuestVO vo = dao.guestView(idx);
	
		request.setAttribute("vo", vo);
		request.setAttribute("page", nowpage);
		RequestDispatcher rd = request.getRequestDispatcher("/Guest/guest_view.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
