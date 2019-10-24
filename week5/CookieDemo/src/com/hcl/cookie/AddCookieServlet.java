<<<<<<< HEAD
package com.hcl.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCookieServlet
 */
public class AddCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		Cookie ckAnand = new Cookie("Anand", "52");
		ckAnand.setMaxAge(1000*24*60*60);
		response.addCookie(ckAnand);
		
		Cookie ckBindu = new Cookie("Bindu", "23");
		ckBindu.setMaxAge(1000*24*60*60);
		response.addCookie(ckBindu);
		
		Cookie ckTushar = new Cookie("Tushar", "5 82");
		ckTushar.setMaxAge(1000*24*60*60);
		response.addCookie(ckAnand);
		
		Cookie ckd = new Cookie("Ckd", "67");
		ckd.setMaxAge(1000*24*60*60);
		response.addCookie(ckAnand);
		
		out.println("Cookie Created Successfully <br/><br/>");
		out.println("<a href = 'showCookieServlet'>show Cookie</a>");
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
package com.hcl.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCookieServlet
 */
public class AddCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		Cookie ckAnand = new Cookie("Anand", "52");
		ckAnand.setMaxAge(1000*24*60*60);
		response.addCookie(ckAnand);
		
		Cookie ckBindu = new Cookie("Bindu", "23");
		ckBindu.setMaxAge(1000*24*60*60);
		response.addCookie(ckBindu);
		
		Cookie ckTushar = new Cookie("Tushar", "5 82");
		ckTushar.setMaxAge(1000*24*60*60);
		response.addCookie(ckAnand);
		
		Cookie ckd = new Cookie("Ckd", "67");
		ckd.setMaxAge(1000*24*60*60);
		response.addCookie(ckAnand);
		
		out.println("Cookie Created Successfully <br/><br/>");
		out.println("<a href = 'showCookieServlet'>show Cookie</a>");
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
