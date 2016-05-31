<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="/resources/css/zui.min.css" rel="stylesheet">
    <title>用户登录</title>
    <script src="/resources/js/jquery-2.2.1.js"></script>
    <script src="/resources/js/zui.min.js"></script>
</head>
<body>
<div class="panel-primary">
    <div class="panel-heading" align="center">
        登录
    </div>
    <div class="panel-body" align="center">
        <form action="/user/login" method="get">
        <div class="input-group" style="width: 550px">
            <span class="input-group-addon">*</span>
            <input type="text" name="username" class="form-control" placeholder="用户名">
            <span class="input-group-addon"><i class="icon icon-heart"></i></span>
        </div>
        <div class="input-group" style="width: 550px">
            <span class="input-group-addon">*</span>
            <input type="password" name="password" class="form-control" placeholder="密码">
            <span class="input-group-addon"><i class="icon icon-heart"></i></span>
        </div>
        <div class="input-group" style="width: 550px">
            <span class="input-group-addon">*</span>
            <input type="password" name="vCode" class="form-control" placeholder="验证码">
            <span class="input-group-addon"><i class="icon icon-heart"></i></span>
            <img src="/code?" onclick="this.src+=Math.random()">
        </div>

        <button class="btn btn-primary" type="submit">登录</button>
        <button class="btn btn-primary" type="button">返回</button>
        </form>
    </div>
</div>


</body>
</html>