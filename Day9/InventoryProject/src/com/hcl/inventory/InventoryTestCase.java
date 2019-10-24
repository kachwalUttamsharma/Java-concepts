<<<<<<< HEAD
package com.hcl.inventory;


import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class InventoryTestCase {

	
	@Test
	public void testPlaceOrder(){
		assertEquals("<<<Order Placed>>>", InventoryBAL.placeOrderBal("s020", 1));
		assertEquals("Insufficient stock", InventoryBAL.placeOrderBal("s021", 30));
		assertEquals("Stock not found...", InventoryBAL.placeOrderBal("s076", 10));
	}
	
	
	
	@Test
	public void testSearchStock(){
		assertNotNull(InventoryBAL.searchStockBal("s001"));
		assertNull(InventoryBAL.searchStockBal("s99"));
	}
	
	
	
	@Test
	public void testAddStock(){
		Stock obj = new Stock();
		String s = InventoryBAL.generateStockIdBal();
		obj.setStockId(s);
		obj.setItemName("system");
		obj.setPrice(3000);
		obj.setQuantityAvail(20);
		assertEquals("Stock Added Successfully...", InventoryBAL.addStockIdBal(obj));
	}
	
	
	@Test
	public void testGenerateStockId(){
		Connection con; 
		int id = 200;
		String s="";
		con = DaoConnection.getConnection();
		String cmd = "select max(stockid) sid From stock";
		String resultId = "";
	    PreparedStatement pst;
		try {
			pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			String stid = rs.getString("sid");
			id = Integer.parseInt(stid.substring(1));
			id++;
			s=String.format("%03d", id);
			s="s"+s;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		///String bid = InventoryBAL.generateStockIdBal();
		//int biid = Integer.parseInt(bid.substring(1));
		assertEquals(s, InventoryBAL.generateStockIdBal());
	
	}	
	
	
	@Test
	public void testGenerateOrderId(){
		int id = 0;
		InventoryDAO i = new InventoryDAO();
		Connection con = DaoConnection.getConnection();
		String cmd = "Select max(orderId)+1 id from orders";
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			id = rs.getInt("id");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(id, i.generateOrderIdDao());
	}
	
	
	@Test
	public void testGettersAndSetters(){
		Stock objStock = new Stock();
		objStock.setStockId("s004");
		objStock.setItemName("Med");
		objStock.setPrice(3000.00);
		objStock.setQuantityAvail(20);
		
		assertEquals("s004", objStock.getStockId());
		assertEquals("Med", objStock.getItemName());
		assertEquals(3000, objStock.getPrice(),0.00);
		assertEquals(20, objStock.getQuantityAvail());

		
	}
}
=======
package com.hcl.inventory;


import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class InventoryTestCase {

	
	@Test
	public void testPlaceOrder(){
		assertEquals("<<<Order Placed>>>", InventoryBAL.placeOrderBal("s020", 1));
		assertEquals("Insufficient stock", InventoryBAL.placeOrderBal("s021", 30));
		assertEquals("Stock not found...", InventoryBAL.placeOrderBal("s076", 10));
	}
	
	
	
	@Test
	public void testSearchStock(){
		assertNotNull(InventoryBAL.searchStockBal("s001"));
		assertNull(InventoryBAL.searchStockBal("s99"));
	}
	
	
	
	@Test
	public void testAddStock(){
		Stock obj = new Stock();
		String s = InventoryBAL.generateStockIdBal();
		obj.setStockId(s);
		obj.setItemName("system");
		obj.setPrice(3000);
		obj.setQuantityAvail(20);
		assertEquals("Stock Added Successfully...", InventoryBAL.addStockIdBal(obj));
	}
	
	
	@Test
	public void testGenerateStockId(){
		Connection con; 
		int id = 200;
		String s="";
		con = DaoConnection.getConnection();
		String cmd = "select max(stockid) sid From stock";
		String resultId = "";
	    PreparedStatement pst;
		try {
			pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			String stid = rs.getString("sid");
			id = Integer.parseInt(stid.substring(1));
			id++;
			s=String.format("%03d", id);
			s="s"+s;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		///String bid = InventoryBAL.generateStockIdBal();
		//int biid = Integer.parseInt(bid.substring(1));
		assertEquals(s, InventoryBAL.generateStockIdBal());
	
	}	
	
	
	@Test
	public void testGenerateOrderId(){
		int id = 0;
		InventoryDAO i = new InventoryDAO();
		Connection con = DaoConnection.getConnection();
		String cmd = "Select max(orderId)+1 id from orders";
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			id = rs.getInt("id");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(id, i.generateOrderIdDao());
	}
	
	
	@Test
	public void testGettersAndSetters(){
		Stock objStock = new Stock();
		objStock.setStockId("s004");
		objStock.setItemName("Med");
		objStock.setPrice(3000.00);
		objStock.setQuantityAvail(20);
		
		assertEquals("s004", objStock.getStockId());
		assertEquals("Med", objStock.getItemName());
		assertEquals(3000, objStock.getPrice(),0.00);
		assertEquals(20, objStock.getQuantityAvail());

		
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
