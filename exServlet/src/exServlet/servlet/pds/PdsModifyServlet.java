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

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import exServlet.model.pds.PdsDAO;
import exServlet.model.pds.PdsVO;

/**
 * Servlet implementation class PdsModifyServlet
 */
@WebServlet("/pds_modify.do")
public class PdsModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PdsModifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		PdsDAO dao = PdsDAO.getInstance();
		PdsVO vo = dao.pdsView(idx);
		
		request.setAttribute("vo", vo);
		
		RequestDispatcher rd = request.getRequestDispatcher("/Pds/pds_modify.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		ServletContext context = getServletContext();
		String path=context.getRealPath("Pds/upload/");//파일업로드 경로
		String encType="utf-8";
		int sizeLimit = 2*1024*1024;//파일최대 사이즈 2M
		MultipartRequest multi=new MultipartRequest(request, path, sizeLimit,
				encType, new DefaultFileRenamePolicy());
		
		PdsVO vo = new PdsVO();
		vo.setIdx(Integer.parseInt(multi.getParameter("idx")));
		vo.setEmail(multi.getParameter("email"));
		vo.setSubject(multi.getParameter("subject"));
		vo.setContents(multi.getParameter("contents"));
		vo.setPass(multi.getParameter("pass"));
		
		String oldfile = multi.getParameter("oldfile");
		String filename=multi.getFilesystemName("filename");
		
		if(filename == null) {//예전파일 이용시
			vo.setFilename(oldfile);
		}else { //첨부파일 변경시
			vo.setFilename(filename);
			File file = new File(path+oldfile);
			if(file.exists())
				file.delete();
		}
	
		PdsDAO dao = PdsDAO.getInstance();
		int row = dao.pdsModify(vo);
		
		request.setAttribute("row", row);
		RequestDispatcher rd = request.getRequestDispatcher("/Pds/pds_modify_pro.jsp");
		rd.forward(request, response);
		
	}

}
