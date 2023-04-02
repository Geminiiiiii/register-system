<%--
  Created by IntelliJ IDEA.
  User: 16324
  Date: 2022/12/28
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<form action="user" method="post" >
    <input type="hidden" value="in" name="cmd"/>
    Select the learning mode ：<select class="form-control" name="learn">
    <option name=""  text="" value="online">online</option>
    <option name=""  text="" value="Offline">Offline</option>
</select></br></br></br>
    Your current qualifications ：<select class="form-control" name="ation">
    <option name=""  text="" value="STMP">STMP</option>
    <option name=""  text="" value="Diploma">Diploma</option>
    <option name=""  text="" value="A-level">A-level</option>
    <option name=""  text="" value="others">others</option>
</select></br></br></br>
    COVID-19 vaccines ：<select class="form-control" name="vaccine">
    <option name=""  text="" value="One needle">One needle</option>
    <option name=""  text="" value="Two stitches">Two stitches</option>
    <option name=""  text="" value="Three needles">Three needles</option>
</select></br></br></br>
    About yourself：<input type="text" name="own"></br></br></br>
    Your expectations：<input type="text" name="expect"></br></br></br>
    <input type="submit" value="submit">
</form>
</body>
</html>
