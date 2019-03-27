<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<c:set var="picPath" value="http://localhost:8003/ssmimage"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改商品信息</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.0.0.min.js"></script>
<!-- jquery.form.js可以让ajax提交表单到request请求中去 			$("#表名").ajaxSubmit(option);-->
<script type="text/javascript" src="http://malsup.github.io/jquery.form.js"></script>
<script type="text/javascript">
function submitImgSize1Upload(){
	
	
	var option={
			type:'POST',
			url:'${pageContext.request.contextPath}/upload/uploadpic.do',
			dataType:'text',
			data:{
				
				fileName : 'imgSize1File'
			},
			success:function(data){
				
				//把带有json格式的字符串转换成json对象
				var jsonObj = $.parseJSON(data);
				
				//返回服务器图片路径，把图片路径设置给img标签
				$("#imgSize1ImgSrc").attr("src",jsonObj.fullPath);
				//数据库保存相对路径
				$("#itemimageaddr").val(jsonObj.relativePath);
			}
			
		};
	
	$("#itemForm").ajaxSubmit(option);
	
}
</script>

</head>
<body> 
<form id="itemForm" action="${pageContext.request.contextPath }/item/showitem.do" method="post" enctype="Multipart/form-data">
<input type="hidden" name="id" value="${item.itemid }"/>
修改商品信息：
<table width="100%" border=1>
<tr>
	<td>商品ID</td>
	<td><input type="text" name="itemid" value="${item.itemid}"/>do not change! </td>
</tr>
<tr>
	<td>商品名称</td>
	<td><input type="text" name="itemname" value="${item.itemname}"/></td>
</tr>
<tr>
	<td>商品描述</td>
	<td><input type="text" name="itemdesc" value="${item.itemdesc}"/></td>
</tr>
<tr>
	<td>商品图片</td>
	<td>
		<p><label></label>      
		<img id='imgSize1ImgSrc'  src='${picPath}${item.itemimageaddr}'  height="100" width="100" />
		<input type='file' id='imgSize1File' name='imgSize1File' class="file" onchange='submitImgSize1Upload()' /><span class="pos" id="imgSize1FileSpan">请上传图片的大小不超过3MB</span>
        <input type='hidden' id='itemimageaddr' name='itemimageaddr' value='${item.itemimageaddr}' reg="^.+$" tip="亲！您忘记上传图片了。" />
		</p>
	</td>
</tr>

<tr>
<td colspan="2" align="center"><input type="submit" value="提交"/>
</td>
</tr>
</table>

</form>
</body>

</html>