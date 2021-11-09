<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="exModel.model.member.*,exModel.util.*" %>
<%
	request.setCharacterEncoding("utf-8");
%>
	<jsp:useBean id="vo" class="exModel.model.member.MemberVO">
		<jsp:setProperty name="vo" property="*" />
	</jsp:useBean>

<%
	//비번 암호화
	vo.setPasswd(UserSHA256.getSHA256(vo.getPasswd()));

	//관심분야
	String[] farr = request.getParameterValues("fa");
	String favorite="";
	if(farr != null){
		favorite=farr[0];
		for(int x=1; x<farr.length;x++){
			favorite=favorite+","+farr[x];
		}
	}
	vo.setFavorite(favorite);
	
	MemberDAO dao = MemberDAO.getInstance();
	int row=dao.memberWrite(vo);
	if(row==1){
		
%>
	<script>
		alert("등록되었습니다.");
		location.href="/Member/userinfo_list.jsp"
	</script>
<%
	}else{
%>
	<script>
		alert("등록실패");
		history.back();
	</script>
<%
	}
%>
