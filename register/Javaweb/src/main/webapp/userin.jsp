<%--
  Created by IntelliJ IDEA.
  User: 16324
  Date: 2022/12/28
  Time: 22:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="user" method="post">
    <input name="cmd" type="hidden" value="in1"><br><br><br>
    IC NO.:<input type="text" name="ic"><br><br><br>
    Reg.DATE:<input type="date" name="date" value="${book.date}"><br><br><br>
    program:<input type="text" name="program"><br><br><br>
    <input type="submit" value="add">
</form>
</body>
</html>
