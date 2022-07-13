<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- ${cookie.쿠키이름.value} 로 접근 --%>
<c:if test="${not empty cookie.id.value}">
    <c:set var="id" value="${cookie.id.value}" scope="session" />
</c:if>
<header>
    <div id="login">
        <c:choose>
            <c:when test="${empty id}">
                <a href="/signin">SIGN-IN</a>
            </c:when>
            <c:otherwise>
                ${id}님
                <a href="/user/logout">LOGOUT</a>
            </c:otherwise>
        </c:choose>
    </div>
</header>
