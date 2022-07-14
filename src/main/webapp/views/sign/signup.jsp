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
    <div class="overlay-container">
    <div class="overlay-right">
        <h1>Welcome Back</h1>
        <p>To keep connected with us please login with your personal info</p>
        <button id="signIn" onclick="location.href='/signin'">Sign In</button>
    </div>
    </div>
        <div class="sign-in-container">
            <form name="signup" id="userVo" action="/user/create" method="post">
                <h1>Create Account</h1>
                <br>
                <input type="text" name="userid" placeholder="ID">
                <input type="text" name="name" placeholder="Name">
                <input type="email" name="email" placeholder="Email">
                <input type="password" name="password" placeholder="Password">
                <button class="form_btn">Sign Up</button>
            </form>
        </div>
    </div>
</div>

</body>
</html>
