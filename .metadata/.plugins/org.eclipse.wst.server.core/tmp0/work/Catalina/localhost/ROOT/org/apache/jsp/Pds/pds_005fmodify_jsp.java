/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.71
 * Generated at: 2021-09-29 02:53:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Pds;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pds_005fmodify_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head><title>자료 등록 수정</title><link rel=\"stylesheet\" type=\"text/css\" href=\"/stylesheet.css\">\r\n");
      out.write("<script>\r\n");
      out.write("	function send(){\r\n");
      out.write("		if(pds.subject.value==\"\"){\r\n");
      out.write("			alert(\"제목을 입려하세요\");\r\n");
      out.write("			pds.subject.focus();\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("		if(pds.contents.value==\"\"){\r\n");
      out.write("			alert(\"내용을 입려하세요\");\r\n");
      out.write("			pds.contents.focus();\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("		if(pds.pass.value==\"\"){\r\n");
      out.write("			alert(\"비밀번호을 입려하세요\");\r\n");
      out.write("			pds.pass.focus();\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("   		var size = pds.filename.files[0].size;\r\n");
      out.write("		if(size>(2*1024*1024)){\r\n");
      out.write("			alert(\"파일용량 초과\");\r\n");
      out.write("			pds.filename.focus();\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("		pds.submit();\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	function redirect(){\r\n");
      out.write("		history.back();\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body topmargin=\"0\" leftmargin=\"0\">\r\n");
      out.write("<table border=\"0\" width=\"800\">\r\n");
      out.write("<tr>\r\n");
      out.write("  <td width=\"20%\" height=\"500\" valign=\"top\" bgcolor=\"#ecf1ef\">\r\n");
      out.write("\r\n");
      out.write("  <!--  로그인 폼 추가부분 -->\r\n");
      out.write("  \r\n");
      out.write("  </td>\r\n");
      out.write("  <td width=\"80%\" valign=\"top\">&nbsp;<br>\r\n");
      out.write("  <img src=\"/Pds/img/bullet-01.gif\"><font size=\"3\" face=\"돋움\" color=\"blue\">\r\n");
      out.write("  <b> 뮤직자료실</b></font><font size=\"2\"> - 자료 수정하기</font><p>\r\n");
      out.write("  <img src=\"/Pds/img/bullet-03.gif\"><font size=\"2\" face=\"돋움\" color=\"orange\"> 잠깐</font> &nbsp;\r\n");
      out.write("  <img src=\"/Pds/img/bullet-02.gif\"><font size=\"2\" face=\"돋움\">는 필수 입력 사항입니다.</font><p>\r\n");
      out.write("  <form name=\"pds\" method=\"post\" enctype=\"multipart/form-data\" action=\"pds_modify.do\">\r\n");
      out.write("   <input type=\"hidden\" name=\"idx\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.idx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("   <input type=\"hidden\" name=\"oldfile\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.filename}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("   <table border=\"0\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td width=\"5%\" align=\"right\"><img src=\"/Pds/img/bullet-02.gif\"></td>\r\n");
      out.write("      <td width=\"15%\"><font size=\"2 face=\"돋움\"\">글쓴이</font></td>\r\n");
      out.write("      <td width=\"80%\"><input type=\"text\" size=\"20\" name=\"name\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td></tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td align=\"right\">&nbsp;</td>\r\n");
      out.write("      <td ><font size=\"2 face=\"돋움\"\">메일주소</font></td>\r\n");
      out.write("      <td><input type=\"text\" size=\"20\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td></tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td align=\"right\"><img src=\"/Pds/img/bullet-02.gif\"></td>\r\n");
      out.write("      <td><font size=\"2\" face=\"돋움\">제목</font></td>\r\n");
      out.write("      <td><input type=\"text\" size=\"60\" name=\"subject\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.subject}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td></tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td align=\"right\"><img src=\"/Pds/img/bullet-02.gif\"></td>\r\n");
      out.write("      <td><font size=\"2\" face=\"돋움\">자료설명</font></td>\r\n");
      out.write("      <td><textarea wrap=\"physical\" rows=\"10\" name=\"contents\" cols=\"60\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.contents}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea></td></tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td align=\"right\"><img src=\"/Pds/img/bullet-02.gif\"></td>\r\n");
      out.write("      <td><font size=\"2\" face=\"돋움\">파일첨부</font></td>\r\n");
      out.write("      <td><input type=\"file\" name=\"filename\" size=\"30\" ></td></tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td align=\"right\"><img src=\"/Pds/img/bullet-02.gif\"></td>\r\n");
      out.write("      <td><font size=\"2\" face=\"돋움\">비밀번호</font></td>\r\n");
      out.write("      <td><input type=\"password\" size=\"10\" name=\"pass\"></td></tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td align=\"right\">&nbsp;</td>\r\n");
      out.write("      <td><font size=\"2\">&nbsp;</font></td>\r\n");
      out.write("      <td><input type=\"button\" value=\"수정하기\" onClick=\"send()\">&nbsp;\r\n");
      out.write("      <input type=\"button\" value=\"돌아가기\" onClick=\"redirect()\"></td></tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
