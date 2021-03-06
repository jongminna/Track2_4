<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="/include/header.jsp"%>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script>
$(function(){
	// input에 입력된 값에 변화가 있을 시
	// alert로 입력된 값 출력
	$("input[name='userid']").on("change",function(){
		var userid=$('#userid').val();
		alert("userid :" + userid);
		
		$.ajax({
			//url:'/User?cmd=user_idcheck_ajax',  //서블릿 이용시
			url:'member_insert_pro.jsp',
			type:'post',
			data:{'userid': userid},
			success:function(result){
				if(result==0){
					userid_c.innerHTML="사용가능한 아이디입니다";
					$('#pass1').focus();
				}else if(result==1){
					userid_c.innerHTML="중복된 아이디입니다";
					$('#id').val('');
					$('#id').focus();
				}else{
					userid_c.innerHTML="결과" + result;
				}
			},
			error:function(error){
				alert("error : " + error);
			}
		});
	});
});
</script>
<div class="contain">
	<div class="sub-topcontent">
		<h2 class="sub-title">장수하늘소 회원가입</h2>
	</div>
	
	<div class="write-form">
		<table summery="회원가입 글쓰기 테이블 입니다">
			<caption class="readonly">회원가입 입력폼</caption>			
			<colgroup>
				<col width="20%">
				<col width="80%">
			</colgroup>
			<tbody>
			<form name="my" method="post" action="memberinsert.do" enctype="multipart/form-data" onsubmit="return formcheck();">
				<fieldset>
					<legend class="readonly">입력폼</legend>
					<tr>
						<th scope="row">
							<label for="id">아이디</label>
						</th>
						<td>
							<input type="text" name="userid" id="userid" class="minput"> 
							<font id="userid_c" color="red">아이디중복검사</font>
						</td>
					</tr>
					<tr>
						<th scope="row"><lavel for="pass1">패스워드</lavel></th>
						<td><input type="passwrod" name="pass1" id="pass1"  class="minput"></td>
					</tr>
					<tr>
						<th scope="row">패스워드 확인</th>
						<td><input type="passwrod" name="pass2"  class="minput"></td>
					</tr>
					<tr>
						<th scope="row">이름</th>
						<td><input type="text" name="name"  class="minput"></td>
					</tr>
					<tr>
						<th scope="row">이메일</th>
						<td>
							<input type="text" name="email1" class="email"> @
							<input type="text" name="email2"  class="email"> 
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="submit" value="전송" class="btn-write">
							<input type="button" value="목록"  class="btn-reset" onclick="javascript:location.href='portfolio.do'">
						</td>
					</tr>
					</fieldset>
				</form>
			</tbody>
		</table>
	</div>
		
</div>

<script>
	function formcheck() {
		if(my.id.value=="") {
			alert("아이디입력하세요");
			my.id.focus();
			return false;
		}
		if(my.pass1.value=="") {
			alert("패스워드입력하세요");
			my.pass1.focus();
			return false;
		}
		if(my.pass1.value != my.pass2.value) {
			alert("패스워드를 확인하세요");
			my.pass1.focus();
			return false;
		}
		return true;
	}
</script>

<%@ include file="/include/footer.jsp"%>















