<<<<<<< HEAD
package com.hcl.day3;

class Employ{
	int empno;
	String name;
	double basic;
	
	public Employ(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
		//System.out.println("aaaaa");
	}

	@Override
	public String toString() {
		//System.out.println("asjhsfjdhfj");
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
		
	}
	
}
class Amit extends Employ{

	public Amit(int empno, String name, double basic) {
		super(empno, name, basic);
		//System.out.println("bbb");
	}
}

class Vinod extends Employ{

	public Vinod(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}
public class SupCon {

	public static void main(String[] args) {
		Employ e1 = new Amit(1,"amit",34534);
		Employ e2 = new Vinod(3,"vinod",34577);
		//System.out.println(e1);
		//System.out.println(e2);
		Employ[] arrEmploy = new Employ[]{e1,e2};
		for (Employ employ : arrEmploy) {
			System.out.println(employ);
		}
		
	}
}



=======
package com.hcl.day3;

class Employ{
	int empno;
	String name;
	double basic;
	
	public Employ(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
		//System.out.println("aaaaa");
	}

	@Override
	public String toString() {
		//System.out.println("asjhsfjdhfj");
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
		
	}
	
}
class Amit extends Employ{

	public Amit(int empno, String name, double basic) {
		super(empno, name, basic);
		//System.out.println("bbb");
	}
}

class Vinod extends Employ{

	public Vinod(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}
public class SupCon {

	public static void main(String[] args) {
		Employ e1 = new Amit(1,"amit",34534);
		Employ e2 = new Vinod(3,"vinod",34577);
		//System.out.println(e1);
		//System.out.println(e2);
		Employ[] arrEmploy = new Employ[]{e1,e2};
		for (Employ employ : arrEmploy) {
			System.out.println(employ);
		}
		
	}
}



>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
