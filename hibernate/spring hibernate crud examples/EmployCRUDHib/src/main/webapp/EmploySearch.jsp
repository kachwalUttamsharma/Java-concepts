<%@page import="com.hcl.EmployCRUDHib.Employ"%>
<%@page import="com.hcl.EmployCRUDHib.EmployCrud"%>
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
int empno=Integer.parseInt(request.getParameter("empno"));
    EmployCrud crud=new EmployCrud();
    Employ e=crud.SearchEmploy(empno);
    %>
    <form method="get" action="EmploySearch.jsp" >
<center>
Employ No: <input type="text" name="empno" /> <br/><br/>
             <input type="submit" value="Search" />
</center>
</form>
    <% 
    if(e!=null){
    	out.println("Name "+e.getName()+"<br/>");
    	out.println("Department "+e.getDept()+ "<br/>" );
    	out.println("Designation "+e.getDesig()+ "<br/>");
    	out.println("Basic "+e.getBasic()+"<br./>");
    }else{
    	out.println("Not Found....");
    }
%>

</body>
</html>