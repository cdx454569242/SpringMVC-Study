<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/15
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="anno/testRequestParam?name=hello">RequestParam</a>

    <br/>

    <form action="anno/testRequestBody" method="post">
        用户姓名:<input type="text" name="username"><br/>
        用户年龄:<input type="text" name="age"><br/>
        <input type="submit" value="提交">
    </form>

    <a href="/anno/testPathVariable/10">testPathVariable</a>
</body>
</html>
