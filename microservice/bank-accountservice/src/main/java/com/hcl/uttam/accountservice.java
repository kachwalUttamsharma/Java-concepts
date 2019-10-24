package com.hcl.uttam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class accountservice {
	
	@Autowired
	accountrepository accountrepository;
	
	public List<account> getAccount(int userid){
		System.out.println("AccountService : getAccount("+userid+") ");
		return accountrepository.getAccountByUserid(userid);
	}
	
 public String addAccount(account account) {
	 if(account !=null) {
		 accountrepository.save(account);
		 return "account created successfully";
	 }else {
	 return "account details are empty";
 }

 }
 
 public String deleteAccount(int accountnum) {
	  accountrepository.deleteById(accountnum);
   return "account deleted successfully";
 }
}
