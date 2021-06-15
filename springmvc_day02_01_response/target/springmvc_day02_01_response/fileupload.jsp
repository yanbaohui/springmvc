<%--
  Created by IntelliJ IDEA.
  User: 小包小唐
  Date: 2021/5/7
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>文件上传</h3>
    <form action="fileUpload" method="post" enctype="multipart/form-data">
        名称：<input type="text" name="picname"/><br/>
        图片：<input type="file" name="uploadFile"/><br/>
        <input type="submit" value="上传"/>
    </form>
</body>
</html>
