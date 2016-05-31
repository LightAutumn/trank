<%--
  Created by IntelliJ IDEA.
  User: yin
  Date: 2016/5/21
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<security:accesscontrollist hasPermission="" domainObject=""/>
<security:authentication property=""/>
<security:authorize/>
<input type="checkbox" id="remember_me" name="_spring_security_remember_me">
<label for="remember_me" class="inline">记住我</label>
</body>
</html>
