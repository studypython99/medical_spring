<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원정보수정</title>
	</head>
	<body>
		<h2>회원정보수정</h2>
		<form action="doMember" name="frm" method="post">
		<label>id</label>
		<input type="text" name="id" value="${id}"><br>
		<label>pw</label>
		<input type="password" name="pw" value="${pw}"><br>
		<label>name</label>
		<input type="text" name="name"><br>
		<label>phone</label>
		<input type="tel" name="phone"><br>
		
		<label>gender</label><br>
		<label for="gender">male</label>
		<input type="radio" name="gender" value="male">
		<label for="gender">female</label>
		<input type="radio" name="gender" value="female"><br>
		
		<label>hobby</label><br>
		<label for='game'>game</label>
		<input type="checkbox" name="hobby" id="game" value="game">
		<label for='golf'>golf</label>
		<input type="checkbox" name="hobby" id="golf" value="golf">
		<label for='run'>run</label>
		<input type="checkbox" name="hobby" id="run" value="run">
		<label for='swim'>swim</label>
		<input type="checkbox" name="hobby" id="swim" value="swim">
		<label for='soccer'>soccer</label>
		<input type="checkbox" name="hobby" id="soccer" value="soccer">
		
		
		<input type="submit" value="전송">
		
		</form>
	</body>
</html>