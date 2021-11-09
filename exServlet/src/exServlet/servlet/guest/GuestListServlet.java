package exServlet.servlet.guest;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exServlet.model.guest.GuestDAO;
import exServlet.model.guest.GuestVO;
import exServlet.util.DBManager;
import exServlet.util.PageIndex;

/**
 * Servlet implementation class GuestListServlet
 */
@WebServlet("/guest_list.do")
public class GuestListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuestListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.sendRedirect("/Guest/guest_list.jsp");
		GuestDAO dao = GuestDAO.getInstance();
		String s_query="",search="",key="";
		int totcount=0;//게시글 총수
		
		if(request.getParameter("key") != null) {
			//post호출
			key=request.getParameter("key");
			search=request.getParameter("search");
			s_query=search+" like '%" + key + "%'";
			totcount = dao.guestCount(s_query);
		}else {
			//get 호출
			totcount = dao.guestCount();//총글수
		}
		
		//페이지수 계산
		int nowpage=1;//현재페이지(기본값)
		int maxlist=10;//페이지당 글수
		int totpage=1;//총페이지 수 (기본값)
		
		if(totcount % maxlist == 0) {
			totpage = totcount / maxlist;
		}else {
			totpage = totcount / maxlist + 1;
		}
		
		//페이지번호가 입력된경우
		if(request.getParameter("page") != null) {
			nowpage = Integer.parseInt(request.getParameter("page"));
		}
		
		//페이지별 출력될 시작번호, 끝번호
		int startpage = (nowpage-1)*maxlist+1;
		int endpage = nowpage*maxlist;
		//jsp파일에서 번호 출력용
		int listcount = totcount-((nowpage-1)*maxlist);
		
		List<GuestVO> list = null;
		if(key.equals("")) {
			list = dao.guestList(startpage, endpage);
		}else {
			list = dao.guestList(s_query, startpage, endpage);
		}
		
		//페이지처리 클래스 연결
		String pageSkip="";
		if(key.equals("")) {
			pageSkip = PageIndex.pageList(nowpage, totpage, "guest_list.do", "");
		}else {
			pageSkip = PageIndex.pageListHan(nowpage, totpage, "guest_list.do", search, key);
		}

		request.setAttribute("page", nowpage);
		request.setAttribute("totcount", totcount);
		request.setAttribute("totpage", totpage);
		request.setAttribute("listcount", listcount);
		request.setAttribute("list", list);
		request.setAttribute("pageSkip", pageSkip);
		request.setAttribute("search", search);
		request.setAttribute("key", key);
		
		RequestDispatcher rd = request.getRequestDispatcher("/Guest/guest_list.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
