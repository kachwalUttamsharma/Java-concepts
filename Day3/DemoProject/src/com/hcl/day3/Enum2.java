<<<<<<< HEAD
package com.hcl.day3;

enum Dayname{
	Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
}

public class Enum2 {

	Dayname day;
	public Enum2(Dayname day){
		this.day=day;
	}
	public static void main(String[] args) {
		String day = "Wednesday";
		Enum2 obj = new Enum2(Dayname.valueOf(day));
		System.out.println(day);
	}
}
=======
package com.hcl.day3;

enum Dayname{
	Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
}

public class Enum2 {

	Dayname day;
	public Enum2(Dayname day){
		this.day=day;
	}
	public static void main(String[] args) {
		String day = "Wednesday";
		Enum2 obj = new Enum2(Dayname.valueOf(day));
		System.out.println(day);
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
