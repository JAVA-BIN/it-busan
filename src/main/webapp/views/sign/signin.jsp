<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022-07-13
  Time: 오후 4:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>먹어볼레 로그인</title>

    <link href="resources/css/sign.css" rel="stylesheet" type="text/css" media="screen">
    <script type="text/javascript" src="resources/js/sign.js"></script>

</head>
<body>
<div class="wrapper">
    <div class="container">
        <div class="sign-in-container">
            <form name="signin" id="userVo" action="/user/login" method="post">
                <h1>Sign In</h1>
                <br>
                <input type="id" name="userid" placeholder="ID">
                <input type="password" name="password" placeholder="Password">
                <button class="form_btn">Sign In</button>
            </form>
        </div>
        <div class="overlay-container">
            <div class="overlay-right">
                <h1>Hello, Friend</h1>
                <p>Enter your personal details and start journey with us</p>
                <button id="signUp" onclick="location.href='/signup'">Sign Up</button>
            </div>
        </div>
    </div>
</div>

</body>
</html>
