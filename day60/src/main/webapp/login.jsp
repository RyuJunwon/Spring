<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>

<form action="main.do" method="post">
	<input type="hidden" name="action" value="login">
	<input type="text" name="mid" value="${ memberVO.mid }" placeholder="아이디를 입력하세요." required> <br>
	<input type="password" name="mpw" value="${ memberVO.mpw }" placeholder="비밀번호를 입력하세요." required> <br>
	<input type="submit" value="로그인">
</form>
</body>
</html>