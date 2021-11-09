<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	int row = (int)request.getAttribute("row");
	if(row==1){
%>
	<script>
		alert("수정되었습니다.");
		location.replace("pds_list.do");
	</script>
<%
	}else{
%>	
	<script>
		alert("수정실패.");
		location.back();
	</script>
<%
	}
%>