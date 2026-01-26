<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title> User Page </title>
</head>
<body>

<h1> User Dashboard </h1>

<p>Welcome, ${pageContext.request.userPrincipal.name}</p>
<p>This page is for logged-in users (USER or ADMIN).</p>
<p>
    <a href="${pageContext.request.contextPath}/welcome">Back to Welcome</a> |
    <a href="${pageContext.request.contextPath}/logout">Logout</a>
</p>

</body>
</html>