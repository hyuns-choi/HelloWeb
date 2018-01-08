<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<c:set var="myName" value="gildong hong" />
	${myName} 문자열길이 : ${fn:length(myName)} <br/>
	
	<c:set var="myName" value="i am a student" />
	<c:forEach var="s" items="${fn:split(myName, ' ')}">
		${s} <br/>
	</c:forEach>
	<br/>
	
	<c:set var="news" value=" [서울=뉴시스] 김지훈 기자 = 김정은 북한" />
	<c:if test="${fn:contains(news, '김정은')}" >
	김정은 있다.
	</c:if><br/>
	
	${fn:substring(news,0,10)}...<br/>
	${fn:replace(news,'김정은','정은김')}...<br/>
	

</body>
</html>