<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
<style type="text/css">
body {
	background-image:url(${pageContext.request.contextPath}/images/1.jpg);
	height:100%;
	width:100%;
	overflow: hidden;
	background-size:cover;
}
 h1{
 	color:green;
 	font-size:35px;
 	position: relative;
  	left: 450px;
  	top: 200px;
 }
 h2{
 	color:yellow;
 	font-size:20px;
 	position: relative;
  	left: 500px;
  	top: 250px;
 }
</style>
</head>
<body>
<h1>欢迎，${user.username}</h1>
<h2><a href="${pageContext.request.contextPath }/item/tolist.do" >进入购物商城</a></h2>
<h2><a href="${pageContext.request.contextPath }/item/tolist.do" >查看购物车</a></h2>
</body>
</html>