/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.71
 * Generated at: 2021-09-27 03:22:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import exServlet.model.member.*;

public final class userinfo_005fmodify_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("exServlet.model.member");
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

	MemberVO vo = (MemberVO)request.getAttribute("vo");

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>회원등록</title>\r\n");
      out.write("<STYLE TYPE=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body { font-family: 돋움, Verdana; font-size: 9pt}\r\n");
      out.write("td   { font-family: 돋움, Verdana; font-size: 9pt; text-decoration: none; color: #000000; BACKGROUND-POSITION: left top; BACKGROUND-REPEAT: no-repeat;}\r\n");
      out.write("-->\r\n");
      out.write(".formbox {\r\n");
      out.write("	BACKGROUND-COLOR: #F0F0F0; FONT-FAMILY: \"Verdana\", \"Arial\", \"Helvetica\", \"돋움\"; FONT-SIZE:9pt\r\n");
      out.write("} \r\n");
      out.write("--->\r\n");
      out.write("</STYLE>\r\n");
      out.write("<script>\r\n");
      out.write("	//아이디 중북검사\r\n");
      out.write("	function id_check(){\r\n");
      out.write("		url=\"id_check.do\";\r\n");
      out.write("		window.open(url,\"ID 중복검사\",\"width=350 height=250\");\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	//우편번호 검색\r\n");
      out.write("	function post_check(){\r\n");
      out.write("		url=\"post_check.do\";\r\n");
      out.write("		window.open(url,\"우편번호검색\",\"width=350 height=250 scrollbars=yes\");		\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	//입력폼 검사\r\n");
      out.write("	function send(){\r\n");
      out.write("		var tel = \"\";\r\n");
      out.write("		var zip = \"\";\r\n");
      out.write("		var form = document.member;\r\n");
      out.write("		\r\n");
      out.write("		if(form.name.value==\"\"){\r\n");
      out.write("			alert(\"회원 성명을 입력하세요.\");\r\n");
      out.write("			form.name.focus();\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		if(form.userid.value==\"\"){\r\n");
      out.write("			alert(\"회원ID를 입력하세요.\");\r\n");
      out.write("			form.userid.focus();\r\n");
      out.write("			return;\r\n");
      out.write("		}else if(form.userid.value.length < 5){\r\n");
      out.write("			alert(\"회원ID는 5자 이상 입력하셔야 합니다.\");\r\n");
      out.write("			form.userid.focus();\r\n");
      out.write("			return;\r\n");
      out.write("		}else if(!a_or_d(form.userid.value)){\r\n");
      out.write("			alert(\"회원ID는 영문이나 숫자로 입력하셔야 합니다.\");\r\n");
      out.write("			form.userid.focus();\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		if(form.passwd.value==\"\"){\r\n");
      out.write("			alert(\"비밀번호를 입력하세요.\");\r\n");
      out.write("			form.passwd.focus();\r\n");
      out.write("			return;\r\n");
      out.write("		}else if(form.passwd.value.length < 5){\r\n");
      out.write("			alert(\"비밀번호는 4자 이상 입력하셔야 합니다.\");\r\n");
      out.write("			form.passwd.focus();\r\n");
      out.write("			return;\r\n");
      out.write("		}else if(!a_or_d(form.passwd.value)){\r\n");
      out.write("			alert(\"비밀번호는 영문이나 숫자로 입력하셔야 합니다.\");\r\n");
      out.write("			form.passwd.focus();\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("			\r\n");
      out.write("		if(form.passwd.value != form.repasswd.value){\r\n");
      out.write("			alert(\"비밀번호와 비밀번호확인의 값이 서로 같지 않습니다.\");\r\n");
      out.write("			form.repasswd.focus();\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("	//전화번호 체크\r\n");
      out.write("		var tel = form.tel.value\r\n");
      out.write("		if(tel==\"\"){\r\n");
      out.write("			alert(\"Tel Check\");\r\n");
      out.write("			form.tel.focus();\r\n");
      out.write("			return\r\n");
      out.write("		}else if(!tel_check(tel)){\r\n");
      out.write("			alert(\"전화번호형식오류 \");\r\n");
      out.write("		    form.tel.focus();\r\n");
      out.write("		    return ;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		//이메일 유효성 검사\r\n");
      out.write("		var email = form.email.value;\r\n");
      out.write("		if(email==\"\"){\r\n");
      out.write("			alert(\"Email 입력하세요\");\r\n");
      out.write("			form.email.focus();\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("/*		else if(!email_check(email)){\r\n");
      out.write("			alert(\"Email 형식오류 \");\r\n");
      out.write("		    form.email.focus();\r\n");
      out.write("		    return;\r\n");
      out.write("		}\r\n");
      out.write("*/\r\n");
      out.write("		//관심분야 1개 이상 체크\r\n");
      out.write("		var sw=0;\r\n");
      out.write("		for(var s=0;s<form.fa.length;s++){\r\n");
      out.write("			if(form.fa[s].checked){\r\n");
      out.write("				sw=1;\r\n");
      out.write("				break;\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		if(sw==0){\r\n");
      out.write("			alert(\"관심분야는 한개이상 선택\");\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		// 직업선택\r\n");
      out.write("		if(form.job.selectedIndex ==0 ){\r\n");
      out.write("			alert(\"직업을 선택하세요.\");\r\n");
      out.write("			form.job.focus();\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("		form.submit();\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	//입력시 사용된 문자검사(영문자, 숫자 이외의 다른 문자 사용 여부 검사)\r\n");
      out.write("	function a_or_d(str){\r\n");
      out.write("		lower_str = str.toLowerCase();\r\n");
      out.write("		\r\n");
      out.write("		for(i=0; i<lower_str.length; i++){\r\n");
      out.write("			ch = lower_str.charAt(i);\r\n");
      out.write("			if(((ch < 'a') || (ch > 'z')) && ((ch < '0') ||(ch > '9')))\r\n");
      out.write("				return 0;\r\n");
      out.write("		}\r\n");
      out.write("		return 1;\r\n");
      out.write("	}	\r\n");
      out.write("	//전화번호의 유효성 검사\r\n");
      out.write("	function tel_check(str){\r\n");
      out.write("		/*\r\n");
      out.write("		   전화번호 유효성 체크\r\n");
      out.write("		   010-xxxx-xxxx 또는  010xxxxxxxx\r\n");
      out.write("		  성공이면 true 실패이면 false\r\n");
      out.write("		*/\r\n");
      out.write("		str=str.split('-').join('');\r\n");
      out.write("		var phone=/^((01[1|6|7|8|9])[1-9]+[0-9]{6,7})|(010[1-9][0-9]{7})$/;\r\n");
      out.write("		return phone.test(str);\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"#FFFFFF\" LEFTMARGIN=0  TOPMARGIN=0 >\r\n");
      out.write(" \r\n");
      out.write(" <!-- 탑 메뉴 영역 삽입-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table border=\"0\" width=\"800\">\r\n");
      out.write("<tr>\r\n");
      out.write("  <td width=\"20%\"  bgcolor=\"#ecf1ef\" valign=\"top\" style=\"padding-left:0;\">\r\n");
      out.write("	\r\n");
      out.write("	<!--로그인 영역 삽입-->\r\n");
      out.write("\r\n");
      out.write("  </td>\r\n");
      out.write("  <td width=\"80%\" valign=\"top\">&nbsp;<img src=\"/Member/img/title1.gif\" ><br>    \r\n");
      out.write("	<form name=\"member\" method=\"post\" action=\"userinfo_insert.do\">\r\n");
      out.write("	<table border=0 cellpadding=0 cellspacing=0 border=0 width=730 valign=top>\r\n");
      out.write("		<tr><td align=center><br>                            \r\n");
      out.write("			<table cellpadding=0 cellspacing=0 border=0 width=650 align=center>       \r\n");
      out.write("				<tr>\r\n");
      out.write("					<td bgcolor=\"#7AAAD5\">            \r\n");
      out.write("						<table cellpadding=0 cellspacing=0 border=0 width=100%>\r\n");
      out.write("							<tr bgcolor=#7AAAD5>\r\n");
      out.write("								<td align=left BORDER=\"0\" HSPACE=\"0\" VSPACE=\"0\"><img src=\"/Member/img/u_b02.gif\"></td>\r\n");
      out.write("								<td align=center bgcolor=\"#7AAAD5\"><FONT COLOR=\"#FFFFFF\"><b>사용자수정&nbsp;</b><font color=black>(</font><font color=red>&nbsp;*&nbsp;</font><font color=black>표시항목은 반드시 입력하십시요.)</font></FONT></td>\r\n");
      out.write("								<td align=right BORDER=\"0\" HSPACE=\"0\" VSPACE=\"0\"><img src=\"/Member/img/u_b03.gif\"></td>\r\n");
      out.write("							</tr>\r\n");
      out.write("						</table>\r\n");
      out.write("						<table cellpadding=3 cellspacing=1 border=0 width=100%>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td width=110 bgcolor=#EFF4F8>&nbsp;회원 성명<font color=red>&nbsp;*</font></td>\r\n");
      out.write("								<TD BGCOLOR=WHITE>\r\n");
      out.write("									<input type=text name=name size=16 maxlength=20 value=\"");
      out.print( vo.getName() );
      out.write("\">성명은 빈칸없이 입력하세요.\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<TD BGCOLOR=\"#EFF4F8\">&nbsp;회원 ID<font color=red>&nbsp;*</font></td>\r\n");
      out.write("								<TD BGCOLOR=WHITE>\r\n");
      out.write("									<table cellspacing=0 cellpadding=0>\r\n");
      out.write("										<tr>\r\n");
      out.write("											<td align=absmiddle>\r\n");
      out.write("												<input type=text name=userid size=12 maxlength=16 readonly value=\"");
      out.print( vo.getUserid() );
      out.write("\" style=\"width:120\">\r\n");
      out.write("											</td>\r\n");
      out.write("											<td><a href=\"javascript:id_check()\"><img src=\"Member/img/u_bt01.gif\" hspace=2 border=0 name=img1  align=absmiddle></a>\r\n");
      out.write("                   										5~16자 이내의 영문이나 숫자만 가능합니다.\r\n");
      out.write("                  							</td>\r\n");
      out.write("										</tr>\r\n");
      out.write("									</table>\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<TD BGCOLOR=\"#EFF4F8\">&nbsp;비밀번호<font color=red>&nbsp;*</font></td>\r\n");
      out.write("								<TD BGCOLOR=WHITE>\r\n");
      out.write("									<input type=password name=passwd size=8 maxlength=12 style=\"width:80\">\r\n");
      out.write("											6~12자 이내의 영문이나 숫자만 가능합니다.\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<TD BGCOLOR=\"#EFF4F8\">&nbsp;비밀번호확인<font color=red>&nbsp;*</font></td>\r\n");
      out.write("								<TD BGCOLOR=WHITE><input type=password name=repasswd size=8 maxlength=12 value=\"\" style=\"width:80\">비밀번호 확인을 위해서 비밀번호를 한번 더 입력해주세요. </td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<TD BGCOLOR=\"#EFF4F8\">&nbsp;주소구분<font color=red>&nbsp;</font></td>\r\n");
      out.write("								<TD BGCOLOR=WHITE>\r\n");
      out.write("									<input type=radio name=gubun value=\"1\" ");
 if(vo.getGubun().equals("1")){ 
      out.write(" checked ");
 } 
      out.write(">직장&nbsp;&nbsp;\r\n");
      out.write("									<input type=radio name=gubun value=\"2\" ");
 if(vo.getGubun().equals("2")){ 
      out.write(" checked ");
 } 
      out.write(">자택 \r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							\r\n");
      out.write("							<tr>\r\n");
      out.write("								<TD BGCOLOR=\"#EFF4F8\">&nbsp;우편번호<font color=red>&nbsp;</font></td>\r\n");
      out.write("								<TD BGCOLOR=WHITE>\r\n");
      out.write("									<table cellspacing=0 cellpadding=0>\r\n");
      out.write("										<tr>\r\n");
      out.write("											<td><input type=text name=zip size=6 readonly maxlength=6 value=\"");
      out.print( vo.getZip() );
      out.write("\"></td>\r\n");
      out.write("                  							<td><a href=\"javascript:post_check()\"><img src=\"/Member/img/u_bt07.gif\" hspace=2 border=0 name=img2 align=absmiddle></a></td>\r\n");
      out.write("										</tr>\r\n");
      out.write("									</table>\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<TD BGCOLOR=\"#EFF4F8\">&nbsp;주소<font color=red>&nbsp;</font></td>\r\n");
      out.write("								<TD BGCOLOR=WHITE>\r\n");
      out.write("									<input type=text name=addr1 size=50 maxlength=100 value=\"");
      out.print( vo.getAddr1() );
      out.write("\">\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<TD BGCOLOR=\"#EFF4F8\">&nbsp;나머지 주소<font color=red>&nbsp;</font></td>\r\n");
      out.write("								<TD BGCOLOR=WHITE>\r\n");
      out.write("									<input type=text name=addr2 size=50 maxlength=100 value=\"");
      out.print( vo.getAddr2() );
      out.write("\">\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<TD BGCOLOR=\"#EFF4F8\">&nbsp;전화번호<font color=red>&nbsp;*</font></td>\r\n");
      out.write("								<TD BGCOLOR=WHITE>\r\n");
      out.write("									<input type=text name=tel size=13 maxlength=13 value=\"");
      out.print( vo.getTel() );
      out.write("\">\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<TD BGCOLOR=\"#EFF4F8\">&nbsp;E-mail<font color=red>&nbsp;*</font>\r\n");
      out.write("								</td>\r\n");
      out.write("								<td bgcolor=WHITE valign=middle>\r\n");
      out.write("									<input type=text name=email size=30 maxlength=30 value=\"");
      out.print( vo.getEmail() );
      out.write("\">\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<TD BGCOLOR=\"#EFF4F8\">&nbsp;관심분야\r\n");
      out.write("                					<font color=red>&nbsp;</font>\r\n");
      out.write("								</td>\r\n");
      out.write("								<td bgcolor=WHITE valign=middle> \r\n");
      out.write("									<input type=\"checkbox\" name=\"fa\" value=\"건강\" ");
 if(vo.getFavorite().contains("건강")){ 
      out.write(" checked ");
 } 
      out.write(">건강 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("									<input type=\"checkbox\" name=\"fa\" value=\"문화예술\" ");
 if(vo.getFavorite().contains("문화예술")){ 
      out.write(" checked ");
 } 
      out.write(">문화예술 &nbsp;&nbsp;\r\n");
      out.write("									<input type=\"checkbox\" name=\"fa\" value=\"경제\" ");
 if(vo.getFavorite().contains("경제")){ 
      out.write(" checked ");
 } 
      out.write(">경제 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("									<input type=\"checkbox\" name=\"fa\" value=\"연예오락\" ");
 if(vo.getFavorite().contains("연예오락")){ 
      out.write(" checked ");
 } 
      out.write(">연예오락 &nbsp;\r\n");
      out.write("									<input type=\"checkbox\" name=\"fa\" value=\"뉴스\" ");
 if(vo.getFavorite().contains("뉴스")){ 
      out.write(" checked ");
 } 
      out.write(">뉴스\r\n");
      out.write("									<br><input type=\"checkbox\" name=\"fa\" value=\"여행레져\" ");
 if(vo.getFavorite().contains("여행레져")){ 
      out.write(" checked ");
 } 
      out.write(">여행레져 &nbsp;&nbsp;\r\n");
      out.write("									<input type=\"checkbox\" name=\"fa\" value=\"생활\" ");
 if(vo.getFavorite().contains("생활")){ 
      out.write(" checked ");
 } 
      out.write(">생활 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("									<input type=\"checkbox\" name=\"fa\" value=\"스포츠\" ");
 if(vo.getFavorite().contains("스포츠")){ 
      out.write(" checked ");
 } 
      out.write(">스포츠 &nbsp;&nbsp;\r\n");
      out.write("									<input type=\"checkbox\" name=\"fa\" value=\"교육\" ");
 if(vo.getFavorite().contains("교육")){ 
      out.write(" checked ");
 } 
      out.write(">교육 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("									<input type=\"checkbox\" name=\"fa\" value=\"컴퓨터\" ");
 if(vo.getFavorite().contains("컴퓨터")){ 
      out.write(" checked ");
 } 
      out.write(">컴퓨터 &nbsp;&nbsp;\r\n");
      out.write("									<input type=\"checkbox\" name=\"fa\" value=\"학문\" ");
 if(vo.getFavorite().contains("학문")){ 
      out.write(" checked ");
 } 
      out.write(">학문 &nbsp;&nbsp;\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<TD BGCOLOR=\"#EFF4F8\">&nbsp;직업<font color=red>&nbsp;</font></td>\r\n");
      out.write("								<TD BGCOLOR=WHITE>\r\n");
      out.write("									<select name=job class=\"formbox\">\r\n");
      out.write(" 										<option value=\"0\">선택하세요 ---\r\n");
      out.write(" 										<option value=\"회사원\" ");
 if(vo.getJob().equals("회사원")){ 
      out.write(" selected ");
 } 
      out.write(">회사원\r\n");
      out.write(" 										<option value=\"연구전문직\" ");
 if(vo.getJob().equals("연구전문직")){ 
      out.write(" selected ");
 } 
      out.write(">연구전문직\r\n");
      out.write(" 										<option value=\"교수학생\" ");
 if(vo.getJob().equals("교수학생")){ 
      out.write(" selected ");
 } 
      out.write(">교수학생\r\n");
      out.write(" 										<option value=\"일반자영업\" ");
 if(vo.getJob().equals("일반자영어")){ 
      out.write(" selected ");
 } 
      out.write(">일반자영업\r\n");
      out.write(" 										<option value=\"공무원\" ");
 if(vo.getJob().equals("공무원")){ 
      out.write(" selected ");
 } 
      out.write(">공무원\r\n");
      out.write(" 										<option value=\"의료인\" ");
 if(vo.getJob().equals("의료인")){ 
      out.write(" selected ");
 } 
      out.write(">의료인\r\n");
      out.write(" 										<option value=\"법조인\" ");
 if(vo.getJob().equals("법조인")){ 
      out.write(" selected ");
 } 
      out.write(">법조인\r\n");
      out.write(" 										<option value=\"종교,언론,에술인\" ");
 if(vo.getJob().equals("종교,언론,에술인")){ 
      out.write(" selected ");
 } 
      out.write(">종교.언론/예술인\r\n");
      out.write(" 										<option value=\"농,축,수산,광업인\" ");
 if(vo.getJob().equals("농,축,수산,광업인")){ 
      out.write(" selected ");
 } 
      out.write(">농/축/수산/광업인\r\n");
      out.write(" 										<option value=\"주부\" ");
 if(vo.getJob().equals("주부")){ 
      out.write(" selected ");
 } 
      out.write(">주부\r\n");
      out.write(" 										<option value=\"무직\" ");
 if(vo.getJob().equals("무직")){ 
      out.write(" selected ");
 } 
      out.write(">무직\r\n");
      out.write(" 										<option value=\"기타\" ");
 if(vo.getJob().equals("기타")){ 
      out.write(" selected ");
 } 
      out.write(">기타\r\n");
      out.write("									</select>\r\n");
      out.write("								</td>                \r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<TD BGCOLOR=\"#EFF4F8\">&nbsp;자기소개<font color=red>&nbsp;</font></td>\r\n");
      out.write("								<TD BGCOLOR=WHITE>\r\n");
      out.write("									<textarea cols=65 rows=5 name=\"intro\"></textarea>\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("						</table>\r\n");
      out.write("						<table cellpadding=0 cellspacing=0 border=0 width=100%>\r\n");
      out.write("							<tr bgcolor=#7AAAD5>\r\n");
      out.write("								<td valign=bottom>\r\n");
      out.write("									<img src=\"/Member/img/u_b04.gif\" align=left hspace=0 vspace=0 border=0>\r\n");
      out.write("								</td>\r\n");
      out.write("								<td align=center></td>\r\n");
      out.write("								<td valign=bottom>\r\n");
      out.write("									<img src=\"/Member/img/u_b05.gif\" align=right hspace=0 vspace=0 border=0>\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr bgcolor=#ffffff>\r\n");
      out.write("								<td colspan=3 align=center>\r\n");
      out.write("									<a href=\"javascript:send()\"><img src=\"/Member/img/u_bt06.gif\" vspace=3 border=0 name=img3></a>\r\n");
      out.write("									<a href=\"javascript:history.back()\"><img src=\"/Member/img/u_bt05.gif\" border=0 hspace=10 vspace=3 name=img4></a>\r\n");
      out.write("								</td>\r\n");
      out.write("							 </tr>\r\n");
      out.write("						</table> \r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("	</table>\r\n");
      out.write("	</form>\r\n");
      out.write("	</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write(" <!-- copyright 영역 삽입-->\r\n");
      out.write("  \r\n");
      out.write("\r\n");
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
