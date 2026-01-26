<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Register Page</title>
</head>
<body>

<h2>Register</h2>
<form action="${pageContext.request.contextPath}/register" method="post">
    <p>Username: <input name="username" required></p>
    <p>Password: <input type="password" name="password" required></p>
    <button type="submit">Register</button>
</form>

</body>
</html>