<%@page import="com.hcl.CollegeProject.FeedbackCrud"%>
<%@page import="com.hcl.CollegeProject.FeedBack"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.hcl.CollegeProject.HibernateUtil"%>
<%@page import="org.hibernate.SessionFactory"%>
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
  String fid=(String)session.getAttribute("fid");
  String name=(String)session.getAttribute("name");
  String inst=(String)session.getAttribute("inst");
  String sub=request.getParameter("subject");
  String fidv=request.getParameter("feedback");
%>

<form action="FeedBackConfirm.jsp" method="get">
<center>
Feedback Id:<input type="text" name="feedbackId" value=<%=fid %> /><br/><br/>
Student Name:<input type="text" name="StudentName" value=<%=name %> /><br/><br/>
Instructor Name:<input type="text" name="Instructor" value=<%=inst %> /> <br/><br/>
Subject:<input type="text" name="Subject" value=<%=sub %> /> <br/><br/>
FeedBack:<input type="text" name="feedbackvalue" value=<%=fidv %> /> <br/><br/>
         <input type="submit" value="Confirm Feedback" />
</center>
</form>
<%
if(request.getParameter("feedbackId")!=null &&
    request.getParameter("StudentName")!=null &&
    request.getParameter("Instructor")!=null &&
    request.getParameter("Subject")!=null &&
    request.getParameter("feedbackvalue")!=null){
	SessionFactory sf=HibernateUtil.getConnection();
	Session s=sf.openSession();
	FeedBack f=new FeedBack();
	f.setStudentName(request.getParameter("StudentName"));
	f.setFbvalue(request.getParameter("feedbackvalue"));
	f.setFid(request.getParameter("feedbackId"));
	f.setInstructor(request.getParameter("Instructor"));
	f.setSubject(request.getParameter("Subject"));
	String result=FeedbackCrud.addFeedBack(f);
	out.println(result);
}

%>
</body>
</html>