package exServlet.servlet.pds;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exServlet.model.pds.PdsDAO;
import exServlet.model.pds.PdsVO;

/**
 * Servlet implementation class PdsViewServlet
 */
@WebServlet("/pds_view.do")
public class PdsViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PdsViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		PdsDAO dao = PdsDAO.getInstance();
		//쿠키체그
		boolean bool = false;
		Cookie info = null;
		Cookie cookies[] = request.getCookies();
		for(int x=0; x<cookies.length; x++) {
			info = cookies[x];
			if(info.getName().equals("pdsCookie"+idx)) {
				bool=true;
				break;
			}
		}
		//쿠키값으로 사용할 데이터 생성
		String value=""+System.currentTimeMillis();
		if(!bool) {//쿠키가 존재하지 않으면
			//조회수 증가
			dao.pdsHits(idx);
			info = new Cookie("pdsCookie"+idx, value);//쿠키생성
			info.setMaxAge(24*60*60);//1일
			response.addCookie(info);//쿠키전송
		}
		PdsVO vo = dao.pdsView(idx);
		
		request.setAttribute("vo", vo);
		
		RequestDispatcher rd = request.getRequestDispatcher("/Pds/pds_view.jsp");
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
