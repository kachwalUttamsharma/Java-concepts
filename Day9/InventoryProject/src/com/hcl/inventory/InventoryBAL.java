<<<<<<< HEAD
package com.hcl.inventory;


public class InventoryBAL {

	public static String placeOrderBal(String stockId, int quantity){
		return new InventoryDAO().placeOrderDao1(stockId, quantity);
	}
	
	
	public static Stock searchStockBal(String stockId){
		return new InventoryDAO().searchStockDao(stockId);
	}
	
	
	public static String addStockIdBal(Stock objStock){
		return new InventoryDAO().AddStockIdDao(objStock);
	}
	
	
	public static String generateStockIdBal(){
		return new InventoryDAO().generateStockIdDao();
    }
}
=======
package com.hcl.inventory;


public class InventoryBAL {

	public static String placeOrderBal(String stockId, int quantity){
		return new InventoryDAO().placeOrderDao1(stockId, quantity);
	}
	
	
	public static Stock searchStockBal(String stockId){
		return new InventoryDAO().searchStockDao(stockId);
	}
	
	
	public static String addStockIdBal(Stock objStock){
		return new InventoryDAO().AddStockIdDao(objStock);
	}
	
	
	public static String generateStockIdBal(){
		return new InventoryDAO().generateStockIdDao();
    }
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
