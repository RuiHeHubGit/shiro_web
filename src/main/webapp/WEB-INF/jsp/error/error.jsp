<%--
  Created by IntelliJ IDEA.
  User: ruihe
  Date: 11/26/2018
  Time: 11:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>error</title>
</head>
<body>
    <div>
        <span>发生错误：</span>
        <span><%= exception.getMessage() %></span>
    </div>
</body>
</html>
