<%--
  Created by IntelliJ IDEA.
  User: 小包小唐
  Date: 2021/5/8
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/findAll">测试</a>

    <h3>测试保存</h3> <br>

    <form action="account/saveAccount">
        账户名称：<input type="text" name="name"/> <br>
        账户金额：<input type="text" name="money"/> <br>
        <input type="submit" value="保存"/> <br>
    </form>
</body>
</html>
