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

.container {
	max-width: 800px;
	padding: 15px;
	margin: auto;
	background-color: white;
	border-radius: 7px;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
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
	<div class="container tet-center">
		<h1 class="text-java">Добро пожаловать в курс Java!</h1>
		<h3>Поздравляем в успешным входом на платформу. Вы готовы начать
			обучение?</h3>
		<form action="Controller" method="get">
			<input type="hidden" name="command" value="***"> <a
				href="Controller?command=***" class="btn btn-lg btn-success">
				Перейти к урокам</a> <a href="Controller?command=***"
				class="btn btn-lg btn-success"> Мой профиль</a>

		</form>
		<hr>
		<p>&copy; 2024 Изучаем Java</p>
	</div>
</body>
</html>