<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/change?lan=zh&loc=CN">中文</a>|<a href="${pageContext.request.contextPath}/change?lan=en&loc=US">英文</a><br />
	<form action="${pageContext.request.contextPath}/user" method="post">
		<s:text name="userName"></s:text>：<input name="loginName" /><br />
		<s:text name="userPwd"></s:text>：<input name="loginPwd" /><br />
		<input type="submit" value="<s:text name="btnLogin"></s:text>" />
	</form>
</body>
</html>