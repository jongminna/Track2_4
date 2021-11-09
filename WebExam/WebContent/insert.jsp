<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSL 인재 개발원</title>
<style type="text/css">
	*{margin:0; padding:0;}
	ul,li {list-style:none;}
	a {text-decoration:none; color:#fff;}
	.logo {color:#fff; text-align:center; background-color:#0040FF; padding:16px 0;}
	.nav{padding:12px 0; overflow:hidden;background-color:#BCA9F5;}
	.nav ul,li{float:left; padding:0 20px; text-align:center;}
	.content {background-color:#E6E6E6; padding:16px; height:300px;}
	.title {text-align:center;padding:22px;}
	.content table{ width:500px;margin:0 auto;}
	.content table th, td{border:1px solid #bbb;}
	.content table .btn_group {text-align:center;}
	.footer {padding:16px 0; text-align:center; background-color:#0040FF;}
</style>
</head>
<body>
	<div class="header">
		<header>
			<h1 class="logo"> JSL 인재 개발원  </h1>
			<div class="nav">
				<nav>
					<ul class="navi">
						<li><a href="">[홈으로]</a></li>
						<li><a href="">[회원가입]</a></li>
						<li><a href="">[자유게시판]</a></li>
						<li><a href="">[자료실]</a></li>
						<li><a href="">[포토겔러리]</a></li>
						<li><a href="">[로그인]/[xxx 님](로그아웃)</a></li>
					</ul>
				</nav>			
			</div>
		</header>
	</div>
	<div class="section">
		<section>
			<div class="content">
				<h2 class="title"> 자유게 시판 </h2>
			<form>
				<table>
					<tr>
						<th>작성자</th>
						<td><input type="text" name=""></td>
					</tr>
					<tr>
						<th>이메일</th>
						<td><input type="text" name=""></td>
					</tr>
					<tr>
						<th>제목</th>
						<td><input type="text" name=""></td>
					</tr>
					<tr>
						<th>내용</th>
						<td><input type="text" name=""></td>
					</tr>
					<tr>
						<th>비밀번호</th>
						<td><input type="text" name=""></td>
					</tr>
					<tr>
						<td colspan="2" class="btn_group"><input type="submit" value="등록"> <input type="button" value="조회" onClick="location.href='list.html'"></td>
					</tr>
				</table>
			</form>
			</div>
		</section>
	</div>
	<div class="footer">
		<footer>
			<p>제이에스엘인재개발원주식회사 
			(대전센터)대전광역시 중구 계룡로 825 (용두동, 희영빌딩) 5층, 7층/ 고객센터: 042-242-4412
Copyright 제이에스엘인재개발원주식회사. All rights reserved.</p>
		</footer>
	</div>
</body>
</html>    