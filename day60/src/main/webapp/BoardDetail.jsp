<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>후기 상세 페이지</title>
</head>
<body>
	<c:forEach var="bdata" items="${ bdata }">
		<table>
			<thead>
				<tr>
					<th>글 번호</th>
					<th>글 제목</th>
					<th>글 내용</th>
					<th>작성자</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${ bdata.bid }</td>
					<td>${ bdata.title }</td>
					<td>${ bdata.content }</td>
					<td>${ bdata.writer }</td>
				</tr>
			</tbody>
		</table>
	</c:forEach>

</body>
</html>