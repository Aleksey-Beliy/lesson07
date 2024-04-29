<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Регистрация</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<div class="container mt-5">
		<h2>Регистрация пользователя</h2>
		<form action="Controller" method="get">
			<input type="hidden" name="command" value="do_registration" />
			<div class="form-group">
				<label for="username">Имя пользователя</label> <input type="text"
					class="form-control" id="username" name="username" required>
			</div>
			<div class="form-group">
				<label for="email">Email адрес</label> <input type="text"
					class="form-control" id="email" name="email" required>
			</div>
			<div class="form-group">
				<label for="name">Пароль</label> <input type="password"
					class="form-control" id="password" name="password" required>
			</div>
			<div class="form-group">
				<label for="dob">Подтверждение пароля</label> <input type="password"
					class="form-control" id="password_verifier" name="password_verifier" required>
			</div>
			<button type="submit" class="btn btn-lg btn-success">Зарегистрироваться</button>
		</form>
	</div>
</body>
</html>