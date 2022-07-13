<%--
  Created by IntelliJ IDEA.
  User: imchaebin
  Date: 2022/07/14
  Time: 3:19 오전
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form name="boardVo" id="boardVo" action="/board/create" method="post">
        <input type="text" name="cook" placeholder="cook">
        <input type="text" name="category" placeholder="category">
        <input type="text" name="manual" placeholder="manual">
        <input type="number" name="calorie" placeholder="calorie">
        <input type="number" name="protein" placeholder="protein">
        <input type="number" name="fat" placeholder="fat">
        <input type="number" name="salt" placeholder="salt">

        <input type="text" name="username" placeholder="username">
        <input type="password" name="password" placeholder="Password">
        <button class="form_btn">저장한디</button>
    </form>
</body>
</html>
