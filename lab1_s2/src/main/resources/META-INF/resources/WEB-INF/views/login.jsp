<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login Page</title>
</head>
<body>

<h2>Login</h2>
<form action="${pageContext.request.contextPath}/login" method="post">
    <p>Username: <input name="username" required></p>
    <p>Password: <input type="password" name="password" required></p>
    <button type="submit">Login</button>
</form>
<p><a href="${pageContext.request.contextPath}/register">Register</a></p>

</body>
</html>