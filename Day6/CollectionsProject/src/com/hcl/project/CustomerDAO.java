<<<<<<< HEAD
package com.hcl.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
static List<Customer> lstCustomer = null;
	
	static{
		lstCustomer = new ArrayList<Customer>();
	}
	public String addCustomerDao(Customer customer){
		lstCustomer.add(customer);
		return "Customer Created successfully...";
	}
	
	public Customer searchCustomerDao(int custid){
		Customer objCustomer = null;
		for(Customer customer : lstCustomer){
			if(customer.getCustId() == custid){
				objCustomer = customer;
			}
		}return objCustomer;
	}
	
	public List<Customer> showCustomerDao(){
		return lstCustomer;
	}
	
	public String updateCustomerDao(Customer objcustomer){
		Customer customer = searchCustomerDao(objcustomer.getCustId());
		if(customer!=null){
			for(Customer c : lstCustomer ){
				if(c.getCustId()==objcustomer.getCustId()){
					c.setCustName(objcustomer.getCustName());
					c.setAnnualPremium(objcustomer.getAnnualPremium());
					c.setModalPremium(objcustomer.getModalPremium());
					c.setPaymentMode(objcustomer.getPaymentMode());
				}
				
			}return "Record Updated";
		}else {
			return "Customer not found";
			}
	}
	
	public String deleteCustomerDao(int custid){
		Customer customer = searchCustomerDao(custid);
		if(customer != null){
			lstCustomer.remove(customer);
			return "Customer Removed";
		}else{
			return "Customer Not found";
		}
	}
	
	public void writeCustomerFileDao() {
		try {
			FileOutputStream fout=new FileOutputStream("c:/files/customer.txt");
			ObjectOutputStream objout=new ObjectOutputStream(fout);
			objout.writeObject(lstCustomer);
			objout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readCustomerFileDao() {
		try {
			FileInputStream fin=new FileInputStream("c:/files/customer.txt");
			ObjectInputStream objin=new ObjectInputStream(fin);
			lstCustomer =(List<Customer>)objin.readObject();
			objin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
	

=======
package com.hcl.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
static List<Customer> lstCustomer = null;
	
	static{
		lstCustomer = new ArrayList<Customer>();
	}
	public String addCustomerDao(Customer customer){
		lstCustomer.add(customer);
		return "Customer Created successfully...";
	}
	
	public Customer searchCustomerDao(int custid){
		Customer objCustomer = null;
		for(Customer customer : lstCustomer){
			if(customer.getCustId() == custid){
				objCustomer = customer;
			}
		}return objCustomer;
	}
	
	public List<Customer> showCustomerDao(){
		return lstCustomer;
	}
	
	public String updateCustomerDao(Customer objcustomer){
		Customer customer = searchCustomerDao(objcustomer.getCustId());
		if(customer!=null){
			for(Customer c : lstCustomer ){
				if(c.getCustId()==objcustomer.getCustId()){
					c.setCustName(objcustomer.getCustName());
					c.setAnnualPremium(objcustomer.getAnnualPremium());
					c.setModalPremium(objcustomer.getModalPremium());
					c.setPaymentMode(objcustomer.getPaymentMode());
				}
				
			}return "Record Updated";
		}else {
			return "Customer not found";
			}
	}
	
	public String deleteCustomerDao(int custid){
		Customer customer = searchCustomerDao(custid);
		if(customer != null){
			lstCustomer.remove(customer);
			return "Customer Removed";
		}else{
			return "Customer Not found";
		}
	}
	
	public void writeCustomerFileDao() {
		try {
			FileOutputStream fout=new FileOutputStream("c:/files/customer.txt");
			ObjectOutputStream objout=new ObjectOutputStream(fout);
			objout.writeObject(lstCustomer);
			objout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readCustomerFileDao() {
		try {
			FileInputStream fin=new FileInputStream("c:/files/customer.txt");
			ObjectInputStream objin=new ObjectInputStream(fin);
			lstCustomer =(List<Customer>)objin.readObject();
			objin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
	

>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
