<%--
  Created by IntelliJ IDEA.
  User: zou25
  Date: 2023/2/28
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>员工登录界面</title>
</head>
<body>
<h3>登录到HR系统</h3>
<h1 style="color: red;"></h1>
<form action="LoginServlet" method="post">
    <table>
        <tr>
            <td>员工编号：</td>
            <td><input type="text" name="user" value="" /></td>
        </tr>
        <tr>
            <td>系统密码：</td>
            <td><input type="password" name="pwd" value="" /></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="提交" /></td>
        </tr>

    </table>
</form>

</body>
</html>

