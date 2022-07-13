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

    <link href="../resources/css/signcss.css" rel="stylesheet" type="text/css" media="screen">
    <script type="text/javascript" src="./resources/js/signjs.js"></script>

</head>
<body>
<div class="wrapper">
    <div class="container">
        <div class="sign-up-container">
            <form>
                <h1>Create Account</h1>
                <div class="social-links">
                    <div>
                        <a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                    </div>
                    <div>
                        <a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
                    </div>
                    <div>
                        <a href="#"><i class="fa fa-linkedin" aria-hidden="true"></i></a>
                    </div>
                </div>
                <span>or use your email for registration</span>
                <input type="text" placeholder="Name">
                <input type="email" placeholder="Email">
                <input type="password" placeholder="Password">
                <button class="form_btn">Sign Up</button>
            </form>
        </div>
        <div class="sign-in-container">
            <form>
                <h1>Sign In</h1>
                <div class="social-links">
                    <div>
                        <a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                    </div>
                    <div>
                        <a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
                    </div>
                    <div>
                        <a href="#"><i class="fa fa-linkedin" aria-hidden="true"></i></a>
                    </div>
                </div>
                <span>or use your account</span>
                <input type="email" placeholder="Email">
                <input type="password" placeholder="Password">
                <button class="form_btn">Sign In</button>
            </form>
        </div>
        <div class="overlay-container">
            <div class="overlay-left">
                <h1>Welcome Back</h1>
                <p>To keep connected with us please login with your personal info</p>
                <button id="signIn" class="overlay_btn">Sign In</button>
            </div>
            <div class="overlay-right">
                <h1>Hello, Friend</h1>
                <p>Enter your personal details and start journey with us</p>
                <button id="signUp" class="overlay_btn">Sign Up</button>
            </div>
        </div>
    </div>
</div>

</body>
</html>
