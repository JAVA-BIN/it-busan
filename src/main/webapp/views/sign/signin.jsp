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
                <div class="social-links">
                    <div>
                        <a href="#"><i class="fa fa-facebook"></i></a>
                    </div>
                    <div>
                        <a href="#"><i class="fa fa-twitter"></i></a>
                    </div>
                    <div>
                        <a href="#"><i class="fa fa-linkedin"></i></a>
                    </div>
                </div>
                <span>or use your account</span>
                <input type="id" name="id" placeholder="ID">
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
