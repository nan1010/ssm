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
<style type="text/css">
</style>
</head>
<body> 
<form action="${pageContext.request.contextPath }/item/finditembyname.do" method="post">
搜索商品：
<table width="100%" border=1>
<tr>
<td><input id="inputname" name="inputname" type="text" value="土豆"/></td><td><input type="submit" value="搜索"/></td>
<td><a href="${pageContext.request.contextPath }/upload/toupload.do" class="button">上线新商品</a></td>
</tr>
</table>
</form>
商品列表：
<table width="100%" border=1>
<tr>
	<td>复选框</td>
	<td>ID</td>
	<td>商品名称</td>
	<td>商品价格</td>
	<td>商品图片</td>
	<td>商品描述</td>
	<td>操作</td>
</tr>
<c:forEach items="${itemsList}" var="item">
<tr>
	<td>
	<input type="checkbox" name="id">
	</td>
	<td>${item.itemid}</td>
	<td>${item.itemname}</td>
	<td>${item.itemprice}</td>
	<td>
	<img id='imgSize1ImgSrc' src='${picPath}${item.itemimageaddr}'  height="100" width="100" />
	</td>
	<td>${item.itemdesc}</td>
	<td><a href="${pageContext.request.contextPath }/item/finditembyid.do?itemid=${item.itemid}"><button>修改</button></a>
	<a href="${pageContext.request.contextPath }/item/deleteByID.do?itemid=${item.itemid}"><button>删除</button></a>
	</td>
	
</tr>
</c:forEach>
</table>
</body>

</html>