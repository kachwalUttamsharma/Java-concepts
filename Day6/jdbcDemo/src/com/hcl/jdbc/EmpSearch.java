<<<<<<< HEAD
package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpSearch {
	public static void main(String[] args) {
		int empno;
		System.out.println("Enter Employ No");
		Scanner sc = new Scanner(System.in);
		empno = sc.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice","root","root");
			String cmd = "select * from emp where empno = ?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1,empno);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				System.out.println("Employ Name " +rs.getString("ename"));
				System.out.println("Job " +rs.getString("job"));
				System.out.println("Manager " +rs.getInt("mgr"));
				System.out.println("Hired Date " +rs.getDate("hiredate"));
				System.out.println("Salary " +rs.getInt("sal"));
				System.out.println("Commission " +rs.getInt("comm"));
				System.out.println("Department no " +rs.getInt("deptno"));
				
				
			}else{
				System.out.println("Record not found...");
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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpSearch {
	public static void main(String[] args) {
		int empno;
		System.out.println("Enter Employ No");
		Scanner sc = new Scanner(System.in);
		empno = sc.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice","root","root");
			String cmd = "select * from emp where empno = ?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1,empno);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				System.out.println("Employ Name " +rs.getString("ename"));
				System.out.println("Job " +rs.getString("job"));
				System.out.println("Manager " +rs.getInt("mgr"));
				System.out.println("Hired Date " +rs.getDate("hiredate"));
				System.out.println("Salary " +rs.getInt("sal"));
				System.out.println("Commission " +rs.getInt("comm"));
				System.out.println("Department no " +rs.getInt("deptno"));
				
				
			}else{
				System.out.println("Record not found...");
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
