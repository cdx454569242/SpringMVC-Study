<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/17
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>传统文件上传</h3>
    <form action="user/fileUpLoad1" method="post" enctype="multipart/form-data">
        选择文件:<input type="file" name="upload"></br>
        <input type="submit" value="上传">
    </form>

    <h3>SpringMVC文件上传</h3>
    <form action="user/fileUpLoad2" method="post" enctype="multipart/form-data">
        选择文件:<input type="file" name="upload" /></br>
        <input type="submit" value="上传">
    </form>
</body>
</html>
