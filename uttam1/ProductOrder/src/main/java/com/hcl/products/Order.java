<<<<<<< HEAD
package com.hcl.products;

public class Order {
	private int qtyord,orderid;
	private Product objproduct;
	public int getQtyord(){
		return qtyord;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	
	public Product getObjproduct() {
		return objproduct;
	}
	public void setObjproduct(Product objproduct) {
		this.objproduct = objproduct;
	}
	public void setQtyord(int qtyord) {
		this.qtyord = qtyord;
	}
   public void display(){
	   System.out.println("Quantity ordered : "+ qtyord +" Order ID : "+orderid);
	   objproduct.product();
   }
}
=======
package com.hcl.products;

public class Order {
	private int qtyord,orderid;
	private Product objproduct;
	public int getQtyord(){
		return qtyord;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	
	public Product getObjproduct() {
		return objproduct;
	}
	public void setObjproduct(Product objproduct) {
		this.objproduct = objproduct;
	}
	public void setQtyord(int qtyord) {
		this.qtyord = qtyord;
	}
   public void display(){
	   System.out.println("Quantity ordered : "+ qtyord +" Order ID : "+orderid);
	   objproduct.product();
   }
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
