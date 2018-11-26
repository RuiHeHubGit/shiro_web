<%--
  Created by IntelliJ IDEA.
  User: ruihe
  Date: 11/26/2018
  Time: 10:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <div>登录</div>
    <form action="login" method="post">
        <label>用户名：</label><input type="text" name="username"/>
        <label>密码：</label><input type="password" name="password"/>
        <input type="reset" value="重置" onclick="error.textContent=''">
        <input type="submit" value="登录">
        <label id="error">${error}</label>
    </form>
    <label>没有账号去</label><a href="register">注册</a>
    <a href="index">返回主页</a>
</body>
</html>
