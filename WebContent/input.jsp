<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="avoid">
<%--要使用Struts 2的防止表单重复提交功能，需要在form标签中使用token标签，
他会产生一个唯一的标识符，与其他参数一起提交到服务器，
服务器会根据token标签所产生的标识符判断表单是否为重复提交的表单，这个功能是由Token拦截器完成的。 --%>
    <s:token></s:token>
    <s:textfield name="username" label="姓名"></s:textfield>
    <s:textfield name="birthday" label="生日"></s:textfield>
    <s:submit value="submit"></s:submit>
</s:form>

</body>
</html>