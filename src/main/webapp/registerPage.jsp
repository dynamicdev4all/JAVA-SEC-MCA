<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	 <h1>Register Page</h1>-
    <form action="RegisterServlet" method="post">
       <input type="text" name="username" id="username" placeholder="Username">
        <br>
        <input type="email" name="email" id="email" placeholder="Email Address">
        <br>
        <input type="password" name="password0" id="password0" placeholder="Password">
        <br>
         <input type="password" name="password1" id="password1" placeholder="Re-enter Password">
        <br>
        <button>Regsiter Now</button>
    </form>
</body>
</html>