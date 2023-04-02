<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 16324
  Date: 2022/12/28
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="book" items="${update}">
<form action="user" method="post">
    <input name="cmd" type="hidden" value="update"><br><br><br>
    <input name="id" type="hidden" value="${book.id}">
    IC NO.:<input type="text" name="ic" value="${book.ic}"><br><br><br>
    Reg.DATE:<input type="date" name="date" value="${book.date}"><br><br><br>
    program:<input type="text" name="program" value="${book.program}"><br><br><br>
    <input type="submit" value="Modify the information">
</form>
</c:forEach>
</body>
</html>
