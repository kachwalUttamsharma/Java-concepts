<<<<<<< HEAD
package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class EmployShow {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice","root","root");
			//System.out.println("Connected");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from Employ");
			while(rs.next()){
				System.out.println("Employ no : "+rs.getInt("empno"));
				System.out.println("Employ name : " +rs.getString("name"));
				System.out.println("Department name : " +rs.getString("dept"));
				System.out.println("Designation name : " +rs.getString("desig"));
				System.out.println("Basic : " +rs.getInt("basic"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
=======
package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class EmployShow {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice","root","root");
			//System.out.println("Connected");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from Employ");
			while(rs.next()){
				System.out.println("Employ no : "+rs.getInt("empno"));
				System.out.println("Employ name : " +rs.getString("name"));
				System.out.println("Department name : " +rs.getString("dept"));
				System.out.println("Designation name : " +rs.getString("desig"));
				System.out.println("Basic : " +rs.getInt("basic"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
