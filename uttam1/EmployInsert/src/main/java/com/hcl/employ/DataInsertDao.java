<<<<<<< HEAD
package com.hcl.employ;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

public class DataInsertDao {
 
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void insertEmploy(){
		int empno,basic;
		String name,dept,desig;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employ No ");
		empno=Integer.parseInt(sc.nextLine());
		System.out.println("Name of Employ ");
		name=sc.nextLine();
		System.out.println("Department");
		dept=sc.nextLine();
		System.out.println("Designation");
		desig=sc.nextLine();
		System.out.println("Salary ");
	basic=Integer.parseInt(sc.nextLine());
	String cmd="insert into Employ values(?,?,?,?,?)";
	jdbcTemplate.update(cmd, new Object[]
			{
					empno,
					name,
					dept,
					desig,
					basic
			});
	System.out.println("Data Inserted...");
	}
}
=======
package com.hcl.employ;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

public class DataInsertDao {
 
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void insertEmploy(){
		int empno,basic;
		String name,dept,desig;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employ No ");
		empno=Integer.parseInt(sc.nextLine());
		System.out.println("Name of Employ ");
		name=sc.nextLine();
		System.out.println("Department");
		dept=sc.nextLine();
		System.out.println("Designation");
		desig=sc.nextLine();
		System.out.println("Salary ");
	basic=Integer.parseInt(sc.nextLine());
	String cmd="insert into Employ values(?,?,?,?,?)";
	jdbcTemplate.update(cmd, new Object[]
			{
					empno,
					name,
					dept,
					desig,
					basic
			});
	System.out.println("Data Inserted...");
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
