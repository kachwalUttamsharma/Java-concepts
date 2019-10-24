<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align = "center">
 <h1>Employee List</h1>
 <br> <br>
  <form action="searchemployee" method="post"  >
  <h3>Enter Employ Name </h3>
  Employ Name:<input type="text" name="empname" />
  Band Name:<input type="text" name="bandname" />
  salary:<input type="text" name="salary" />
  <input type="submit" value="Search" />
 </form>
 <h2>No of Employess "${employeeList.size()}"</h2>
 <table border=  "2" >
 <tr>
 <th>Employee No</th>
 <th>Employee Name</th>
 <th>Salary</th>
 <th>Band</th>
 <th>Date Of Join</th>
 </tr>
 <c:forEach var = "lst" items = "${employeeList}">
 <tr>
       <td>${lst.empno}</td>
        <td>${lst.empname}</td>
         <td>${lst.salary}</td>
          <td>${lst.band}</td>
           <td>${lst.dateofjoin}</td>
 </c:forEach>
 </table>
 </div>
</body>
</html>