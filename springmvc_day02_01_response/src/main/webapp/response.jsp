<%--
  Created by IntelliJ IDEA.
  User: 小包小唐
  Date: 2021/4/30
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>

    <script type="text/javascript">
        //页面加载，绑定单击事件
        $(function () {
            $("#btn").click(function () {
                //alert("hello btn");
                //发送ajax请求
                $.ajax({
                    //编写json格式，设置属性和值
                    url:"user/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"uname":"hehe"},{"age":"20"},{"date":""}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        //data服务器端响应的json数据，进行解析
                        alert(data);
                        alert(data.uname);
                        alert(data.age);
                    }
                })
            })
        })


    </script>
</head>
<body>
    <a href="user/testString">testString</a>

    <br>

    <a href="user/testVoid">testVoid</a>

    <br>

    <a href="user/testModelAndView">testModelAndView</a>

    <br>

    <a href="user/testForwardOrRedirect">testForwardOrRedirect</a>

    <br>

    <button id="btn">发送ajax</button>
</body>
</html>
