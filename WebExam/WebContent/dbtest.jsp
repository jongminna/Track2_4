<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="WebExam.util.*, java.sql.*" %>

<%
	Connection conn = DBManager.getConnection();
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	커넥션 정보 : <%= conn %>
</body>
</html>