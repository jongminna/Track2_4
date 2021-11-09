<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.util.*, java.sql.*" %>
<%
	Connection conn = DBManager.getConnection();

	out.print("커넥션 테스트 :" +conn);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>