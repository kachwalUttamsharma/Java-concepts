<<<<<<< HEAD
<%@page import="javax.websocket.Session"%>
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
 int EMP_ID=Integer.parseInt(request.getParameter("ID"));out.println(EMP_ID);
String passWord=request.getParameter("PassWord");out.println(passWord);
boolean status=EmsBal.loginBal(EMP_ID,passWord);
 if(status){
	 String uid="";
	 uid=uid+EMP_ID;
	 session.setAttribute("EMP_ID",uid);
	 %>
	 <jsp:forward page="dashboard.jsp" />
	 <%}else{
	 %>
	 <jsp:include page="Login.html" />
	 <%
	 out.println("Invalid Login Credentials....");
	 }
	 %>
</body>
=======
<%@page import="javax.websocket.Session"%>
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
 int EMP_ID=Integer.parseInt(request.getParameter("ID"));out.println(EMP_ID);
String passWord=request.getParameter("PassWord");out.println(passWord);
boolean status=EmsBal.loginBal(EMP_ID,passWord);
 if(status){
	 String uid="";
	 uid=uid+EMP_ID;
	 session.setAttribute("EMP_ID",uid);
	 %>
	 <jsp:forward page="dashboard.jsp" />
	 <%}else{
	 %>
	 <jsp:include page="Login.html" />
	 <%
	 out.println("Invalid Login Credentials....");
	 }
	 %>
</body>
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
</html>