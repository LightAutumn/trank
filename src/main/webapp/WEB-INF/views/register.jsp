<%--
  Created by IntelliJ IDEA.
  User: yin
  Date: 2016/5/17
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="/resources/css/zui.min.css" rel="stylesheet">
    <title>Title</title>
    <script src="/resources/js/jquery-2.2.1.js"></script>
    <script src="/resources/js/zui.min.js"></script>
</head>
<body>
<div class="panel-info">
    <div class="panel-heading" align="center">
        用户注册
    </div>
    <div class="panel-danger"  align="center">
    <a href="/resources/index.html">返回首页</a>
        <form action="/user/register" method="post" enctype="multipart/form-data">
        <div class="input-group" style="width: 500px">
            <span class="input-group-addon">(*^__^*)</span>
            <input type="text" name="username" class="form-control" placeholder="用户名">
            <span class="input-group-addon"><i class="icon icon-heart"></i></span>
        </div>
        <div class="input-group" style="width: 500px">
            <span class="input-group-addon">(∩__∩)</span>
            <input type="text" name="password" class="form-control" placeholder="密码">
            <span class="input-group-addon"><i class="icon icon-heart"></i></span>
        </div>
        <div class="input-group" style="width: 500px">
            <span class="input-group-addon">(^∇^*)</span>
            <input type="text" name="realname" class="form-control" placeholder="真实姓名">
            <span class="input-group-addon"><i class="icon icon-heart"></i></span>
        </div>
        <div class="input-group" style="width: 500px">
            <span class="input-group-addon">(*@ο@*)</span>
            <input type="text" name="sex" class="form-control" placeholder="性别">
            <span class="input-group-addon"><i class="icon icon-heart"></i></span>
        </div>
        <div class="input-group" style="width: 500px">
            <span class="input-group-addon">(⊙o⊙)</span>
            <input type="text" name="age" class="form-control" placeholder="年龄">
            <span class="input-group-addon"><i class="icon icon-heart"></i></span>
        </div>
        <div class="input-group" style="width: 500px">
            <span class="input-group-addon">(ˇˍˇ)</span>
            <input type="text" name="telephone" class="form-control" placeholder="联系方式">
            <span class="input-group-addon"><i class="icon icon-heart"></i></span>
        </div>
        <div class="input-group" style="width: 500px">
            <span class="input-group-addon">@</span>
            <input type="text" name="email" class="form-control" placeholder="邮箱">
            <span class="input-group-addon"><i class="icon icon-heart"></i></span>
        </div>
        <div class="input-group" style="width: 500px">
            <span class="input-group-addon">(╯▽╰)</span>
            <input type="text" name="address" class="form-control" placeholder="通讯地址">
            <span class="input-group-addon"><i class="icon icon-heart"></i></span>
        </div>
            <sf:errors path="*"  cssClass="error"></sf:errors>
            <button class="btn btn-primary" type="submit">提交</button>
        </form>
    </div>
</div>

</body>
</html>
