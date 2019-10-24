<<<<<<< HEAD
package com.hcl.inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class InventoryDAO {

	PreparedStatement pst;
	Connection con;
	
	public String placeOrderDao1(String stockId, int quantity){
		con = DaoConnection.getConnection();
		String result = "";
		double billAmt=0;
		double price;
		Stock objStock = searchStockDao(stockId);
		//double price = searchStockDao(stockId).getPrice();
		if(objStock!=null){
			price=objStock.getPrice();
			int qtyAvail=objStock.getQuantityAvail();
			if(qtyAvail-quantity >= 0) {
				String cmd = "update stock set quantityavail = quantityavail - ? where stockId = ?";
				try {
					pst = con.prepareStatement(cmd);
					pst.setInt(1, quantity);
					pst.setString(2, stockId);
					pst.executeUpdate();
				    billAmt=price*quantity;
					int orderid= generateOrderIdDao();
					cmd = "Insert into Orders (orderId , stockId,qtyord,billamt) values(?,?,?,?)";
					pst=con.prepareStatement(cmd);
					pst.setInt(1, orderid);
					pst.setString(2, stockId);
					pst.setInt(3, quantity);
					pst.setDouble(4,billAmt);
					pst.executeUpdate();cmd = "select sum(billamt)as gamt from orders";
					pst=con.prepareStatement(cmd);
					
					ResultSet rs = pst.executeQuery();
					rs.next();
					int b = rs.getInt("gamt");
					cmd = "update amount set gamt = ? ";
					pst = con.prepareStatement(cmd);
					pst.setDouble(1,b);
					pst.executeUpdate();
					result = "<<<Order Placed>>>";
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				result = "Insufficient stock";
			}
		}
			else{
			result = "Stock not found...";
		}
		return result;
	}
	
	
	public Stock searchStockDao(String stockid){
		con = DaoConnection.getConnection();
		String cmd = "select * from stock where stockid = ?";
		Stock objStock = null;
		
		try {
			pst = con.prepareStatement(cmd);
			pst.setString(1, stockid);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				objStock = new Stock();
				objStock.setItemName(rs.getString("itemName"));
				objStock.setPrice(rs.getDouble("Price"));
				objStock.setQuantityAvail(rs.getInt("QuantityAvail"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return objStock;
	}

	
	
	public String AddStockIdDao(Stock objStock){
		con = DaoConnection.getConnection();
		String cmd = "Insert into Stock (stockid,itemname,"
				+ "price,quantityavail) values (?,?,?,?)";
		String result = "";
		try {
			pst = con.prepareStatement(cmd);
			pst.setString(1, objStock.getStockId());
			pst.setString(2, objStock.getItemName());
			pst.setDouble(3, objStock.getPrice());
			pst.setInt(4, objStock.getQuantityAvail());
			pst.executeUpdate();
			result = "Stock Added Successfully...";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = e.getMessage();
		}
		return result;
	}
	
	
	
	
	public String generateStockIdDao(){
		con = DaoConnection.getConnection();
		String cmd = "select max(stockid) sid From stock";
		String resultId = "";
		String s = "";
	    try {
			pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			String stid = rs.getString("sid");
			int id = Integer.parseInt(stid.substring(1));
			id++;
//			if(id >= 1 && id <=9){
//				resultId = "s00" + id;
//			}
//			if(id >=10 && id <=99){
//				resultId = "s0" + id;
//			}
//			if(id>=100 && id <=999){
//				resultId += "s" + id;
//			}
			s = String.format("%03d", id);
			resultId = "s" + s;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultId;
		
		
	}
	
	
	public int generateOrderIdDao(){
		con = DaoConnection.getConnection();
		int id = 0;
		String cmd = "select case when max(orderid) is null"
		+ " Then 1 else Max(orderid)+1 end id "
				+ "From Orders";
		try {
			pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			id = rs.getInt("id");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;
	}

}
=======
package com.hcl.inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class InventoryDAO {

	PreparedStatement pst;
	Connection con;
	
	public String placeOrderDao1(String stockId, int quantity){
		con = DaoConnection.getConnection();
		String result = "";
		double billAmt=0;
		double price;
		Stock objStock = searchStockDao(stockId);
		//double price = searchStockDao(stockId).getPrice();
		if(objStock!=null){
			price=objStock.getPrice();
			int qtyAvail=objStock.getQuantityAvail();
			if(qtyAvail-quantity >= 0) {
				String cmd = "update stock set quantityavail = quantityavail - ? where stockId = ?";
				try {
					pst = con.prepareStatement(cmd);
					pst.setInt(1, quantity);
					pst.setString(2, stockId);
					pst.executeUpdate();
				    billAmt=price*quantity;
					int orderid= generateOrderIdDao();
					cmd = "Insert into Orders (orderId , stockId,qtyord,billamt) values(?,?,?,?)";
					pst=con.prepareStatement(cmd);
					pst.setInt(1, orderid);
					pst.setString(2, stockId);
					pst.setInt(3, quantity);
					pst.setDouble(4,billAmt);
					pst.executeUpdate();cmd = "select sum(billamt)as gamt from orders";
					pst=con.prepareStatement(cmd);
					
					ResultSet rs = pst.executeQuery();
					rs.next();
					int b = rs.getInt("gamt");
					cmd = "update amount set gamt = ? ";
					pst = con.prepareStatement(cmd);
					pst.setDouble(1,b);
					pst.executeUpdate();
					result = "<<<Order Placed>>>";
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				result = "Insufficient stock";
			}
		}
			else{
			result = "Stock not found...";
		}
		return result;
	}
	
	
	public Stock searchStockDao(String stockid){
		con = DaoConnection.getConnection();
		String cmd = "select * from stock where stockid = ?";
		Stock objStock = null;
		
		try {
			pst = con.prepareStatement(cmd);
			pst.setString(1, stockid);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				objStock = new Stock();
				objStock.setItemName(rs.getString("itemName"));
				objStock.setPrice(rs.getDouble("Price"));
				objStock.setQuantityAvail(rs.getInt("QuantityAvail"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return objStock;
	}

	
	
	public String AddStockIdDao(Stock objStock){
		con = DaoConnection.getConnection();
		String cmd = "Insert into Stock (stockid,itemname,"
				+ "price,quantityavail) values (?,?,?,?)";
		String result = "";
		try {
			pst = con.prepareStatement(cmd);
			pst.setString(1, objStock.getStockId());
			pst.setString(2, objStock.getItemName());
			pst.setDouble(3, objStock.getPrice());
			pst.setInt(4, objStock.getQuantityAvail());
			pst.executeUpdate();
			result = "Stock Added Successfully...";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = e.getMessage();
		}
		return result;
	}
	
	
	
	
	public String generateStockIdDao(){
		con = DaoConnection.getConnection();
		String cmd = "select max(stockid) sid From stock";
		String resultId = "";
		String s = "";
	    try {
			pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			String stid = rs.getString("sid");
			int id = Integer.parseInt(stid.substring(1));
			id++;
//			if(id >= 1 && id <=9){
//				resultId = "s00" + id;
//			}
//			if(id >=10 && id <=99){
//				resultId = "s0" + id;
//			}
//			if(id>=100 && id <=999){
//				resultId += "s" + id;
//			}
			s = String.format("%03d", id);
			resultId = "s" + s;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultId;
		
		
	}
	
	
	public int generateOrderIdDao(){
		con = DaoConnection.getConnection();
		int id = 0;
		String cmd = "select case when max(orderid) is null"
		+ " Then 1 else Max(orderid)+1 end id "
				+ "From Orders";
		try {
			pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			id = rs.getInt("id");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;
	}

}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
