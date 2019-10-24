<<<<<<< HEAD
package com.hcl.library;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class searchServlet
 */
public class searchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		RequestDispatcher disp = request.getRequestDispatcher("MenuServlet");
		disp.include(request, response);
		
		RequestDispatcher disp1 = request.getRequestDispatcher("Search.html");
		disp1.include(request, response);
		
		String type = request.getParameter("searchtype");
		String value = request.getParameter("searchname");
		//books[] book1 = new books[20];
		
		ArrayList<books> book1 = new ArrayList<books>(20);
		
			book1 = libraryBAL.searchBookBal(type, value);
			
			//out.println(book1);
			
			out.println("<br/><table border = '3'>");
			out.print("<tr><th>Book Id</th><th>BookName</th><th>Author</th>");
			out.println("<th>Edition</th><th>Dept</th><th>TotalBooks</th><th>Issue</th></tr>");
			for(books b : book1){
				out.println("<tr><td>" + b.getId() + "</td>");
				out.println("<td>" + b.getName() + "</td>");
				out.println("<td>" + b.getAuthor() + "</td>");
				out.println("<td>" + b.getEdition() + "</td>");
				out.println("<td>" + b.getDept() + "</td>");
				out.println("<td>" + b.getTotalbooks() + "</td>");
				if(b.getTotalbooks()>0){
					out.write("<td><input type='checkbox' name = 'bookid' value ="+ b.getId()+"></td></tr>");
				}else{
					out.write("<td><input type='checkbox' name = 'bookid' disabled='true' value ="+ b.getId()+"></td></tr>");
				}
				
			}
				out.write("<form method = 'get' action = 'IssueServlet'><center><tr><td colspan = 7>"
						+ "<input type = 'submit' value = 'Issue'/></td></tr></center></form>");
		}
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
=======
package com.hcl.library;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class searchServlet
 */
public class searchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		RequestDispatcher disp = request.getRequestDispatcher("MenuServlet");
		disp.include(request, response);
		
		RequestDispatcher disp1 = request.getRequestDispatcher("Search.html");
		disp1.include(request, response);
		
		String type = request.getParameter("searchtype");
		String value = request.getParameter("searchname");
		//books[] book1 = new books[20];
		
		ArrayList<books> book1 = new ArrayList<books>(20);
		
			book1 = libraryBAL.searchBookBal(type, value);
			
			//out.println(book1);
			
			out.println("<br/><table border = '3'>");
			out.print("<tr><th>Book Id</th><th>BookName</th><th>Author</th>");
			out.println("<th>Edition</th><th>Dept</th><th>TotalBooks</th><th>Issue</th></tr>");
			for(books b : book1){
				out.println("<tr><td>" + b.getId() + "</td>");
				out.println("<td>" + b.getName() + "</td>");
				out.println("<td>" + b.getAuthor() + "</td>");
				out.println("<td>" + b.getEdition() + "</td>");
				out.println("<td>" + b.getDept() + "</td>");
				out.println("<td>" + b.getTotalbooks() + "</td>");
				if(b.getTotalbooks()>0){
					out.write("<td><input type='checkbox' name = 'bookid' value ="+ b.getId()+"></td></tr>");
				}else{
					out.write("<td><input type='checkbox' name = 'bookid' disabled='true' value ="+ b.getId()+"></td></tr>");
				}
				
			}
				out.write("<form method = 'get' action = 'IssueServlet'><center><tr><td colspan = 7>"
						+ "<input type = 'submit' value = 'Issue'/></td></tr></center></form>");
		}
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
