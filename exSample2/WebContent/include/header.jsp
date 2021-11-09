<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSL 인재 개발원</title>
	<link href="/css/font-awesome.min.css" rel="stylesheet">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
	<link href="/css/common.css" rel="stylesheet">
	<link href="/css/mystyle.css" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>

  <script>
    $(function(){
    	
      $('.slider').bxSlider({
    	  mode: 'fade',
    	  captions: true
      });
      
      $(".sitemap").click(function() {
			$(".sitewrap").slideDown();
		})
	  $("#close").click(function() {
			$(".sitewrap").slideUp();
		})
		
	  $(".nav > nav > .navi > li").hover(function() {
		  $(this).children(".navi2").stop().slideDown();
	  }, function() {
		  $(this).children(".navi2").stop().slideUp();
	  });
		
    });
  </script>

</head>
<body>
	<div class="header">
		<header>
			<div class="topnav">
				<ul>
					<li><a href="/member/login.jsp">로그인</a></li>
					<li><a href="/member/member.jsp">회원가입</a></li>
					<li><a href="javascript:void(0)" class="sitemap">사이트맵</a></li>
				</ul>
			</div>
			<div class="navigation">
				<h1 class="logo"><a href="/index.jsp"><img src="/images/jsl_logo1.png" width="" height="50"></a></h1>
				<div class="nav">
					<nav>
						<ul class="navi">
							<li><a href="/about/about.jsp">내소개</a>
								<ul class="navi2">
									<li><a href="#">이력서</a></li>
									<li><a href="#">자기소개서</a></li>
									<li><a href="#">자격증</a></li>
								</ul>
							</li>
							<li><a href="/gallery/gallery.jsp">갤러리</a>
								<ul class="navi2">
									<li><a href="#">포토샵</a></li>
									<li><a href="#">일러스트</a></li>
									<li><a href="#">개인작품</a></li>
									<li><a href="#">웹갤러리</a></li>
								</ul>
							</li>
							<li><a href="/portfolio/portfolio.jsp">포트폴리오</a>
								<ul class="navi2">
									<li><a href="#">앱개발</a></li>
									<li><a href="#">웹개발</a></li>
									<li><a href="#">UI디자인</a></li>
								</ul>
							</li>
							<li><a href="/qa/qa.jsp">질문답변</a>
								<ul class="navi2">
									<li><a href="#">JAVA</a></li>
									<li><a href="#">DB</a></li>
									<li><a href="#">JSP</a></li>
									<li><a href="#">PHP</a></li>
								</ul>
							</li>
							<li><a href="/notice/notice.jsp">공지사항</a></li>
							<li><a href="/shop/shop.jsp">쇼핑몰</a></li>
						</ul>
					</nav>
				</div>
			</div>
		</header>
	</div>

	<div class="line"></div>
	
	<div class="sitewrap">
		<span class="fa fa-close" id="close" style="cursor:pointer"></span>
		<div class="inner">
			<span class="map">내소개</span>
			<span class="map">갤러리</span>
			<span class="map">포트폴리오</span>
			<span class="map">질문답변</span>
			<span class="map">공지사항</span>
			<span class="map">쇼핑몰</span>
		</div>
	</div>

</body>
</html>	