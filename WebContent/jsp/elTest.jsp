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
	섭씨 화씨 변환
	${empty param.temp ? "온도를 입력하시오" :
		(9.0/5.0) * param.temp + 32.0 } <br/>
	10은 ${10 % 2 == 0 ? "짝수" : "홀수"}입니다.<br/> 
	
	${pageContext.request.contextPath}

</body>
</html>