<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

<h1 align="center">图片下载</h1>
<p>
  <c:forEach var="image" items="${imageList}">   
      <a href="images/rawImages/${image}" target="_blank"><img  src="images/thumbImages/${image}" /></a>
      <a href="${pageContext.request.contextPath}/download?filename=${image}">${image}</a>        
  </c:forEach>  
</p>
 