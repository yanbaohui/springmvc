<%--
  Created by IntelliJ IDEA.
  User: 小包小唐
  Date: 2021/5/8
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>查询所有账户</h3>

    ${accounts}
    <c:forEach items="${accounts}" var="account">
        ${account.name}
    </c:forEach>
</body>
</html>
