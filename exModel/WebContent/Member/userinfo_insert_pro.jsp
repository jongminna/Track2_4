<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="exModel.model.member.*, exModel.util.*" %>
<%
	request.setCharacterEncoding("utf-8");
	MemberVO vo = new MemberVO();
	vo.setName(request.getParameter("name"));
	vo.setUserid(request.getParameter("userid"));
	
	//vo.setPasswd(request.getParameter("passwd"));
	//SHA256 암호화
	String pass = UserSHA256.getSHA256(request.getParameter("passwd"));
	vo.setPasswd(pass);
	
	vo.setGubun(request.getParameter("gubun"));
	vo.setZip(request.getParameter("zip"));
	vo.setAddr1(request.getParameter("addr1"));
	vo.setAddr2(request.getParameter("addr2"));
	vo.setTel(request.getParameter("tel"));
	vo.setEmail(request.getParameter("email"));
	vo.setJob(request.getParameter("job"));
	vo.setIntro(request.getParameter("intro"));
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
		location.href="/Member/userlogin_form.jsp"
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
