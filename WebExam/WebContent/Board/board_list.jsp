<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="/Include/header.jsp" %>

	<div class="section">
		<section>
		<div class="content">
			<h2 class="title"> 자유게시판 </h2>
			
				<table>
					<tr>
						<th>글번호</th>
						<th>글제목</th>
						<th>작성자</th>
						<th>작성일자</th>
						<th>조회수</th>
					</tr>
					<tr class="text_center">
						<td class="white">10001</td>
						<td>안녕하세요</td>
						<td>김학생</td>
						<td>2021-07-28</td>
						<td>3</td>
					</tr>
				</table>
				<table style="text-align:center;">
					<tr>
						<td>
							[1][2][3]
						</td>
					</tr>
				</table>
							
				<table style="text-align:center">
					<tr>
						<td><select name="search">
								<option>작성자</option>
								<option>제목</option>
								<option>내용</option>
							</select>
							<input type="text" name="key" value="">
							<input type="button" value="검색">
							<input type="button" value="글쓰기">
						</td>
						
					</tr>
				</table>
							
		</div>
		</section>
	</div>

<%@ include file="/Include/footer.jsp" %>    