/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.71
 * Generated at: 2021-10-21 00:42:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Guest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class guest_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/Include/topmenu.jsp", Long.valueOf(1634692408729L));
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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
      out.write("       <font style=\"font-size:9pt;color:white;font-family:??????\"><b>Total 136,489\r\n");
      out.write("       <font color=\"yellow\"></font>\r\n");
      out.write("       | Now 178\r\n");
      out.write("       <font color=\"yellow\"></font>\r\n");
      out.write("       </b></font>\r\n");
      out.write("     </td>\r\n");
      out.write("     <td bgcolor=\"#9966ff\" width=\"10%\" height=\"25\" onmouseover=\"style.backgroundColor='#2772D3'\" onmouseout=\"style.backgroundColor=''\">\r\n");
      out.write("     <p align=\"center\"><font color=\"white\" size=\"2\"><b><a href=\"/Users/user_login.jsp\" class=\"white\">?????????</A></b></font></p>\r\n");
      out.write("     <p align=\"center\"><font color=\"white\" size=\"2\"><b><a href=\"\" class=\"white\">????????????</A></b></font></p>\r\n");
      out.write("     </td>\r\n");
      out.write("     <td bgcolor=\"#9966ff\" width=\"10%\" onmouseover=\"style.backgroundColor='#2772D3'\" onmouseout=\"style.backgroundColor=''\">\r\n");
      out.write("     <p align=\"center\"><font color=\"white\" size=\"2\"><b><a href=\"/Users/user_insert.jsp\" class=\"white\">????????????</a></b></font></p>\r\n");
      out.write("     <p align=\"center\"><font color=\"white\" size=\"2\"><b><a href=\"/Users/user_modify.jsp\" class=\"white\">????????????</a></b></font></p>\r\n");
      out.write("     </td>\r\n");
      out.write("     <td bgcolor=\"#9966ff\" width=\"10%\" onmouseover=\"style.backgroundColor='#2772D3'\" onmouseout=\"style.backgroundColor=''\">\r\n");
      out.write("     <p align=\"center\"><font color=\"white\" size=\"2\"><b><a href=\"/Notice?cmd=notice_list\" class=\"white\">????????????</a></b></font></p>\r\n");
      out.write("     </td>\r\n");
      out.write("     <td bgcolor=\"#9966ff\" width=\"10%\" onmouseover=\"style.backgroundColor='#2772D3'\" onmouseout=\"style.backgroundColor=''\">\r\n");
      out.write("     <p align=\"center\"><font color=\"white\" size=\"2\"><b><a href=\"/Board/board_list.jsp\" class=\"white\">?????????</a></b></font></p>\r\n");
      out.write("     </td>\r\n");
      out.write("     <td bgcolor=\"#9966ff\" width=\"10%\" onmouseover=\"style.backgroundColor='#2772D3'\" onmouseout=\"style.backgroundColor=''\">\r\n");
      out.write("     <p align=\"center\"><font color=\"white\" size=\"2\"><b><a href=\"/Pds/pds_list.jsp\" class=\"white\">?????????</a></b></font></p>\r\n");
      out.write("     </td>\r\n");
      out.write("     <td bgcolor=\"#9966ff\" width=\"10%\" onmouseover=\"style.backgroundColor='#2772D3'\" onmouseout=\"style.backgroundColor=''\">\r\n");
      out.write("     <p align=\"center\"><font color=\"white\" size=\"2\"><b><a href=\"/Guest?cmd=guest_list\" class=\"white\">?????????</a></b></font></p>\r\n");
      out.write("     </td>\r\n");
      out.write("     <td bgcolor=\"#9966ff\" width=\"10%\" onmouseover=\"style.backgroundColor='#2772D3'\" onmouseout=\"style.backgroundColor=''\">\r\n");
      out.write("     <p align=\"center\"><font color=\"white\" size=\"2\"><b>?????????</b></font></p>\r\n");
      out.write("     </td>\r\n");
      out.write("     <td bgcolor=\"#9966ff\" width=\"10%\" onmouseover=\"style.backgroundColor='#2772D3'\" onmouseout=\"style.backgroundColor=''\">\r\n");
      out.write("     <p align=\"center\"><font color=\"white\" size=\"2\"><b><a href=\"/Admin/admin_login.jsp\" class=\"white\">?????????</a></b></font></p>\r\n");
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
      out.write("         <option value=\"??????\">????????????\r\n");
      out.write("         <option value=\"??????\">?????????\r\n");
      out.write("         <option value=\"??????\">?????????\r\n");
      out.write("         <option value=\"??????\">?????????\r\n");
      out.write("       </Select>\r\n");
      out.write("       <Select name=\"item\" size=\"1\">\r\n");
      out.write("         <option value=\"name\">?????????\r\n");
      out.write("         <option value=\"subject\">??????\r\n");
      out.write("         <option value=\"contents\">??????\r\n");
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
      out.write(" <html>\r\n");
      out.write(" <head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\">\r\n");
      out.write("   <title>????????? ?????? ??????</title>\r\n");
      out.write("   <link rel=\"stylesheet\" type=\"text/css\" href=\"/stylesheet.css\">\r\n");
      out.write("   <style type=\"text/css\">\r\n");
      out.write("     td.title { padding:4px; background-color:#e3e9ff }\r\n");
      out.write("     td.content { padding:10px; line-height:1.6em; text-align:justify; }\r\n");
      out.write("     a.list { text-decoration:none;color:black;font-size:10pt; }\r\n");
      out.write("   </style>\r\n");
      out.write(" <script language=\"javascript\">\r\n");
      out.write("\r\n");
      out.write(" function guest_del(idx) {\r\n");
      out.write("\r\n");
      out.write("//	 var urlString;\r\n");
      out.write("//   urlString = \"/Guest?cmd=guest_delete&idx=\"+idx ;\r\n");
      out.write("//    window.open(urlString, \"del_list\",\" resizable=no,x=150,y=150,width=300,height=170\");\r\n");
      out.write("	bool = confirm('????????????????')\r\n");
      out.write("	if(bool==true){\r\n");
      out.write("		location.href=\"/Guest?cmd=guest_delete&idx=\"+idx ;\r\n");
      out.write("	}else{\r\n");
      out.write("		return;\r\n");
      out.write("	}\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" </script>\r\n");
      out.write(" </head>\r\n");
      out.write(" <body topmargin=\"0\" leftmargin=\"0\">\r\n");
      out.write("   <table border=\"0\" width=\"800\">\r\n");
      out.write("     <tr>\r\n");
      out.write("       <td width=\"20%\"  height=\"500\" bgcolor=\"#ecf1ef\" valign=\"top\">\r\n");
      out.write("\r\n");
      out.write("		 <!--  ????????? ????????? ?????? -->\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/Include/login_form.jsp", out, false);
      out.write(" \r\n");
      out.write("	   </td>\r\n");
      out.write("       <td width=\"80%\" valign=\"top\">&nbsp;<br>\r\n");
      out.write("         <table border=\"0\" width=\"90%\" align=\"center\">\r\n");
      out.write("           <tr>\r\n");
      out.write("             <td colspan=\"2\"><img src=\"/Guest/img/bullet-01.gif\"> \r\n");
      out.write("              <font color=\"blue\" size=\"3\">??? ??? ???</font><font size=\"2\"> - ?????????</font></td>\r\n");
      out.write("           </tr>\r\n");
      out.write("         </table>\r\n");
      out.write("       <p>\r\n");
      out.write("       <table border=\"0\" width=\"90%\" align=\"center\" cellspacing=\"0\"  style=\"border-width:1px;border-color:#0066cc;border-style:outset;\">\r\n");
      out.write("         <tr bgcolor=\"e3e9ff\">\r\n");
      out.write("           <td class=\"title\">\r\n");
      out.write("             <img src=\"/Guest/img/bullet-04.gif\"> <font size=\"2\" face=\"??????\">\r\n");
      out.write("                  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.subject}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</font>\r\n");
      out.write("           </td>\r\n");
      out.write("         </tr>\r\n");
      out.write("         <tr>\r\n");
      out.write("           <td class=\"content\">\r\n");
      out.write("             <p align=\"right\"><font size=\"2\" face=\"??????\">\r\n");
      out.write("              ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("  / <font size=\"2\" face=\"??????\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.regdate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write('/');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.readcnt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("??? ??????</font>\r\n");
      out.write("             <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.contents}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<p>\r\n");
      out.write("           </td>\r\n");
      out.write("         </tr>\r\n");
      out.write("       </table>\r\n");
      out.write("\r\n");
      out.write("      <!--**** ??????????????? ????????? ?????? ???????????? ???????????? ????????????. ??????, ??????, ??????, ???????????? ****-->\r\n");
      out.write("      <p align=\"center\">\r\n");
      out.write("      <font size=\"2\">\r\n");
      out.write("       <!-- ???????????? -->\r\n");
      out.write("       <a href=\"/Guest?cmd=guest_list\"><img src=\"/Guest/img/list-2.gif\" border=\"0\"></a>&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("       <!-- ?????? -->\r\n");
      out.write("       <a href=\"/Guest?cmd=guest_modify&idx=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.idx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"><img src=\"/Guest/img/edit.gif\" border=\"0\"></a>&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("       <!-- ?????? -->\r\n");
      out.write("       <a href=\"javascript:guest_del(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.idx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(")\"><img src=\"/Guest/img/del.gif\" border=\"0\"></a>&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("      </font>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  </body>\r\n");
      out.write("  </html>\r\n");
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
