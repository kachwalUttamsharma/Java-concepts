<<<<<<< HEAD
package com.hcl.java;

public class MaxThree {
	
	public void check(int a, int b, int c){
	 if(a>b && a>c){
		System.out.println("Max  = "+ a); 
	 }
	 else{
		 if(b>a && b>c){
			 System.out.println("Max = "+b);
		 }
		 else{
			 System.out.println("Max = " +c);
		 }
	 }
	}
	public static void main(String[] args) {
		int a=10, b=11,c=12;
		new MaxThree().check(a, b, c);		
	}

}
=======
package com.hcl.java;

public class MaxThree {
	
	public void check(int a, int b, int c){
	 if(a>b && a>c){
		System.out.println("Max  = "+ a); 
	 }
	 else{
		 if(b>a && b>c){
			 System.out.println("Max = "+b);
		 }
		 else{
			 System.out.println("Max = " +c);
		 }
	 }
	}
	public static void main(String[] args) {
		int a=10, b=11,c=12;
		new MaxThree().check(a, b, c);		
	}

}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
