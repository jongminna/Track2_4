<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userid = request.getParameter("userid");
	int result=0;
	if(result==1){
		//out.print("중복된 아이디");
		out.print(result);
	}else{
		//out.print("사용가능한 아이디");
		out.print(result);
	}
%>
