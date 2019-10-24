<<<<<<< HEAD
package com.hcl.library;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginLibraryServlet
 */
public class LoginLibraryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginLibraryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String user = request.getParameter("userName");
		String pwd = request.getParameter("password");
		String result = libraryBAL.loginBal(user, pwd);
		if (result == "login successfull") {
			RequestDispatcher disp = request.getRequestDispatcher("Menu.html");
			disp.include(request, response);
			HttpSession session = request.getSession(true);
			session.setAttribute("n", user);
			
		} 
		if (result == "Invalid credentials") {
			RequestDispatcher disp1 = request.getRequestDispatcher("LoginLibrary.html");
			disp1.include(request, response);
			out.println(result);
		}
		
		//out.println("<a href = 'SecondServlet'>Second Servlet</a>");
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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginLibraryServlet
 */
public class LoginLibraryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginLibraryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String user = request.getParameter("userName");
		String pwd = request.getParameter("password");
		String result = libraryBAL.loginBal(user, pwd);
		if (result == "login successfull") {
			RequestDispatcher disp = request.getRequestDispatcher("Menu.html");
			disp.include(request, response);
			HttpSession session = request.getSession(true);
			session.setAttribute("n", user);
			
		} 
		if (result == "Invalid credentials") {
			RequestDispatcher disp1 = request.getRequestDispatcher("LoginLibrary.html");
			disp1.include(request, response);
			out.println(result);
		}
		
		//out.println("<a href = 'SecondServlet'>Second Servlet</a>");
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
