<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="help" scope="request" class="com.oraclejava.OlympicCheck"/>
<jsp:setProperty property="*" name="help"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%help.check(); %>
<%=Integer.parseInt(request.getParameter("mode"))==1 ? "��â" : "����" %> �ø��ȱ���
<%=Integer.parseInt(request.getParameter("mode"))==1 ? help.getPyungchang() : help.getTokyo() %>
�� ����

</body>
</html>