<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>

<img alt="디폴트 이미지" src="images/default.jpeg" id="photo">

<script type="text/javascript">

	var cnt = 1;

	$('#photo').on("click",function() {
		console.log("cnt: " + cnt);
		
		// var testData = {키값: vlaue값, 키값: value값, ...}; // JSON 타입의 데이터를 선언
		var testData = { count:cnt, apple:1234, banana:'kiwi' }; // JSON 타입의 데이터를 선언
		
		$.ajax({
			url : "test02.do",
			type : "POST",
			data : testData,
			success : function(result) { // String 이 반환 되면 result를 볼 수 있음.
				console.log("로그 : 성공! " + result);
				cnt = result; // 새로 값을 세팅
				if(cnt % 2 == 0) {
					$('#photo').prop("src", "images/paper.png"); // 사진을 변경해줘
				}
				else {
					$('#photo').prop("src" , "images/default.jpeg"); // 디폴트 이미지로 해줘
				}
			},
			error : function() {
				console.log("로그 : 에러발생..");	
			} 
		});
	});
</script>

</body>
</html>