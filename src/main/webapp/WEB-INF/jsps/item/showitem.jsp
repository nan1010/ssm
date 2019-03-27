<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<c:set var="picPath" value="http://localhost:8003/ssmimage"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

商品列表：
<table width="100%" border=1>
<tr>
	<td>ID</td>
	<td>商品名称</td>
	<td>商品图片</td>
	<td>商品描述</td>
</tr>
<tr>
	<td>${item.itemid}</td>
	<td>${item.itemname}</td>
	<td>
	<img id='imgSize1ImgSrc' src='${picPath }${item.itemimageaddr}'  height="300" width="300" />
	</td>
	<td>${item.itemdesc}</td>
	<td><a href="${pageContext.request.contextPath }/item/finditembyid.do?itemid=${item.itemid}">修改</a>
	</td>

</tr>


</table>
</body>
</html>