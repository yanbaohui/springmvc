<%--
  Created by IntelliJ IDEA.
  User: 小包小唐
  Date: 2021/4/29
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%-- 常用的注解
    <a href="anno/testRequestParam?name=哈哈">RequestParam</a>

    <br>

    <form method="post" action="anno/testRequestBody">
        用户姓名：<input type="text" name="username"/><br>
        用户年龄：<input type="text" name="age"/><br>
        <input type="submit" value="提交" >
    </form>
    --%>

<%--    <a href="anno/testPathVariable/10">PathVariable</a>


    <form method="post" action="anno/testModelAttribute">
        用户姓名：<input type="text" name="username"/><br>
        用户年龄：<input type="text" name="age"/><br>
        <input type="submit" value="提交" >
    </form>
    <br>

    <a href="anno/testSessionAttribute">SessionAttribute</a>

    <br>
    --%>
    <a href="anno/testSessionAttribute">setSessionAttribute</a>
    <br>
    <a href="anno/getSessionAttribute">getSessionAttribute</a>
    <br>
    <a href="anno/deSessionAttribute">deSessionAttribute</a>
</body>
</html>
