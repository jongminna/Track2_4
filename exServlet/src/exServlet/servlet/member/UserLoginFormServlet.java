package exServlet.servlet.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import exServlet.model.member.MemberDAO;
import exServlet.model.member.MemberVO;
import exServlet.util.UserSHA256;

/**
 * Servlet implementation class UserLogin_FormServlet
 */
@WebServlet("/userlogin_form.do")
public class UserLoginFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher rd = 
				request.getRequestDispatcher("/Member/userlogin_form.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDAO dao = MemberDAO.getInstance();
		
		String userid = request.getParameter("userid");
		String passwd = UserSHA256.getSHA256(request.getParameter("passwd"));
		
		int row = dao.memberLogin(userid, passwd);
		if(row==1) { //로그인 성공
			//세션객체 생성
			MemberVO vo = dao.getMember(userid);
			HttpSession session = request.getSession();//세션객체 생성
			session.setAttribute("user", vo);
			session.setMaxInactiveInterval(1800);//세션유지시간
		}
		
		request.setAttribute("row", row);//1로그인 성공, 0비번오류, -1아이디 없음
		
		RequestDispatcher rd = 
				request.getRequestDispatcher("/Member/userlogin_ok.jsp");
		rd.forward(request, response);
	}

}
