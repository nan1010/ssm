<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<style type="text/css">
body {
	background-image:url(${pageContext.request.contextPath}/images/timg3.gif);
	height:100%;
	width:100%;
	overflow: hidden;
	background-size:cover;
}
form{
  position: relative;
  left: 300px;
  top: 300px;
  }
 label{
 	color:green;
 	font-size:35px;
 }
 input{
 	color:blue;
 	font-size:35px;
 }
 h2{
 	
 	font-size:20px;
 	position: relative;
 	left: 380px;
    top: 300px;
 }
</style>

</head>
<body>

<form action="${pageContext.request.contextPath}/controller/login.do" method="post">
<label>账号：</label>
<input type="text" id="txtUsername" name="username" placeholder="请输入账号" /><br/>
<label>密码：</label>
<input type="password" id="txtPassword" name="password" placeholder="请输入密码" /><br/>
<input type="submit" value="登录" />
<input type="reset" value="重置" />
</form>
<h2>没有账户？</h2>
<h2><a href="${pageContext.request.contextPath }/controller/user/tosignin.do">注册</h2>
</body>
</html>