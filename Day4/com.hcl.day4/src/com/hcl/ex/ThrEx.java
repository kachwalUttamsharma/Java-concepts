<<<<<<< HEAD
package com.hcl.ex;

public class ThrEx {
	public void show(int x){
		boolean flag = true;
		if(x<0){
			flag = false;
			throw new NumberFormatException("Neg no.s are not allowed");
		}
		if(x==0){
			flag = false;
			throw new ArithmeticException("Zero is Invalid");
		}
	}
	public static void main(String[] args) {
		int n = -12;
		try {
			new ThrEx().show(n);
		} catch (NumberFormatException e){
			System.out.println(e.getMessage());
		} catch (ArithmeticException e){
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
=======
package com.hcl.ex;

public class ThrEx {
	public void show(int x){
		boolean flag = true;
		if(x<0){
			flag = false;
			throw new NumberFormatException("Neg no.s are not allowed");
		}
		if(x==0){
			flag = false;
			throw new ArithmeticException("Zero is Invalid");
		}
	}
	public static void main(String[] args) {
		int n = -12;
		try {
			new ThrEx().show(n);
		} catch (NumberFormatException e){
			System.out.println(e.getMessage());
		} catch (ArithmeticException e){
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
