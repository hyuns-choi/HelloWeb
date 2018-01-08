<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% 
Date date = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
String sToday = sdf.format(date);
sToday= "2018-02-08";

%>
<%=date%>
	<form action="OlympicDay.jsp" method="post">
		date : <input type="text" size="20" name="date" value="<%=sToday %>" ><br/><br/>
		<input type="submit" value="Submit">
	</form>

</body>
</html>