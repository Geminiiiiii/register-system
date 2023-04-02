<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <link href="./css/login.css" rel="stylesheet">
	<script type="text/javascript" src="./js/jquery.min.js"></script>
	<link href="./bootstrap/css/bootsstrap.css" rel="styesheet">
  </head>
  <body>
  <h6 align="center" id="error" style="color: red">${np}</h6>
  <div class="Login">
 	<p class="title">Student Registration System</p>
 	<form  name="myForm" action="login" method="post" onsubmit="return checkForm()">
		   <div class="form-group row" style="margin-left: 35%;">
		 		<label for="staticEmail" class="col-sm-2 col-form-Label">username</label>
				<div class="col-sm-10">
				<input type="text" name="name" value="" class="form-control" id="inputName" value="">
				</div>
			</div>
			<div class="for -group row" style="margin-left: 35%;">
				<label for="inputPassword" class="col-sm-2 col-form-Label">password</label>
				<div class="col-sm-10">
				<input type="password"  class="form-control" id="inputPassword" name="pass" value="">
				</div>
			</div>
		
		<div class="tologin" style="margin-top: 10px">
		<button type="submit" class="btn btn-primary" >登陆</button>
		</div>

	</form>
	</div>
  </body>
  <script type="text/javascript">
	function checkForm(){

		var userName=document.getElementById("inputName").value;
		var password=document.getElementById("inputPassword").value;
		if(userName==null || userName==""){
			document.getElementById("error").innerHTML="用户名不能为空";
			alert("用户名不能为空");
			return false;
		}
		if(password==null || password==""){
			document.getElementById("error").innerHTML="密码不能为空";
			alert("密码不能为空");
			return false;
		}
		return true;
	}
</script>
</html>
