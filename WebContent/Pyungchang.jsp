<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>평창올림픽</title>
</head>
<body>

<% 
	Calendar today = Calendar.getInstance();
	Calendar dday = Calendar.getInstance();
	
	dday.set(2018,1,9);	// month = 0 base
	
	long day = dday.getTimeInMillis() / 86400000;
	// (1일의 값(86400000 = 24시간 * 60분 * 60초 * 1000(1초값) ))
	
	long tday = today.getTimeInMillis() / 86400000;
	long count = (day - tday) + 1;

%>

평창올림픽까지 : <%=count%> 일<br>

</body>
</html>