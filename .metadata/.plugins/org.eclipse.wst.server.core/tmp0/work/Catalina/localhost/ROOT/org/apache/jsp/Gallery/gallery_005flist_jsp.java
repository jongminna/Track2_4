/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.71
 * Generated at: 2021-10-25 02:31:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Gallery;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gallery_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("<html>\r\n");
      out.write("<head><title>포토 겔러리 목록</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet.css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("  a.list {text-decoration:none;color:black;font-size:10pt;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#FFFFFF\" topmargin=\"0\" leftmargin=\"0\">\r\n");
      out.write("<table border=\"0\" width=\"800\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"20%\" height=\"500\" valign=\"top\" bgcolor=\"#ecf1ef\">\r\n");
      out.write("	<!-- 다음에 추가할 부분 -->\r\n");
      out.write("	</td>\r\n");
      out.write("    <td width=\"80%\" valign=\"top\">	\r\n");
      out.write("    <br>\r\n");
      out.write("    <table border=\"0\" cellspacing=\"1\" width=\"100%\" align=\"center\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td colspan=\"7\" align=\"center\" valign=\"center\" height=\"20\">\r\n");
      out.write("        <font size=\"4\" face=\"돋움\" color=\"blue\">\r\n");
      out.write("        <img src=\"/Gallery/img/bullet-01.gif\"> <b>포토 겔러리</b></font></td></tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td colspan=\"5\" align=\"right\" valign=\"middle\" height=\"20\">\r\n");
      out.write("		<font size=\"2\" face=\"고딕\">전체 : 10</b>건 - 3 Pages</font></td></tr>\r\n");
      out.write("      </tr>\r\n");
      out.write("	  <tr onMouseOver=\"style.backgroundColor='#D1EEEE'\" onMouseOut=\"style.backgroundColor=''\">\r\n");
      out.write("          <td align=\"center\" height=\"25\"><img src=\"/Gallery/img/jsl.jpg\" alt=\"모집사진\"></td>\r\n");
      out.write("          <td align=\"left\" height=\"20\"><font face=\"돋움\" size=\"2\" color=\"#000000\">처음방문입니다</td>\r\n");
      out.write("          <td align=\"center\" height=\"20\"><font face=\"돋움\" size=\"2\">조회수 : 3</font></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("	  <tr onMouseOver=\"style.backgroundColor='#D1EEEE'\" onMouseOut=\"style.backgroundColor=''\">\r\n");
      out.write("          <td align=\"center\" height=\"25\"><img src=\"/Gallery/img/jsl.jpg\" alt=\"모집사진\"></td>\r\n");
      out.write("          <td align=\"left\" height=\"20\"><font face=\"돋움\" size=\"2\" color=\"#000000\">처음방문입니다</td>\r\n");
      out.write("          <td align=\"center\" height=\"20\"><font face=\"돋움\" size=\"2\">조회수 : 3</font></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("     <div align=\"center\">\r\n");
      out.write("        <table width=\"700\" border=\"0\" cellspacing=\"0\" cellpadding=\"5\">\r\n");
      out.write("          <tr>&nbsp;</tr><tr>\r\n");
      out.write("             <td colspan=\"5\">        \r\n");
      out.write("                <div align=\"center\">[1][2][3]</div>\r\n");
      out.write("			  </td>\r\n");
      out.write("			 </tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		\r\n");
      out.write("		<table width=\"700\">\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td width=\"25%\"> &nbsp;</td>\r\n");
      out.write("			<td width=\"50%\" align=\"center\">\r\n");
      out.write("				<table>\r\n");
      out.write("					<form>	\r\n");
      out.write("					<!-- 검색어를 이용하여 글제목, 작성자, 글내용 중에 하나를 입력 받아 처리하기 위한 부분 -->\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td>\r\n");
      out.write("								<select name=\"\">\r\n");
      out.write("									<option value=\"\">글제목</option>\r\n");
      out.write("									<option value=\"\">작성자</option>\r\n");
      out.write("									<option value=\"\">글내용</option>\r\n");
      out.write("								</select>\r\n");
      out.write("							</td>\r\n");
      out.write("							<td> <input type=\"text\" size=20 name=\"\"></td>\r\n");
      out.write("							<td> <a href=\"#\"><img src=\"/Gallery/img/search2.gif\" border=\"0\"></a></td>\r\n");
      out.write("						</tr>\r\n");
      out.write("					</form>\r\n");
      out.write("				</table>\r\n");
      out.write("			</td>\r\n");
      out.write("			<td width=\"25%\" align=\"right\">\r\n");
      out.write("			<a href=\"\"><img src=\"/Gallery/img/write.gif\" border=\"0\"></a>\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("	</table>\r\n");
      out.write("		\r\n");
      out.write("		</div>\r\n");
      out.write("	</body>\r\n");
      out.write("	</html>\r\n");
      out.write("\r\n");
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
