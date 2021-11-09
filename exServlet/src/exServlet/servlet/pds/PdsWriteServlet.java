package exServlet.servlet.pds;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import exServlet.model.pds.PdsDAO;
import exServlet.model.pds.PdsVO;

/**
 * Servlet implementation class PdsWriteServlet
 */
@WebServlet("/pds_write.do")
public class PdsWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PdsWriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/Pds/pds_write.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		ServletContext context = getServletContext();
		String path=context.getRealPath("Pds/upload");//파일업로드 경로
		String encType="utf-8";
		int sizeLimit = 2*1024*1024;//파일최대 사이즈 2M
		MultipartRequest multi=new MultipartRequest(request, path, sizeLimit,
				encType, new DefaultFileRenamePolicy());
		
		String name=multi.getParameter("name");
		String email=multi.getParameter("email");
		String subject=multi.getParameter("subject");
		String contents=multi.getParameter("contents");
		String pass=multi.getParameter("pass");
		
		String filename=multi.getFilesystemName("filename");
		
		PdsDAO dao = PdsDAO.getInstance();
		PdsVO vo = new PdsVO();
		vo.setName(name);
		vo.setEmail(email);
		vo.setSubject(subject);
		vo.setContents(contents);
		vo.setPass(pass);
		vo.setFilename(filename);
		
		int row = dao.pdsWrite(vo);
		
		request.setAttribute("row", row);
		
		RequestDispatcher rd = request.getRequestDispatcher("/Pds/pds_write_pro.jsp");
		rd.forward(request, response);
	}

}
