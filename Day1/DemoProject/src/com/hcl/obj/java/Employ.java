<<<<<<< HEAD
package com.hcl.obj.java;

public class Employ {
	
	int empno;
	String empname;
	double basic;
	
	public Employ[] showEmploy(){
		Employ[] arrEmploy = new Employ[3];
		
		arrEmploy[0] = new Employ();
		arrEmploy[0].empno = 1;
		arrEmploy[0].empname = "Aditya";
		arrEmploy[0].basic = 57455.0;
		
		arrEmploy[1] = new Employ();
		arrEmploy[1].empno = 2;
		arrEmploy[1].empname = "Ram";
		arrEmploy[1].basic = 577491.0;

		arrEmploy[2] = new Employ();
		arrEmploy[2].empno = 3;
		arrEmploy[2].empname = "prakra";
		arrEmploy[2].basic = 15655.0;
		
		return arrEmploy;
	}
	public static void main(String[] args) {
		Employ[] empRes = new Employ().showEmploy();
		for (Employ i : empRes) {
			System.out.println(i.empno +" "+ i.empname+" "+i.basic);
		}

	}

}
=======
package com.hcl.obj.java;

public class Employ {
	
	int empno;
	String empname;
	double basic;
	
	public Employ[] showEmploy(){
		Employ[] arrEmploy = new Employ[3];
		
		arrEmploy[0] = new Employ();
		arrEmploy[0].empno = 1;
		arrEmploy[0].empname = "Aditya";
		arrEmploy[0].basic = 57455.0;
		
		arrEmploy[1] = new Employ();
		arrEmploy[1].empno = 2;
		arrEmploy[1].empname = "Ram";
		arrEmploy[1].basic = 577491.0;

		arrEmploy[2] = new Employ();
		arrEmploy[2].empno = 3;
		arrEmploy[2].empname = "prakra";
		arrEmploy[2].basic = 15655.0;
		
		return arrEmploy;
	}
	public static void main(String[] args) {
		Employ[] empRes = new Employ().showEmploy();
		for (Employ i : empRes) {
			System.out.println(i.empno +" "+ i.empname+" "+i.basic);
		}

	}

}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
