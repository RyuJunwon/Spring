<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<body>

<form action="main.do">
	<select name="searchCondition">
		<c:forEach var="v" items="${ searchMap }">
			<option value="${ v.value }">${ v.key }</option>
		</c:forEach>
	</select>
	<input type="text" name="searchCOntent" placeholder="검색어 입력">
	<input type="submit" value="검색">
</form>

<c:if test="${ empty memberId }">
	<form action="login.do">
		<input type="submit" value="로그인">	
	</form>
	<br>
	<input type="text" placeholder="로그인 후 이용 가능합니다." disabled>
</c:if>
<c:if test="${ not empty memberId }">
<form action="insertBoard.do">
	<input type="submit" value="후기 작성">
</form>

<hr>

</c:if>
<c:forEach var="bdatas" items="${ bdatas }">
	<c:if test="${ empty bdatas }">
		<h3>글 없음</h3>
	</c:if>
	<c:if test="${ not empty bdatas }">
		<table border="1">
			<tr>
				<th>글 번호</th>
				<th>글 제목</th>
				<th>작성자</th>
				<th>조회수</th>				
			</tr>
			<tr>
				<td><a href="BoardDetail.do?bid=${ bdatas.bid }">${ bdatas.bid }</a></td>
				<td>${ bdatas.title }</td>
				<td>${ bdatas.writer }</td>
				<td>${ bdatas.cnt }</td>
			</tr>
		</table>
	</c:if>
</c:forEach> 

</body>
</html>