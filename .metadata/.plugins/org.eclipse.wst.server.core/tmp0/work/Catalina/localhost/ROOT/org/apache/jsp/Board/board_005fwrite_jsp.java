/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.71
 * Generated at: 2021-10-12 03:38:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class board_005fwrite_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/Include/copyright.jsp", Long.valueOf(1634008641359L));
    _jspx_dependants.put("/Include/login_form.jsp", Long.valueOf(1634009299265L));
    _jspx_dependants.put("/Include/topmenu.jsp", Long.valueOf(1634009670968L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write(" <head><title>Web Programming Test</title>\r\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"/stylesheet.css\">\r\n");
      out.write(" <style type=\"text/css\">\r\n");
      out.write("   .menu, td {font-size:9pt;}\r\n");
      out.write(" </style>\r\n");
      out.write("</head>\r\n");
      out.write(" <body text=\"black\" link=\"blue\" vlink=\"purple\" alink=\"red\" bgcolor=\"white\" topmargin=\"0\" leftmargin=\"0\">\r\n");
      out.write(" <table border=\"0\" cellspacing=\"2\" bgcolor=\"#ecf1ef\" width=\"900\" bordercolordark=\"#ffffff\" bordercolorlight=\"#000000\">\r\n");
      out.write("   <tr>\r\n");
      out.write("     <td width=\"20%\" rowspan=\"4\" valign=\"bottom\" bgcolor=\"#000000\">\r\n");
      out.write("       <a href=\"/index.jsp\"><img src=\"/Include/img/ceo.jpg\" width=\"158\" height=\"83\" border=\"0\"></a>\r\n");
      out.write("       <font style=\"font-size:9pt;color:white;font-family:돋움\"><b>Total 136,489\r\n");
      out.write("       <font color=\"yellow\"></font>\r\n");
      out.write("       | Now 178\r\n");
      out.write("       <font color=\"yellow\"></font>\r\n");
      out.write("       </b></font>\r\n");
      out.write("     </td>\r\n");
      out.write("     <td bgcolor=\"#9966ff\" width=\"10%\" height=\"25\" onmouseover=\"style.backgroundColor='#2772D3'\" onmouseout=\"style.backgroundColor=''\">\r\n");
      out.write("     <p align=\"center\"><font color=\"white\" size=\"2\"><b><a href=\"/Users/user_login.jsp\" class=\"white\">로그인</A></b></font></p>\r\n");
      out.write("     <p align=\"center\"><font color=\"white\" size=\"2\"><b><a href=\"\" class=\"white\">로그아웃</A></b></font></p>\r\n");
      out.write("     </td>\r\n");
      out.write("     <td bgcolor=\"#9966ff\" width=\"10%\" onmouseover=\"style.backgroundColor='#2772D3'\" onmouseout=\"style.backgroundColor=''\">\r\n");
      out.write("     <p align=\"center\"><font color=\"white\" size=\"2\"><b><a href=\"/Users/user_insert.jsp\" class=\"white\">회원가입</a></b></font></p>\r\n");
      out.write("     <p align=\"center\"><font color=\"white\" size=\"2\"><b><a href=\"\" class=\"white\">정보수정</a></b></font></p>\r\n");
      out.write("     </td>\r\n");
      out.write("     <td bgcolor=\"#9966ff\" width=\"10%\" onmouseover=\"style.backgroundColor='#2772D3'\" onmouseout=\"style.backgroundColor=''\">\r\n");
      out.write("     <p align=\"center\"><font color=\"white\" size=\"2\"><b><a href=\"/Notice/notice_list.jsp\" class=\"white\">공지사항</a></b></font></p>\r\n");
      out.write("     </td>\r\n");
      out.write("     <td bgcolor=\"#9966ff\" width=\"10%\" onmouseover=\"style.backgroundColor='#2772D3'\" onmouseout=\"style.backgroundColor=''\">\r\n");
      out.write("     <p align=\"center\"><font color=\"white\" size=\"2\"><b><a href=\"/Board/board_list.jsp\" class=\"white\">게시판</b></font></p>\r\n");
      out.write("     </td>\r\n");
      out.write("     <td bgcolor=\"#9966ff\" width=\"10%\" onmouseover=\"style.backgroundColor='#2772D3'\" onmouseout=\"style.backgroundColor=''\">\r\n");
      out.write("     <p align=\"center\"><font color=\"white\" size=\"2\"><b><a href=\"/Pds/pds_list.jsp\" class=\"white\">자료실</a></b></font></p>\r\n");
      out.write("     </td>\r\n");
      out.write("     <td bgcolor=\"#9966ff\" width=\"10%\" onmouseover=\"style.backgroundColor='#2772D3'\" onmouseout=\"style.backgroundColor=''\">\r\n");
      out.write("     <p align=\"center\"><font color=\"white\" size=\"2\"><b><a href=\"/Guest/guest_list.jsp\" class=\"white\">방명록</a></b></font></p>\r\n");
      out.write("     </td>\r\n");
      out.write("     <td bgcolor=\"#9966ff\" width=\"10%\" onmouseover=\"style.backgroundColor='#2772D3'\" onmouseout=\"style.backgroundColor=''\">\r\n");
      out.write("     <p align=\"center\"><font color=\"white\" size=\"2\"><b><a href=\"/Gallery/gallery_list.jsp\" class=\"white\">겔러리</b></font></p>\r\n");
      out.write("     </td>\r\n");
      out.write("     <td bgcolor=\"#9966ff\" width=\"10%\" onmouseover=\"style.backgroundColor='#2772D3'\" onmouseout=\"style.backgroundColor=''\">\r\n");
      out.write("     <p align=\"center\"><font color=\"white\" size=\"2\"><b><a href=\"/Admin/adminlogin.jsp\" class=\"white\">관리자</b></font></p>\r\n");
      out.write("     </td>\r\n");
      out.write("   </tr>                   \r\n");
      out.write("   <tr>\r\n");
      out.write("     <td colspan=\"8\">\r\n");
      out.write("     <p><img src=\"/Include/img/bar-01.gif\" width=\"100%\" height=\"1\" border=\"0\"></p>\r\n");
      out.write("     </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("     <td colspan=\"8\"><p><img src=\"/Include/img/bar-01.gif\" width=\"100%\" height=\"1\" border=\"0\"></p></td>\r\n");
      out.write("   </tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("     <td><p><b><span style=\"font-size:15pt;\">&nbsp;Search</span></b></p></td>\r\n");
      out.write("     <form action=\"\" method=\"post\">\r\n");
      out.write("     <td colspan=\"5\">\r\n");
      out.write("     <p>&nbsp;\r\n");
      out.write("       <Select name=\"genre\" size=\"1\">\r\n");
      out.write("         <option value=\"종합\">공지사항\r\n");
      out.write("         <option value=\"종합\">게시판\r\n");
      out.write("         <option value=\"종합\">방명록\r\n");
      out.write("         <option value=\"종합\">자료실\r\n");
      out.write("       </Select>\r\n");
      out.write("       <Select name=\"item\" size=\"1\">\r\n");
      out.write("         <option value=\"name\">작성자\r\n");
      out.write("         <option value=\"subject\">제목\r\n");
      out.write("         <option value=\"contents\">제목\r\n");
      out.write("       </Select>\r\n");
      out.write("         <input type=\"text\" name=\"keyword\" size=\"12\">\r\n");
      out.write("         <input type=\"image\" src=\"/Include/img/search2.gif\">\r\n");
      out.write("     </td>\r\n");
      out.write("     </form>\r\n");
      out.write("   </tr>\r\n");
      out.write(" </table>  \r\n");
      out.write(" </body>\r\n");
      out.write(" </html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("   <head><title>게시판 작성</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/stylesheet.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write(" <body topmargin=\"0\" leftmargin=\"0\">\r\n");
      out.write(" <table border=\"0\" width=\"800\">\r\n");
      out.write(" <tr>\r\n");
      out.write("   <td width=\"20%\" height=\"500\" bgcolor=\"#ecf1ef\" valign=\"top\">\r\n");
      out.write("\r\n");
      out.write("   <!-- 다음에 추가할 부분 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write(" <title>Login</title>\r\n");
      out.write("\r\n");
      out.write(" </head>\r\n");
      out.write("\r\n");
      out.write(" <body>\r\n");
      out.write("   <table width=\"100%\" height=\"120\" border=\"0\">\r\n");
      out.write("   <form name=\"login_form\" action=\"\" method=\"post\" >\r\n");
      out.write("     <tr>\r\n");
      out.write("       <td colspan=\"2\" bgcolor=\"#6FA0E\" height=\"20\" align=\"center\">\r\n");
      out.write("         <font size=\"2\" color=\"white\"><b>Member Login</b></font>\r\n");
      out.write("       </td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("       <td ><font size=\"2\">아 이 디</font></td>\r\n");
      out.write("       <td ><input type=\"text\" size=\"10\" name=\"userid\"></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("       <td><font size=\"2\">비밀번호</font></td>\r\n");
      out.write("			 <td>\r\n");
      out.write("         <input type=\"password\" size=\"10\" name=\"passwd\">\r\n");
      out.write("       </td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("       <td><input type=\"image\" src=\"/Include/img/login1.gif\" border=\"0\" onClick=\"return check_login()\"></td>\r\n");
      out.write("			 <td>\r\n");
      out.write("           <a href=\"\"><img src=\"/Include/img/regist.gif\" border=\"0\"></a>\r\n");
      out.write("       </td>\r\n");
      out.write("     </tr>\r\n");
      out.write(" </form>\r\n");
      out.write(" </table>\r\n");
      out.write(" <table width=\"100%\" height=\"120\" border=\"0\">\r\n");
      out.write("   <tr>\r\n");
      out.write("     <td bgcolor=\"#6FA0E\" align=\"center\" height=\"20\">\r\n");
      out.write("       <font size=\"2\" color=\"white\">홍길동 님!</font>\r\n");
      out.write("     </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("     <td align=\"center\">\r\n");
      out.write("       <font size=\"2\">\r\n");
      out.write("       <a href=\"adminpage.jsp\">관리자 페이지</a><br>\r\n");
      out.write("       <a href=\"logout.jsp\">로그오프</a><br>\r\n");
      out.write("       <a href=\"userinfo_view.jsp\">회원정보수정</a><br>\r\n");
      out.write("       </font>\r\n");
      out.write("     </td>\r\n");
      out.write("   </tr>\r\n");
      out.write(" </table>\r\n");
      out.write(" <table width=\"100%\" height=\"120\" border=\"0\">\r\n");
      out.write("   <tr>\r\n");
      out.write("     <td bgcolor=\"#6FA0E\" align=\"center\" height=\"20\">\r\n");
      out.write("       <font size=\"2\" color=\"white\">홍길동민 님!</font>\r\n");
      out.write("     </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("     <td align=\"center\">\r\n");
      out.write("       <font size=\"2\">\r\n");
      out.write("       <a href=\"logout.jsp\">로그오프</a><br>\r\n");
      out.write("       <a href=\"userinfo_view.jsp\">회원정보수정</a>\r\n");
      out.write("       <a href=\"userinfo_del.jsp\">회원탈퇴</a>\r\n");
      out.write("\r\n");
      out.write("       </font>\r\n");
      out.write("     </td>\r\n");
      out.write("   </tr>\r\n");
      out.write(" </table>\r\n");
      out.write(" </body>\r\n");
      out.write(" </html>\r\n");
      out.write("\r\n");
      out.write("   </td>\r\n");
      out.write("\r\n");
      out.write("   <td width=\"80%\" valign=\"top\">&nbsp;<br>\r\n");
      out.write("     <img src=\"./img/bullet-01.gif\"><font size=\"3\" face=\"돋움\" color=\"blue\"> <b>반갑습니다</b></font>\r\n");
      out.write("     <font size=\"2\"> - 글쓰기</font><p>\r\n");
      out.write("     <img src=\"./img/bullet-03.gif\"><font size=\"2\" face=\"돋움\" color=\"orange\"> 잠깐</font> &nbsp;\r\n");
      out.write("     <img src=\"./img/bullet-02.gif\"><font size=\"2\" face=\"돋움\">는 필수 입력 사항입니다.</font><p>\r\n");
      out.write("     <form method=\"post\">\r\n");
      out.write("\r\n");
      out.write("	  <table border=\"0\">\r\n");
      out.write("       <tr>\r\n");
      out.write("         <td width=\"5%\" align=\"right\"><img src=\"./img/bullet-02.gif\"></td>\r\n");
      out.write("         <td width=\"15%\"><font size=\"2\" face=\"돋움\">글쓴이</font></td>\r\n");
      out.write("         <td width=\"80%\">\r\n");
      out.write("         <input type=\"text\" size=\"20\" name=\"name\"></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <td align=\"right\">&nbsp;</td>\r\n");
      out.write("         <td ><font size=\"2\" face=\"돋움\">메일주소</font></td>\r\n");
      out.write("         <td>\r\n");
      out.write("          <input type=\"text\" size=\"20\" name=\"email\"></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("	   <tr>\r\n");
      out.write("         <td align=\"right\"><img src=\"./img/bullet-02.gif\"></td>\r\n");
      out.write("         <td><font size=\"2\" face=\"돋움\">제목</font></td>\r\n");
      out.write("         <td><input type=\"text\" size=\"60\" name=\"subject\" ></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <td align=\"right\"><img src=\"./img/bullet-02.gif\"></td>\r\n");
      out.write("         <td><font size=\"2\" face=\"돋움\">내용</font></td>\r\n");
      out.write("         <td><textarea wrap=\"physical\" rows=\"10\" name=\"contents\" cols=\"60\"></textarea></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("	   <tr>\r\n");
      out.write("         <td align=\"right\"><img src=\"./img/bullet-02.gif\"></td>\r\n");
      out.write("         <td><font size=\"2\" face=\"돋움\">비밀번호</font></td>\r\n");
      out.write("          <td><input type=\"password\" size=\"10\" name=\"pass\" ><font size=\"2\" face=\"돋움\">*.수정과 삭제시 꼭 입력하셔야 합니다.</font></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr></tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("          <td align=\"right\">&nbsp;</td>\r\n");
      out.write("          <td><font size=\"2\">&nbsp;</font></td>\r\n");
      out.write("          <td>\r\n");
      out.write("             <a href=\"#\"><img src=\"./img/save.gif\" border=0></a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("             <a href=\"#\"><img src=\"./img/cancle.gif\" border=0></a>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("      </form>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  </body>\r\n");
      out.write("  </html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("  td {padding-left:3;font-size:9pt}\r\n");
      out.write("  table.content {font-size:9pt;font-family:돋움;font-color:#002C57;}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<center>\r\n");
      out.write("<table>\r\n");
      out.write("<tr align=\"center\">\r\n");
      out.write("	<td align=\"center\">\r\n");
      out.write("  		<a href=\"/\">Home</a>\r\n");
      out.write("  		|\r\n");
      out.write("  		<a href=\"\">회사소개</a>\r\n");
      out.write("  		|\r\n");
      out.write("  		<a href=\"\">사업제휴안내</a>\r\n");
      out.write("  		|\r\n");
      out.write("  		<a href=\"\">사원모집</a>\r\n");
      out.write("  		|\r\n");
      out.write("  		<a href=\"personal.html\">개인정보보호정책</a>\r\n");
      out.write("  		|\r\n");
      out.write("  		<a href=\"mailto:\">Webmaster</a>\r\n");
      out.write("  		<br>\r\n");
      out.write("  		Copyright &copy;2003 <font color=\"#FFD14E\"><b>Lisco Co.,Ltd.</b></font> All right reserved.\r\n");
      out.write("	</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</center>\r\n");
      out.write("</body> \r\n");
      out.write("</html> \r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
