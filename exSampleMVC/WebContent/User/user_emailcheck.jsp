<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<HTML>
<HEAD>
<TITLE>이메일 인증를 체크합니다.</TITLE>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<STYLE TYPE="text/css">
<!--
body { font-family: 돋움, Verdana; font-size: 9pt}
td   { font-family: 돋움, Verdana; font-size: 9pt; text-decoration: none; color: #000000} 
--->
</STYLE>
<script type="text/javascript">
	
	
	function send(){
		if(email_check.emailcode.value==""){
			alert("인증번호를 입력하세요");
			email_check.emailcode.focus();
			return;
		}
		if(email_check.emailcode.value=='${authNum}'){
			alert("인증되었습니다");
			opener.user.flag=1;
			self.close();
		}else{
			alert("인증번호가 맞지않습니다");
			email_check.emailcode.focus();
			return;
		}
		
		
	}
	function user_close(){
		self.close();	
	}

</script>
</HEAD>
<BODY bgcolor="#FFFFFF">
<TABLE CELLPADDING=0 CELLSPACING=0 BORDER=0 WIDTH=330>
  <TR BGCOLOR=#7AAAD5>
    <td align=left><img src="/Users/img/u_b02.gif"></td>
    <td align=center><FONT COLOR="#FFFFFF"><b>아이디 중복 체크</FONT></td>
    <td align=right><img src="/Users/img/u_b03.gif"></td>
  </tr>
</table>
<TABLE CELLPADDING=0 CELLSPACING=0 BORDER=0 WIDTH=330>
<TR BGCOLOR=#948DCF>
  <TD>
  <form name="email_check" method="post">
    <TABLE CELLPADDING=4 CELLSPACING=1 BORDER=0 WIDTH=330>
  	  <TR BGCOLOR="#FFFFFF">
        <TD ALIGN="center">
    	인증번호를 입력하세요
           <INPUT NAME=emailcode type=text size=16 maxlength=16 value="">
      	   <input type=image src="/Users/img/u_bt08.gif" border=0 vspace=0 onClick="send()">

        </TD>
      </TR>
    </TABLE>
  </form>  
 </TD>
</TR>
</TABLE>

<TABLE CELLPADDING=0 CELLSPACING=0 BORDER=0 WIDTH=330>
  <TR BGCOLOR=#7AAAD5>
    <td align=left><img src="/Users/img/u_b04.gif"></td>
    <td align=right><img src="/Users/img/u_b05.gif"></td>
  </tr>
  <tr>
    <td colspan=3 align=center>
      <img src="/Users/img/u_bt13.gif" border=0 vspace=5 onClick="user_close()">
    </td>
  </tr>
</table>
</BODY>
</HTML>