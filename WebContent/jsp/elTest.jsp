<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	${empty param.temp} <br/>
	���� ȭ�� ��ȯ
	${empty param.temp ? "�µ��� �Է��Ͻÿ�" :
		(9.0/5.0) * param.temp + 32.0 } <br/>
	10�� ${10 % 2 == 0 ? "¦��" : "Ȧ��"}�Դϴ�.<br/> 
	
	${pageContext.request.contextPath}

</body>
</html>