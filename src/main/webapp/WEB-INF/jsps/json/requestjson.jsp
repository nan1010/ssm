<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
function requestJson(){
	var jsonObj = JSON.stringify({"userid":"2", "username":"nan", "password":"123123"});
	$.ajax({
		type:'POST',
		url:'{pageContext.request.contextPath}/controller/requestjson.do',
		contentType:'application/json; charset=utf-8',
		data:jsonObj,
		success:function(data){
			alert(data);
		}
	})
}
function requestPojo(){
	$.ajax({
		type:'POST',
		url:'${pageContext.request.contextPath}/controller/requestpojo.do',
		data:'username=nan2&password=123123',
		success:function(data){
			alert(data.username);
		}
	})
}
</script>
</head>
<body>
<input type="button" value="请求json, 返回json" onclick="requestJson();">
<input type="button" value="请求pojo, 返回json" onclick="requestPojo();">
</body>
</html>