<<<<<<< HEAD
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
	String name = request.getParameter("userName");
	String pwd = request.getParameter("passWord");
	if(name.equals ("Anubhav") && pwd.equals("Anand")){
%>
	<jsp:forward page="menupage.html"></jsp:forward>
<% 		
	}else{
		out.println("Re Enter Credentials");
		%>
		<jsp:include page="login.html"></jsp:include>
		<% 
	}

%>
</body>
=======
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
	String name = request.getParameter("userName");
	String pwd = request.getParameter("passWord");
	if(name.equals ("Anubhav") && pwd.equals("Anand")){
%>
	<jsp:forward page="menupage.html"></jsp:forward>
<% 		
	}else{
		out.println("Re Enter Credentials");
		%>
		<jsp:include page="login.html"></jsp:include>
		<% 
	}

%>
</body>
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
</html>