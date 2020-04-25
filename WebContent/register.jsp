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
<s:actionerror/>
  <form action="register.action" method="post">
    用户名:<input type="text" name="name"/><s:fielderror value="name"></s:fielderror><br>
    密码:<input type="password" name="pwd"/><br>
    年龄:<input type="text" name="age"/><br>
    生日:<input type="text" name="birthday"/><br>
    <input type="submit" value=" 登录 "/>
  </form>
</body>
</html>