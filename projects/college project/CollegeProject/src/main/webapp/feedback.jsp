
<%@page import="org.hibernate.Session"%>
<%@page import="com.hcl.CollegeProject.Subjects"%>
<%@page import="java.util.List"%>
<%@page import="com.hcl.CollegeProject.FeedbackCrud"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <script>
function submit(){
	document.inst.submit();
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <%  
 String res=FeedbackCrud.feedbackID();
 List<String> lst=FeedbackCrud.instructor();

  %>
 <form method="get" action="feedback.jsp" name="inst" >
 <center>
 Feed Back Id: <input type="text" value=<%=res %> name="feedback"><br/><br/>
 Student Name:<input type="text" name="StudentName"><br/><br/>
 
 Instructor: <select name="instructor" onchange="submit()">
  <% 
  for(String obj:lst){
   %>
	  <option ><%=obj %></option>
   <%
   }
  String fid= request.getParameter("feedback");
  String name=request.getParameter("StudentName");
  String inst= request.getParameter("instructor");
  session.setAttribute("inst", inst);
  session.setAttribute("name", name);
  session.setAttribute("fid", fid);
   %>
   </select>
   </center>
 </form>

   <form action="FeedBackConfirm.jsp" method="get">
    <center>
   
     Select Subject:<select name="subject">
		   <%
			   List<String> lst1=FeedbackCrud.getSubjects(inst);
			   for(String obj1:lst1){
			   %>
			   <option ><%=obj1 %></option>
			   <%
			   }
		   %>
 </select>
 </center>
 Please your feedback<br/><br/>
 <input type="radio" name="feedback" value="Excellent" />Excellent<br/>
 <input type="radio" name="feedback" value="Good" />Good<br/>
 <input type="radio" name="feedback" value="Adequate" />Adequate<br/>
 <input type="radio" name="feedback" value="InAdequate" />InAdequate<br/>
 <input type="radio" name="feedback" value="Bad" />Bad<br/>
 <input type="submit" value="Confirm FeedbacK" />
 </form>
</body>
</html>