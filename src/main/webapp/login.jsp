<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link href="./css/app.css" rel="stylesheet">

</head>
<body>
<main class="container" >
	<form action="/blog/login" method="post">
		<div class="form-floating mt-5 mb-3">
		  <input type="text" name="user" class="form-control" id="user" placeholder="login">
		  <label for="user">Usuario</label>
		</div>
		<div class="form-floating  mb-3">
		  <input type="password" name="password" class="form-control" id="password" placeholder="Password">
		  <label for="password">Password</label>
		</div>
		<button type="submit">Enviar</button>
	</form>
</main>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
