<<<<<<< HEAD
package com.hcl.ex;

class ca1 {
	int a, b;
	public ca1() {
		a = 4;
		b = 8;
	}

	@Override
	public String toString() {
		return "ca1 [a=" + a + ", b=" + b + "]";
	}
}

class ca2 extends ca1 {
	public ca2(int a, int b) {
		// this.a=a;
		// this.b=b;//super();
		// TODO Auto-generated constructor stub
	}
}

public class Test3 {
	public static void main(String[] args) {
		ca2 obj = new ca2(12, 5);
		System.out.println(obj);
	}
}
=======
package com.hcl.ex;

class ca1 {
	int a, b;
	public ca1() {
		a = 4;
		b = 8;
	}

	@Override
	public String toString() {
		return "ca1 [a=" + a + ", b=" + b + "]";
	}
}

class ca2 extends ca1 {
	public ca2(int a, int b) {
		// this.a=a;
		// this.b=b;//super();
		// TODO Auto-generated constructor stub
	}
}

public class Test3 {
	public static void main(String[] args) {
		ca2 obj = new ca2(12, 5);
		System.out.println(obj);
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
