<<<<<<< HEAD
package com.hcl.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AccountDAO {

	PreparedStatement pst;
	Connection con;
	
	public String withdrawAccountDao(int accountNo, int withdawAmount){
		con = DaoConnection.getConnection();
		String result = "";
		Accounts objAccounts = searchAccountDao(accountNo);
		if(objAccounts!=null){
			
			int amount = objAccounts.getAmount();
			String status = objAccounts.getStatus();
			if(status.equalsIgnoreCase("inactive")){
				result = "Account is closed...";
			}else{
			if(amount - withdawAmount >= 1000){
				String cmd = "update accounts set amount = amount - ? where accountno = ?";
				
				try {
					pst = con.prepareStatement(cmd);
					pst.setInt(1, withdawAmount);
					pst.setInt(2, accountNo);
					pst.executeUpdate();
					cmd = "Insert into Trans (accountNo , transamount,transtype) values(?,?,?)";
					pst=con.prepareStatement(cmd);
					pst.setInt(1, accountNo);
					pst.setInt(2, withdawAmount);
					pst.setString(3, "D");
					pst.executeUpdate();
					result = "Account debited";
				    } catch (SQLException e) {
					e.printStackTrace();
					
				   }
			     }else {
			    	 result = "Insufficient funds";
			     }
			}}  else{
			result = "Account not found...";
		}
		
		return result;
	}
	
	public String depositAccountDao(int accountNo,int depAmount){
		con = DaoConnection.getConnection();
		String result = "";
		String cmd = "Update Accounts set amount = amount +? where accountNo = ?";
		Accounts obj = searchAccountDao(accountNo);
		if(obj==null){
			result="Account not Found...";
		}else{
				String status = obj.getStatus();
				if(status.equalsIgnoreCase("inactive")){
					result = "Account Closed...";
				}else{
		try {
			pst = con.prepareStatement(cmd);
			pst.setInt(1, depAmount);
			pst.setInt(2, accountNo);
			pst.executeUpdate();
			cmd = "Insert into Trans (accountNo , transamount,transtype) values(?,?,?)";
			pst=con.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.setInt(2, depAmount);
			pst.setString(3, "C");
			pst.executeUpdate();
			result = "Amount Credited...";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = e.getMessage();
		}
	  }
	}
		return result;
	}
	
	
	
	public String closeAccountDao(int accountNo){
		con = DaoConnection.getConnection();
		String result = "";
		Accounts objAccount = searchAccountDao(accountNo);
		if(objAccount==null){
			result = "Account Not Found...";
		}else{
		
		String cmd = "update accounts set status = 'inactive' where Accountno = ?";
		
		try {
			pst = con.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.executeUpdate();
			result = "Account Closed";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		return result;
	}
	
	public String updateAccounDao(int accountNo , String city ,String state){
		con = DaoConnection.getConnection();
		Accounts objAccounts = searchAccountDao(accountNo);
		String cmd = "Update accounts set city = ? , State = ? where Accountno = ?";
		String result = "";
		if(objAccounts==null){
			result = "Account Not Found...";
		} else {
		  String status = objAccounts.getStatus();
		  if(status.equals("inactive")){
		  result = "Account is Closed...";
		  } else {
			 try {
			 pst = con.prepareStatement(cmd);
			 pst.setString(1, city);
			 pst.setString(2, state);
			 pst.setInt(3, accountNo);
			 pst.executeUpdate();
			 result = "****Account Updated****";
			 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = e.getMessage();
			    }
			}
		  }
	  return result;
     }
	
	
	
	public Accounts searchAccountDao(int accountNo){
		con = DaoConnection.getConnection();
		String cmd = "select * from accounts where accountno = ?";
		Accounts objAccounts = null;
		
		
		try {
			pst = con.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				objAccounts = new Accounts();
				objAccounts.setFirstName(rs.getString("firstName"));
				objAccounts.setLastName(rs.getString("lastName"));
				objAccounts.setCity(rs.getString("city"));
				objAccounts.setState(rs.getString("state"));
				objAccounts.setAmount(rs.getInt("Amount"));
				objAccounts.setCheqFacil(rs.getString("cheqFacil"));
				objAccounts.setAccountType(rs.getString("AccountType"));
				objAccounts.setStatus(rs.getString("status"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return objAccounts;
		
	}
	
	
	
	public String createAccountDao(Accounts objAccounts){
		con = DaoConnection.getConnection();
		String cmd = "Insert into accounts(accountno,firstname,"
				+ "lastname,city,state,amount,cheqfacil,"
				+ "accounttype) values (?,?,?,?,?,?,?,?)";
		String result = "";
		try {
			pst = con.prepareStatement(cmd);
			pst.setInt(1, objAccounts.getAccountNo());
			pst.setString(2, objAccounts.getFirstName());
			pst.setString(3, objAccounts.getLastName());
			pst.setString(4, objAccounts.getCity());
			pst.setString(5, objAccounts.getState());
			pst.setInt(6, objAccounts.getAmount());
			pst.setString(7, objAccounts.getCheqFacil());
			pst.setString(8, objAccounts.getAccountType());
			pst.executeUpdate();
			result = "Account Created Successfully...";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = e.getMessage();
		}
		return result;
	}
	
	
	
	public int generateAccountNoDao(){
		con = DaoConnection.getConnection();
		int accno = 0;
		String cmd = "select case when max(accountNo) is null"
		+ " Then 1 else Max(AccountNo)+1 end accno "
				+ "From Accounts";
		
		
		try {
			pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			accno = rs.getInt("accno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accno;
		
		
	}
}
=======
package com.hcl.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AccountDAO {

	PreparedStatement pst;
	Connection con;
	
	public String withdrawAccountDao(int accountNo, int withdawAmount){
		con = DaoConnection.getConnection();
		String result = "";
		Accounts objAccounts = searchAccountDao(accountNo);
		if(objAccounts!=null){
			
			int amount = objAccounts.getAmount();
			String status = objAccounts.getStatus();
			if(status.equalsIgnoreCase("inactive")){
				result = "Account is closed...";
			}else{
			if(amount - withdawAmount >= 1000){
				String cmd = "update accounts set amount = amount - ? where accountno = ?";
				
				try {
					pst = con.prepareStatement(cmd);
					pst.setInt(1, withdawAmount);
					pst.setInt(2, accountNo);
					pst.executeUpdate();
					cmd = "Insert into Trans (accountNo , transamount,transtype) values(?,?,?)";
					pst=con.prepareStatement(cmd);
					pst.setInt(1, accountNo);
					pst.setInt(2, withdawAmount);
					pst.setString(3, "D");
					pst.executeUpdate();
					result = "Account debited";
				    } catch (SQLException e) {
					e.printStackTrace();
					
				   }
			     }else {
			    	 result = "Insufficient funds";
			     }
			}}  else{
			result = "Account not found...";
		}
		
		return result;
	}
	
	public String depositAccountDao(int accountNo,int depAmount){
		con = DaoConnection.getConnection();
		String result = "";
		String cmd = "Update Accounts set amount = amount +? where accountNo = ?";
		Accounts obj = searchAccountDao(accountNo);
		if(obj==null){
			result="Account not Found...";
		}else{
				String status = obj.getStatus();
				if(status.equalsIgnoreCase("inactive")){
					result = "Account Closed...";
				}else{
		try {
			pst = con.prepareStatement(cmd);
			pst.setInt(1, depAmount);
			pst.setInt(2, accountNo);
			pst.executeUpdate();
			cmd = "Insert into Trans (accountNo , transamount,transtype) values(?,?,?)";
			pst=con.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.setInt(2, depAmount);
			pst.setString(3, "C");
			pst.executeUpdate();
			result = "Amount Credited...";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = e.getMessage();
		}
	  }
	}
		return result;
	}
	
	
	
	public String closeAccountDao(int accountNo){
		con = DaoConnection.getConnection();
		String result = "";
		Accounts objAccount = searchAccountDao(accountNo);
		if(objAccount==null){
			result = "Account Not Found...";
		}else{
		
		String cmd = "update accounts set status = 'inactive' where Accountno = ?";
		
		try {
			pst = con.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.executeUpdate();
			result = "Account Closed";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		return result;
	}
	
	public String updateAccounDao(int accountNo , String city ,String state){
		con = DaoConnection.getConnection();
		Accounts objAccounts = searchAccountDao(accountNo);
		String cmd = "Update accounts set city = ? , State = ? where Accountno = ?";
		String result = "";
		if(objAccounts==null){
			result = "Account Not Found...";
		} else {
		  String status = objAccounts.getStatus();
		  if(status.equals("inactive")){
		  result = "Account is Closed...";
		  } else {
			 try {
			 pst = con.prepareStatement(cmd);
			 pst.setString(1, city);
			 pst.setString(2, state);
			 pst.setInt(3, accountNo);
			 pst.executeUpdate();
			 result = "****Account Updated****";
			 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = e.getMessage();
			    }
			}
		  }
	  return result;
     }
	
	
	
	public Accounts searchAccountDao(int accountNo){
		con = DaoConnection.getConnection();
		String cmd = "select * from accounts where accountno = ?";
		Accounts objAccounts = null;
		
		
		try {
			pst = con.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				objAccounts = new Accounts();
				objAccounts.setFirstName(rs.getString("firstName"));
				objAccounts.setLastName(rs.getString("lastName"));
				objAccounts.setCity(rs.getString("city"));
				objAccounts.setState(rs.getString("state"));
				objAccounts.setAmount(rs.getInt("Amount"));
				objAccounts.setCheqFacil(rs.getString("cheqFacil"));
				objAccounts.setAccountType(rs.getString("AccountType"));
				objAccounts.setStatus(rs.getString("status"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return objAccounts;
		
	}
	
	
	
	public String createAccountDao(Accounts objAccounts){
		con = DaoConnection.getConnection();
		String cmd = "Insert into accounts(accountno,firstname,"
				+ "lastname,city,state,amount,cheqfacil,"
				+ "accounttype) values (?,?,?,?,?,?,?,?)";
		String result = "";
		try {
			pst = con.prepareStatement(cmd);
			pst.setInt(1, objAccounts.getAccountNo());
			pst.setString(2, objAccounts.getFirstName());
			pst.setString(3, objAccounts.getLastName());
			pst.setString(4, objAccounts.getCity());
			pst.setString(5, objAccounts.getState());
			pst.setInt(6, objAccounts.getAmount());
			pst.setString(7, objAccounts.getCheqFacil());
			pst.setString(8, objAccounts.getAccountType());
			pst.executeUpdate();
			result = "Account Created Successfully...";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = e.getMessage();
		}
		return result;
	}
	
	
	
	public int generateAccountNoDao(){
		con = DaoConnection.getConnection();
		int accno = 0;
		String cmd = "select case when max(accountNo) is null"
		+ " Then 1 else Max(AccountNo)+1 end accno "
				+ "From Accounts";
		
		
		try {
			pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			accno = rs.getInt("accno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accno;
		
		
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
