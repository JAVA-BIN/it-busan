<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="js/jquery.custom-select.js"></script>
    <script type="text/javascript" src="js/main.js"></script>
    <link rel="stylesheet" type="text/css" href="css/customSelect.css">
    <link rel="stylesheet" href="css/default.css">
</head>
<body>
<jsp:include page="../common/header.jsp" />
<!-- content-bottom -->
<div class="contents-bt">

    <div class="table">
        <div class="table-sum">
            총 609 건  <span>( <em>8</em> / 10 )</span>
        </div>
        <button onclick="location.href='/board/write'">쓰러가보자</button>
        <form action="/board/list" method="get">
        <table class="default6">
            <thead>
                <tr>
                    <th>제목</th>
                    <th>내용</th>
                    <th>작성자</th>
                    <th>만든날짜</th>
                    <th>기타</th>
                </tr>
            </thead>

            <tbody>
            <c:forEach var="board" items="${boardList}">
                <tr>
                        <td>${board.cook}</td>
                        <td>${board.category}</td>
                        <td>${board.manual}</td>
                        <td>${board.calorie}</td>
                        <td>${board.protein}</td>
                        <td>${board.fat}</td>
                        <td>${board.salt}</td>
                        <td>${board.createdDate}</td>
                        <td>${board.modifiedDate}</td>
                    </tr>
                </c:forEach>

            </tbody>

        </table>
        </form>
        <ul class="page-nav">
            <button href="#" tabindex="0" class="page-item btn-first">
                <span class="blind">처음</span>
            </button>
            <button href="#" class="page-item btn-pre">
                <span class="blind">이전</span>
            </button>
            <button href="#" class="page-item selceted">1</button>
            <button href="#" class="page-item ">2</button>
            <button href="#" class="page-item">…</button>
            <button href="#" class="page-item">8</button>
            <button href="#" class="page-item">9</button>
            <button href="#" tabindex="0" class="page-item btn-next">
                <span class="blind">처음</span>
            </button>
            <button href="#" class="page-item btn-last">
                <span class="blind">이전</span>
            </button>
        </ul>
    </div>

</div>
</body>
</html>
