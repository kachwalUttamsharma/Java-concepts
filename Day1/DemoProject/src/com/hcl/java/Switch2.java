<<<<<<< HEAD
package com.hcl.java;

public class Switch2 {
	
	public void check(String opt){
		switch(opt.toUpperCase()){
			case "INSERT" : System.out.println("Insert operation..");
			break;
			case "UPDATE" : System.out.println("Updation operation..");
			break;
			default : System.out.println("no operartion..");
		}
	}
	public static void main(String[] args) {
		String op = "Insert";
		new Switch2().check(op);
		
		
	}

}
=======
package com.hcl.java;

public class Switch2 {
	
	public void check(String opt){
		switch(opt.toUpperCase()){
			case "INSERT" : System.out.println("Insert operation..");
			break;
			case "UPDATE" : System.out.println("Updation operation..");
			break;
			default : System.out.println("no operartion..");
		}
	}
	public static void main(String[] args) {
		String op = "Insert";
		new Switch2().check(op);
		
		
	}

}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
