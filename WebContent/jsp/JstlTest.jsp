<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:set var="dummyName" value="문1"/>
	<c:out value="${dummyName}" default="No Name"/><br/>
	<c:out value="${dummyName}">No Name</c:out><br/>
	<c:if test="${dummyName == null }">
	Empty
	</c:if>
	
	<c:if test="${dummyName == '문'}">
		<img src="../moon.jpg">
	</c:if>
	<c:if test="${dummyName == '안'}">
		<img src="../an.jpg">
	</c:if>
	<c:if test="${dummyName == '홍'}">
		<img src="../hong.jpg">
	</c:if>	<br/>
	
	<c:choose>
		<c:when test="${dummyName=='문'}">
		<img src="../moon.jpg">
		</c:when>
		<c:when test="${dummyName=='안'}">
		<img src="../an.jpg">
		</c:when>
		<c:when test="${dummyName=='홍'}">
		<img src="../hong.jpg">
		</c:when>
		<c:otherwise>
			<img src="../yoo.jpg">
		</c:otherwise>
	</c:choose> <br/>
	
	<c:forEach var="headerValue" items="${header}">
		${headerValue.key}, ${headerValue.value} <br/>
	</c:forEach>
	
	<c:forEach var="i" begin="1" end="10" step="1">
		${i} <br/>
	</c:forEach><br/>
	
	
	<!-- 일본 -->
	<fmt:setLocale value="en_us" />
		
	<c:set var="amount" value="12345678.1245" />
	<fmt:formatNumber value="${amount}" type="currency" /> <br/>
	<fmt:formatNumber value="${amount}" maxFractionDigits="3" /> <br/>
	<fmt:formatNumber value="${amount}" pattern="#,##0.##" /> <br/>
	
	
	<c:set var="today" value="<%= new java.util.Date() %>" />
	<fmt:formatDate value="${today}" type="date"/> <br/>
	<fmt:formatDate value="${today}" type="time"/> <br/>
	<fmt:formatDate value="${today}" type="both"/> <br/>
		
</body>
</html>