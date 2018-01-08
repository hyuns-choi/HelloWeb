<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="help" scope="request" class="com.oraclejava.SpellCheck"/>
<jsp:setProperty property="*" name="help"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
you enter the input,<b>
<jsp:getProperty name="help" property="word"/></b></br>
The processed output is : <br>
<%=Integer.parseInt(request.getParameter("mode"))==1 ? help.reverse() : help.check() %>

</body>
</html>