<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<c:set var="picPath" value="http://localhost:8003/ssmimage"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询商品列表</title>
</head>
<body> 
<form action="${pageContext.request.contextPath }/items/deleteByIds.do" method="post">
查询条件：
<table width="100%" border=1>
<tr>
<td><input type="submit" value="查询"/></td>
<td><input type="submit" value="批量删除"/></td>
</tr>
</table>
商品列表：
<table width="100%" border=1>
<tr>
	<td>复选框</td>
	<td>ID</td>
	<td>商品名称</td>
	<td>商品图片</td>
	<td>商品描述</td>
	<td>操作</td>
</tr>
<c:forEach items="${itemsList}" var="item">
<tr>
	<td>
	<input type="checkbox" name="id" >
	</td>
	<td>${item.itemid}</td>
	<td>${item.itemname}</td>
	<td>
	<img id='imgSize1ImgSrc' src='${picPath}${item.itemimageaddr}'  height="100" width="100" />
	</td>
	<td>${item.itemdesc}</td>
	<td><a href="${pageContext.request.contextPath }/item/finditembyid.do?itemid=${item.itemid}">修改</a>
	<a href="${pageContext.request.contextPath }/items/deleteByID.do?itemid=${item.itemid}">删除</a>
	</td>

</tr>
</c:forEach>

</table>
</form>
</body>

</html>