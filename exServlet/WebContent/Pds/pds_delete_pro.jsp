<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	int row = (int)request.getAttribute("row");
	if(row==1){
%>
	<script>
		alert("삭제되었습니다.");
		location.replace("pds_list.do");
	</script>
<%
	}else{
%>	
	<script>
		alert("비번오류");
		location.back();
	</script>
<%
	}
%>