<%@ page contentType="text/html; charset=UTF-8" %>

<html>
   <head><title>포토 겔러리 작성</title>
    <link rel="stylesheet" type="text/css" href="stylesheet.css">

  </script>	
</head>
 <body topmargin="0" leftmargin="0">
 <table border="0" width="800">
 <tr>
   <td width="20%" height="500" bgcolor="#ecf1ef" valign="top">
   <!-- 다음에 추가할 부분 -->
   </td>
   <td width="80%" valign="top">&nbsp;<br>
     <img src="/Gallery/img/bullet-01.gif"><font size="3" face="돋움" color="blue"> <b>포토겔러리</b></font>
     <font size="2"> - 등록</font><p>
     <img src="/Gallery/img/bullet-03.gif"><font size="2" face="돋움" color="orange"> 잠깐</font> &nbsp;
     <img src="/Gallery/img/bullet-02.gif"><font size="2" face="돋움">는 필수 입력 사항입니다.</font><p>
     <form method="post" action="" name="input">
      <table border="0">
       <tr>
         <td width="5%" align="right"><img src="/Gallery/img/bullet-02.gif"></td>
         <td width="15%"><font size="2" face="돋움">글쓴이</font></td>
         <td width="80%"><input type="text" size="20" name="name"></td>
       </tr>
       <tr>
         <td align="right"><img src="/Gallery/bullet-02.gif"></td>
         <td><font size="2" face="돋움">제목</font></td>
         <td><input type="text" size="60" name="subject"></td>
       </tr>
       <tr>
         <td align="right"><img src="/Gallery/img/bullet-02.gif"></td>
         <td><font size="2" face="돋움">내용</font></td>
         <td><textarea wrap="physical" rows="10" name="contents" cols="60"></textarea></td>
       </tr>
  	   <tr>
         <td align="right"><img src="/Gallery/img/bullet-02.gif"></td>
         <td><font size="2" face="돋움">비밀번호</font></td>
          <td><input type="password" size="10" name="pass" ><font size="2" face="돋움">*.수정과 삭제시 꼭 입력하셔야 합니다.</font></td>
        </tr>
  	   <tr>
         <td align="right"><img src="/Gallery/img/bullet-02.gif"></td>
         <td><font size="2" face="돋움">첨부(사진)</font></td>
          <td><input type="file" size="50" name="filaname" ><font size="2" face="돋움"></font></td>
        </tr>

        <tr>
          <td align="right">&nbsp;</td>
          <td><font size="2">&nbsp;</font></td>
          <td>
          <a href="">◀등 록▶</a>&nbsp;&nbsp;&nbsp;
          <a href="">◀취 소▶</a>
          </td>
        </tr>
      </table>
      </form>
    </td>
  </tr>
  </table>
  </body>
  </html>
