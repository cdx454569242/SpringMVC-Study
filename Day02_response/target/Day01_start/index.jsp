<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/14
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                // alert("hello");
                $.ajax({
                   url:"user/testAjax",
                   contentType:"application/json;charset=UTF-8",
                    data:'{"username":"abc","password":"123","age":"18"}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        alert(data);
                        alert(data.username);
                        alert(data.password);
                    }
                });
            });
        });
    </script>
</head>
<body>
    <a href="user/testString">testString</a></br>
    <a href="user/testVoid">testVoid</a></br>
    <a href="user/testModelAndView">testModelAndView</a></br>
    <a href="user/testForwardOrRedirect">testForwardOrRedirect</a></br>
    <button id="btn">发送ajax请求</button>

</body>
</html>
