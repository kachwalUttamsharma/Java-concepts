<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="conn" 
driver="com.mysql.jdbc.Driver"
	url = "jdbc:mysql://localhost:3306/bank"
	user = "root"
	password = "root"
/>

<sql:query var="accounts" dataSource="${conn}">
	select max(accountNo)+1 Accno from accounts
 </sql:query>
 <c:set var="accno" value="0"/>
 <c:forEach var = "a" items="${accounts.rows}">
 	<c:set var = "accno" value="${a.Accno}"></c:set>
 </c:forEach>
Account No :
<b>
<c:out value="${accno}"/>
</b> 
<br/><br/>
<sql:update dataSource="${conn}" var="accounts">
insert into accounts(accountno,firstname,lastname,city,state,amount,cheqfacil,accounttype)
values(?,?,?,?,?,?,?,?)
<sql:param value='${accno}'/>
<sql:param value='${param["firstName"]}'/>
<sql:param value='${param["lasttName"]}'/>
<sql:param value='${param["city"]}'/>
<sql:param value='${param["state"]}'/>
<sql:param value='${param["amount"]}'/>
<sql:param value='${param["cheqFacil"]}'/>
<sql:param value='${param["accountType"]}'/>
</sql:update>
<c:out value="Account Created..."></c:out>
</body>
=======
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="conn" 
driver="com.mysql.jdbc.Driver"
	url = "jdbc:mysql://localhost:3306/bank"
	user = "root"
	password = "root"
/>

<sql:query var="accounts" dataSource="${conn}">
	select max(accountNo)+1 Accno from accounts
 </sql:query>
 <c:set var="accno" value="0"/>
 <c:forEach var = "a" items="${accounts.rows}">
 	<c:set var = "accno" value="${a.Accno}"></c:set>
 </c:forEach>
Account No :
<b>
<c:out value="${accno}"/>
</b> 
<br/><br/>
<sql:update dataSource="${conn}" var="accounts">
insert into accounts(accountno,firstname,lastname,city,state,amount,cheqfacil,accounttype)
values(?,?,?,?,?,?,?,?)
<sql:param value='${accno}'/>
<sql:param value='${param["firstName"]}'/>
<sql:param value='${param["lasttName"]}'/>
<sql:param value='${param["city"]}'/>
<sql:param value='${param["state"]}'/>
<sql:param value='${param["amount"]}'/>
<sql:param value='${param["cheqFacil"]}'/>
<sql:param value='${param["accountType"]}'/>
</sql:update>
<c:out value="Account Created..."></c:out>
</body>
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
</html>