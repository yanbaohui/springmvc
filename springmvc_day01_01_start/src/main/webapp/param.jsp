<%--
  Created by IntelliJ IDEA.
  User: 小包小唐
  Date: 2021/4/28
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%-- 请求参数绑定
    <a href="param/testParam?username=hehe">请求参数绑定</a>


   <form method="post" action="param/saveAccount">
       姓名：<input type="text" name="username"/><br>
       密码：<input type="text" name="password"/><br>
       金额：<input type="text" name="money"/><br>
       用户姓名：<input type="text" name="user.uname"/><br>
       用户年龄：<input type="text" name="user.age"/><br>
       <input type="submit" value="提交" >
    </form>
    --%>

        <%-- 把数据封装到Account类中，类中存在list和map集合 
        <form method="post" action="param/saveAccount">
            姓名：<input type="text" name="username"/><br>
            密码：<input type="text" name="password"/><br>
            金额：<input type="text" name="money"/><br>

            用户姓名：<input type="text" name="list[0].uname"/><br>
            用户年龄：<input type="text" name="list[0].age"/><br>

            用户姓名：<input type="text" name="map['one'].uname"/><br>
            用户年龄：<input type="text" name="map['one'].age"/><br>
            <input type="submit" value="提交" >
        </form>
        %-->

        <%-- 自定义类型转换器
        <form method="post" action="param/saveUser">
            用户姓名：<input type="text" name="uname"/><br>
            用户年龄：<input type="text" name="age"/><br>
            用户生日：<input type="text" name="date"/><br>
            <input type="submit" value="提交" >
        </form>
        --%>

    <a href="param/testServlet">testSessionAttribute</a>

</body>
</html>
