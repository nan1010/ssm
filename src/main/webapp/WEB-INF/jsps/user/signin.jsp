<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"></script>
</head>
<body>
<form action="${pageContext.request.contextPath}/controller/signin.do" method="post">
<label>输入账号   ：</label>
<input type="text" id="txtUsername" name="username" placeholder="请输入邮箱账号" /><br/>
<label>输入密码   ：</label>
<input type="password" id="txtPassword1" name="password1" placeholder="请输入密码" /><br/>
<label>重复密码   ：</label>
<input type="password" id="txtPassword2" name="password2" placeholder="请再次输入密码" /><br/>
<input type="submit" value="确认注册" />
<input type="reset" value="重置" />
</form>
</body>
</html>