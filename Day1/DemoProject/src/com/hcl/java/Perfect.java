<<<<<<< HEAD
package com.hcl.java;

public class Perfect {
	
	public void check(int n){
		int sum =0;
		for(int i=1;i<n;i++){
			if(n%i == 0){
				sum+=i;
			}
		}
			if(sum == n){
				System.out.println(n +" is Perfect");
			}
			else{
				System.out.println(n+" is not Perfect");
			}
			
		}

	
	public static void main(String[] args) {
		int n = 6;
		new Perfect().check(n);
	}

}
=======
package com.hcl.java;

public class Perfect {
	
	public void check(int n){
		int sum =0;
		for(int i=1;i<n;i++){
			if(n%i == 0){
				sum+=i;
			}
		}
			if(sum == n){
				System.out.println(n +" is Perfect");
			}
			else{
				System.out.println(n+" is not Perfect");
			}
			
		}

	
	public static void main(String[] args) {
		int n = 6;
		new Perfect().check(n);
	}

}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
