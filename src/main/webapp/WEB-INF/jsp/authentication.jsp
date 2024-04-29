<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Авторизация</title>
</head>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<style>
body {
	padding-top: 40px;
	padding-bottom: 40px;
	background-color: #f5f5f5;
}

.text-java {
	color: #00796b; /* Teal color */
}

.footer {
	text-align: center;
	padding: 20px 0;
	margin-top: 20px;
	border-top: 1px solid #e5e5e5;
	color: #777;
}

.content {
	margin-top: 20px;
}
</style>
</head>
<body>
	<div class="container mt-5">
		<h2>Пожалуйста, войдите.</h2>
		<form action="Controller" method="get">
			<input type="hidden" name="command" value="do_auth">
			<div class="form-group">
				<label for="username">Логин</label> <input class="form-control"
					type="text" name="username" required>
			</div>
			<div class="form-group">
				<label for="password">Пароль</label> <input class="form-control"
					type="password" name="password" required>
			</div>
			<p>
				<button class="btn btn-lg btn-success btn-block" type="submit">Войти</button>
			</p>
		</form>
		<p>
		<p>
			Еще не зарегистрированы? <a href="Controller?command=go_to_registration_page">Зарегистрироваться</a>
		</p>
		<p>&copy; 2024 Изучаем Java</p>
	</div>
</body>
</html>