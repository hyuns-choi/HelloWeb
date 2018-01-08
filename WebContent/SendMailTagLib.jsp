<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="/WEB-INF/SendMailTagLib.tld" prefix="mail" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<mail:sendmail subject='<%=request.getParameter("subject") %>' contents='<%=request.getParameter("contents") %>' 
to='<%=request.getParameter("to") %>' from='<%=request.getParameter("from") %>'/>

</body>
</html>