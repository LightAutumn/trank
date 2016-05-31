<%--
  Created by IntelliJ IDEA.
  User: yin
  Date: 2016/5/17
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>喜阳光的小雨点官网</title>
</head>
<body>
欢迎来到喜阳光的小雨点
<c:forEach var="user" items="${userList}">
    <br>
    ${user.id}
    ${user.name}<br>
</c:forEach>
    </body>
</html>
