<%--
  Created by IntelliJ IDEA.
  User: ruihe
  Date: 11/26/2018
  Time: 10:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>authEditor</title>
    <style>
        .opBtn {
            margin: 10px;
            padding: 5px;
            background-color: burlywood;
            border-radius: 3px;
            opacity: 0.8;
            cursor: pointer;
        }
        .opBtn:hover {
            opacity: 1;
        }
    </style>
</head>
<body>
    <div>权限管理</div>
    <div style="margin-top: 20px">
        <shiro:hasPermission name="user:create">
            <span class="opBtn">创建</span>
        </shiro:hasPermission>
        <shiro:hasPermission name="user:select">
            <span class="opBtn">查询</span>
        </shiro:hasPermission>
        <shiro:hasPermission name="user:update">
            <span class="opBtn">修改</span>
        </shiro:hasPermission>
        <shiro:hasPermission name="user:delete">
            <span class="opBtn">删除</span>
        </shiro:hasPermission>
    </div>
</body>
</html>
