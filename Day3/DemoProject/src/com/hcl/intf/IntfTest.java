<<<<<<< HEAD
package com.hcl.intf;

interface IFirst {
	default void name() // Defender Method
	{
		System.out.println("IFirst");

	}
}
	interface ISecond {
		default void name() {
			System.out.println("ISecond");
		}
	}


interface IThird {
	default void name() {
		System.out.println("IThird");
	}
}

class Demo implements IFirst, ISecond, IThird {

	@Override
	public void name() {
		IFirst.super.name();
		ISecond.super.name();
		IThird.super.name();
	}

}

public class IntfTest {

	public static void main(String[] args) {
		new Demo().name();
	}
}
=======
package com.hcl.intf;

interface IFirst {
	default void name() // Defender Method
	{
		System.out.println("IFirst");

	}
}
	interface ISecond {
		default void name() {
			System.out.println("ISecond");
		}
	}


interface IThird {
	default void name() {
		System.out.println("IThird");
	}
}

class Demo implements IFirst, ISecond, IThird {

	@Override
	public void name() {
		IFirst.super.name();
		ISecond.super.name();
		IThird.super.name();
	}

}

public class IntfTest {

	public static void main(String[] args) {
		new Demo().name();
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
 