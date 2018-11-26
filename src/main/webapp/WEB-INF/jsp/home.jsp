<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
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
    <title>home</title>
</head>
<body>
    <div>主页</div>
    <shiro:notAuthenticated>
        <div>
            <span>你未登录请</span><a href="login">登录</a>
        </div>
    </shiro:notAuthenticated>
    <shiro:authenticated>
        <span>你好,</span> <shiro:principal/>
    </shiro:authenticated>
    <shiro:user>
        <div>
            <a href="authMgr">权限管理</a>
        </div>
    </shiro:user>
    <shiro:hasRole name="administrator">
        <div>
            <a href="userMgr">用户管理</a>
        </div>
    </shiro:hasRole>
    <shiro:authenticated>
        <div>
            <a href="logout">注销</a>
        </div>
    </shiro:authenticated>
</body>
</html>
