<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*, util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
	// java7 try with resources  auto close
	try(Connection connection = DBUtil.getDataSource().getConnection();
			Statement st = connection.createStatement();
			){
		String sql = "select * from employees";
		ResultSet rs = st.executeQuery(sql);
		
		out.println("<table><tr>"+
				"<th>EMPLOYEE_ID</th>"+
				"<th>FIRST_NAME</th>"+
				"<th>LAST_NAME</th>"+
				"<th>EMAIL</th>"+
				"<th>PHONE_NUMBER</th>"+
				"<th>HIRE_DATE</th>"+
				"<th>JOB_ID</th>"+
				"<th>SALARY</th>"+
				"<th>COMMISSION_PCT</th>"+
				"<th>MANAGER_ID</th>"+
				"<th>DEPARTMENT_ID</th>"+				
				"</tr>");
		
		while(rs.next()){
			int empId = rs.getInt("EMPLOYEE_ID");
			String firstName= rs.getString("FIRST_NAME");
			String lastName = rs.getString("LAST_NAME");
			String email = rs.getString("EMAIL");
			String phoneNumber = rs.getString("PHONE_NUMBER");
			//String hireDate = rs.getString("HIRE_DATE");
			Date hireDate = rs.getDate("HIRE_DATE");
			String jobId = rs.getString("JOB_ID");
			String salary = rs.getString("SALARY");
			String commissonPct = rs.getString("COMMISSION_PCT");
			String managerId = rs.getString("MANAGER_ID");
			String departmentId = rs.getString("DEPARTMENT_ID");
			out.println("<tr>"+
			"<td>"+empId+"</td>"+
			"<td>"+firstName+"</td>"+
			"<td>"+lastName+"</td>"+
			"<td>"+email+"</td>"+			
			"<td>"+phoneNumber+"</td>"+
			"<td>"+hireDate+"</td>"+
			"<td>"+jobId+"</td>"+
			"<td>"+salary+"</td>"+
			"<td>"+commissonPct+"</td>"+
			"<td>"+managerId+"</td>"+
			"<td>"+departmentId+"</td>"+
			"</td></tr>");			
		}
		
		out.println("</table>");
		
	}
	catch(Exception e){
		e.printStackTrace();
	}

%>

</body>
</html>