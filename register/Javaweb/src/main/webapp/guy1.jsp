<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 16324
  Date: 2022/12/28
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="user" method="post">
    你学习模式的选择 ：<select class="form-control" name="learn"><br>
    <option name=""  text="" value="线上">线上</option>
    <option name=""  text="" value="线下">线下</option>
</select>
    你当前的资格 ：<select class="form-control" name="ation"><br>
    <option name=""  text="" value="STMP">STMP</option>
    <option name=""  text="" value="Diploma">Diploma</option>
    <option name=""  text="" value="A-level">A-level</option>
    <option name=""  text="" value="others">others</option>
</select>
    你当前的资格 ：<select class="form-control" name="vaccine"><br>
    <option name=""  text="" value="一针">STMP</option>
    <option name=""  text="" value="两针">Diploma</option>
    <option name=""  text="" value="三针">A-level</option>
</select>
    关于你自己：<input type="text" name="own"><br>
    您对自己项目的期望：<input type="text" name="expect">

    <input type="submit">
</form>

</body>
</html>
