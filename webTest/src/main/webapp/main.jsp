<%--
  Created by IntelliJ IDEA.
  User: zou25
  Date: 2023/2/28
  Time: 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <%@page isELIgnored="false" %>
  <title>Insert title here</title>
</head>
<body>
欢迎${user}登录 <br>
<font color="red">在线人数${applicationScope.counter.count}</font>
<br>
<a href="TuichuServlet">退出登录</a>
</body>

