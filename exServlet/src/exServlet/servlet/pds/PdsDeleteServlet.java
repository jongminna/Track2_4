package exServlet.servlet.pds;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exServlet.model.pds.PdsDAO;

/**
 * Servlet implementation class PdsDeleteServlet
 */
@WebServlet("/pds_delete.do")
public class PdsDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PdsDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx=Integer.parseInt(request.getParameter("idx"));
		request.setAttribute("idx", idx);
		
		RequestDispatcher rd = request.getRequestDispatcher("/Pds/pds_delete.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx=Integer.parseInt(request.getParameter("idx"));
		String pass=request.getParameter("pass");
		
		PdsDAO dao = PdsDAO.getInstance();
		String filename = dao.getFile(idx);
		//게시글 삭제
		int row = dao.pdsDelete(idx, pass);
		if(row==1) {//게시글 삭제 성공시
			ServletContext context = getServletContext();
			String path=context.getRealPath("Pds/upload/");//파일업로드 경로
			File file = new File(path,filename);
			if(file.exists())
				file.delete();
		}
		
		request.setAttribute("row", row);
		
		RequestDispatcher rd = request.getRequestDispatcher("/Pds/pds_delete_pro.jsp");
		rd.forward(request, response);
	}

}
