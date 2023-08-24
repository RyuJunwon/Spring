<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>후기 작성 페이지</title>
</head>
<body>
	<form action="main.do" method="post">
		<input type="text" name="title" placeholder="제목을 입력하세요."> <br>
		<input type="text" name="content" placeholder="내용을 입력하세요."> <br>
		<input type="text" name="memberId" value="${ memberId }"disabled> <br>
		<input type="submit" value="댓글 작성">
	</form>
</body>
</html>