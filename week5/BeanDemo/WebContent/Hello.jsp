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
	<jsp:useBean id="bean1" class="com.hcl.beans.hello" />
	Default Value is :
	<b>
		<jsp:getProperty property="message" name="bean1"/>
	</b>
	<jsp:setProperty property="message" name="bean1" value = "Good Afternoon..."/>
	<br/><br/>
	Updated Value is :
	<b>
		<jsp:getProperty property="message" name="bean1"/>
	</b>
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
	<jsp:useBean id="bean1" class="com.hcl.beans.hello" />
	Default Value is :
	<b>
		<jsp:getProperty property="message" name="bean1"/>
	</b>
	<jsp:setProperty property="message" name="bean1" value = "Good Afternoon..."/>
	<br/><br/>
	Updated Value is :
	<b>
		<jsp:getProperty property="message" name="bean1"/>
	</b>
</body>
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
</html>