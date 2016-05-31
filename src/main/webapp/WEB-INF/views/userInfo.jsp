<%--
  Created by IntelliJ IDEA.
  User: yin
  Date: 2016/5/18
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="/resources/css/zui.min.css" rel="stylesheet">
    <title>用户信息</title>
    <script src="/resources/js/jquery-2.2.1.js"></script>
    <script src="/resources/js/zui.min.js"></script>
</head>
<body>
<div class="panel-primary" align="center">
    <div class="panel-heading" >
        用户信息列表
    </div>
    <div class="panel-body" style="width: auto">
        <table class="table table-striped">
            <tr>
                <th>编号</th>
                <th>用户名</th>
                <th>真实姓名</th>
                <th>性别</th>
                <th>年龄</th>
                <th>创建日期</th>
            </tr>
            <c:forEach items="${userList}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.username}</td>
                    <td>${user.realname}</td>
                    <td>${user.sex}</td>
                    <td>${user.age}</td>
                    <td>${user.createtime}</td>
                </tr>
            </c:forEach>

        </table>
    </div>
</div>
</body>
</html>
