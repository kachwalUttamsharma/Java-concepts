<<<<<<< HEAD
<%@page import="com.hcl.ems.Employ"%>
<%@page import="com.hcl.ems.EmsBal"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	
	out.println("MyAccount Details");
	int EMP_ID=Integer.parseInt((String)session.getAttribute("EMP_ID"));
		out.println(EMP_ID);
		Employ emp = EmsBal.getAccountInfoBal(EMP_ID);
		out.println("<table>");
		out.println("<tr><th>Employ ID </th><td>"+emp.getEmpId()+"</td></tr>");
		out.println("<tr><th> Name</th><td>"+emp.getEmpName()+"</td></tr>");
		out.println("<tr><th> Email</th><td>"+emp.getEmpMail()+"</td></tr>");
		out.println("<tr><th> Department </th><td>"+emp.getEmpDpeName()+"</td></tr>");
		out.println("<tr><th> Join Date </th><td>"+emp.getEmpDateJoined()+"</td></tr>");
		out.println("<tr><th> Mobile No. </th><td>"+emp.getEmpMobNo()+"</td></tr>");
		out.println("<tr><th> Leave Balance </th><td>"+emp.getEmpLeaveBalance()+"</td></tr>");
		out.println("</table>");
	%>

</body>
=======
<%@page import="com.hcl.ems.Employ"%>
<%@page import="com.hcl.ems.EmsBal"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	
	out.println("MyAccount Details");
	int EMP_ID=Integer.parseInt((String)session.getAttribute("EMP_ID"));
		out.println(EMP_ID);
		Employ emp = EmsBal.getAccountInfoBal(EMP_ID);
		out.println("<table>");
		out.println("<tr><th>Employ ID </th><td>"+emp.getEmpId()+"</td></tr>");
		out.println("<tr><th> Name</th><td>"+emp.getEmpName()+"</td></tr>");
		out.println("<tr><th> Email</th><td>"+emp.getEmpMail()+"</td></tr>");
		out.println("<tr><th> Department </th><td>"+emp.getEmpDpeName()+"</td></tr>");
		out.println("<tr><th> Join Date </th><td>"+emp.getEmpDateJoined()+"</td></tr>");
		out.println("<tr><th> Mobile No. </th><td>"+emp.getEmpMobNo()+"</td></tr>");
		out.println("<tr><th> Leave Balance </th><td>"+emp.getEmpLeaveBalance()+"</td></tr>");
		out.println("</table>");
	%>

</body>
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
</html>