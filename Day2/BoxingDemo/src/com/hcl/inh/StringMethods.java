<<<<<<< HEAD
package com.hcl.inh;

public class StringMethods {
	
	public void character(String s,int pos){		
		
			if(pos>s.length()){
			System.out.println("Positon does not exist");
					
		}
			char[] arr = s.toCharArray();
				for(int j=0;j<pos;j++){
					if(j==pos){
						System.out.println(arr[pos]);
					}
				}		
		
	}
	public static void main(String[] args) {
		StringMethods sm = new StringMethods();
		sm.character("Hello",2);
	}
}
=======
package com.hcl.inh;

public class StringMethods {
	
	public void character(String s,int pos){		
		
			if(pos>s.length()){
			System.out.println("Positon does not exist");
					
		}
			char[] arr = s.toCharArray();
				for(int j=0;j<pos;j++){
					if(j==pos){
						System.out.println(arr[pos]);
					}
				}		
		
	}
	public static void main(String[] args) {
		StringMethods sm = new StringMethods();
		sm.character("Hello",2);
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
