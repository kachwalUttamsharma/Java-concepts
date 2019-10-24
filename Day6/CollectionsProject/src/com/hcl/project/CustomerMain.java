<<<<<<< HEAD
package com.hcl.project;

import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

public class CustomerMain {
	
	static ResourceBundle rb = ResourceBundle.getBundle("project");
	public static void deleteCustomer() {
		int custId;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Id  ");
		custId=sc.nextInt();
		CustomerBAL obj=new CustomerBAL();
		String res=obj.deleteCustomerBal(custId);
		System.out.println(res);
	}
	public static void updateCustomer() {
		Customer objCustomer=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Id  ");
		objCustomer.setCustId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Customer Name  ");
		objCustomer.setCustName(sc.nextLine());
		System.out.println("Enter Annual Premium  ");
		objCustomer.setAnnualPremium(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter Modal Premium  ");
		objCustomer.setModalPremium(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter Payment Mode  ");
		objCustomer.setPaymentMode(Integer.parseInt(sc.nextLine()));
		CustomerBAL obj=new CustomerBAL();
		String res=obj.updateCustomerBal(objCustomer);
		System.out.println(res);
	}
	public static void showCustomer() {
		CustomerBAL obj=new CustomerBAL();
		List<Customer> lstCustomer=obj.showCustomerBal();
		for (Customer customer : lstCustomer) {
			System.out.println(customer);
		}
	}
	
	public static void searchCustomer() {
		int custId;
		System.out.println("Enter Customer Id  ");
		Scanner sc=new Scanner(System.in);
		custId=sc.nextInt();
		CustomerBAL obj=new CustomerBAL(); 
		Customer objCustomer=obj.searchCustomerBal(custId);
		if(objCustomer!=null) {
			System.out.println(objCustomer);
		} else {
			System.out.println("Customer not found...");
		}
		
	}
	public static void addCustomer() {
		//ResourceBundle rb = ResourceBundle.getBundle("project");
		Customer objCustomer=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Id  ");
		objCustomer.setCustId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Customer Name  ");
		objCustomer.setCustName(sc.nextLine());
		System.out.println("Enter Annual Premium  ");
		objCustomer.setAnnualPremium(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter Modal Premium  ");
		objCustomer.setModalPremium(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter Payment Mode  ");
		objCustomer.setPaymentMode(Integer.parseInt(sc.nextLine()));
		CustomerBAL obj=new CustomerBAL();
		try {
			boolean res=obj.addCustomerBal(objCustomer);
			if(res==true) {
				System.out.println(rb.getString("added"));
			}
		} catch (CustomerException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void writeCustomerFile() {
		new CustomerBAL().writeCustomerFileBal();
	}
	
	public static void readCustomerFile() {
		new CustomerBAL().readCustomerFileBal();
	}
	
	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Options");
			System.out.println("---------");
			System.out.println("1. Add Customer");
			System.out.println("2. Show Customer");
			System.out.println("3. Search Customer");
			System.out.println("4. Update Customer");
			System.out.println("5. Delete Customer");
			System.out.println("6. Write Customer File");
			System.out.println("7. Read Customer File");
			System.out.println("6. Exit");
			System.out.println("Enter Ur Choice  ");
			ch=sc.nextInt();
			switch(ch) {
			case 1 : 
				addCustomer();
				break;
			case 2 :
				showCustomer();
				break;
			case 3 :
				searchCustomer();
				break;
			case 4 : 
				updateCustomer();
				break;
			case 5 : 
				deleteCustomer();
				break;
			case 6 : 
				writeCustomerFile();
				break;
			case 7 : 
				readCustomerFile(); 
				break;
			case 8 : 
				return;
			default : 
				System.out.println("Invalid Choice");
			}
		} while(ch!=8);
	}
=======
package com.hcl.project;

import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

public class CustomerMain {
	
	static ResourceBundle rb = ResourceBundle.getBundle("project");
	public static void deleteCustomer() {
		int custId;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Id  ");
		custId=sc.nextInt();
		CustomerBAL obj=new CustomerBAL();
		String res=obj.deleteCustomerBal(custId);
		System.out.println(res);
	}
	public static void updateCustomer() {
		Customer objCustomer=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Id  ");
		objCustomer.setCustId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Customer Name  ");
		objCustomer.setCustName(sc.nextLine());
		System.out.println("Enter Annual Premium  ");
		objCustomer.setAnnualPremium(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter Modal Premium  ");
		objCustomer.setModalPremium(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter Payment Mode  ");
		objCustomer.setPaymentMode(Integer.parseInt(sc.nextLine()));
		CustomerBAL obj=new CustomerBAL();
		String res=obj.updateCustomerBal(objCustomer);
		System.out.println(res);
	}
	public static void showCustomer() {
		CustomerBAL obj=new CustomerBAL();
		List<Customer> lstCustomer=obj.showCustomerBal();
		for (Customer customer : lstCustomer) {
			System.out.println(customer);
		}
	}
	
	public static void searchCustomer() {
		int custId;
		System.out.println("Enter Customer Id  ");
		Scanner sc=new Scanner(System.in);
		custId=sc.nextInt();
		CustomerBAL obj=new CustomerBAL(); 
		Customer objCustomer=obj.searchCustomerBal(custId);
		if(objCustomer!=null) {
			System.out.println(objCustomer);
		} else {
			System.out.println("Customer not found...");
		}
		
	}
	public static void addCustomer() {
		//ResourceBundle rb = ResourceBundle.getBundle("project");
		Customer objCustomer=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Id  ");
		objCustomer.setCustId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Customer Name  ");
		objCustomer.setCustName(sc.nextLine());
		System.out.println("Enter Annual Premium  ");
		objCustomer.setAnnualPremium(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter Modal Premium  ");
		objCustomer.setModalPremium(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter Payment Mode  ");
		objCustomer.setPaymentMode(Integer.parseInt(sc.nextLine()));
		CustomerBAL obj=new CustomerBAL();
		try {
			boolean res=obj.addCustomerBal(objCustomer);
			if(res==true) {
				System.out.println(rb.getString("added"));
			}
		} catch (CustomerException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void writeCustomerFile() {
		new CustomerBAL().writeCustomerFileBal();
	}
	
	public static void readCustomerFile() {
		new CustomerBAL().readCustomerFileBal();
	}
	
	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Options");
			System.out.println("---------");
			System.out.println("1. Add Customer");
			System.out.println("2. Show Customer");
			System.out.println("3. Search Customer");
			System.out.println("4. Update Customer");
			System.out.println("5. Delete Customer");
			System.out.println("6. Write Customer File");
			System.out.println("7. Read Customer File");
			System.out.println("6. Exit");
			System.out.println("Enter Ur Choice  ");
			ch=sc.nextInt();
			switch(ch) {
			case 1 : 
				addCustomer();
				break;
			case 2 :
				showCustomer();
				break;
			case 3 :
				searchCustomer();
				break;
			case 4 : 
				updateCustomer();
				break;
			case 5 : 
				deleteCustomer();
				break;
			case 6 : 
				writeCustomerFile();
				break;
			case 7 : 
				readCustomerFile(); 
				break;
			case 8 : 
				return;
			default : 
				System.out.println("Invalid Choice");
			}
		} while(ch!=8);
	}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
}