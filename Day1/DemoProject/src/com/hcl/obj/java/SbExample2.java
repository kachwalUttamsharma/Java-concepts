<<<<<<< HEAD
package com.hcl.obj.java;



public class SbExample2 {

public StringBuilder show(int age, String name, String course, String city){
		
		StringBuilder sbError  = new StringBuilder();
		boolean isValid =true;
		if(age<=20){
			sbError.append("Age must be greater than 20"+"\r\n");
			isValid = false;
		}
		if(name.indexOf(' ')== -1){
			sbError.append("Name contains both First and Last Name"+"\r\n");
			isValid = false;
		}
		if(!course.equalsIgnoreCase("JAVA")){
			sbError.append("Only Java course Allowed..."+"/r/n");
			isValid = false;
		}
		if(isValid == true){
		sbError.append("Age "+age+"\r\n");
		sbError.append("Name "+name+"\r\n");
		sbError.append("Course "+course+"\r\n");
		sbError.append("city "+city+"\r\n");
		}
		return sbError;
		}
	
	public static void main(String[] args) {
		int age;
		String name;
		String course;
		String city;
		age =21;
		name = "Ram jk";
		course = "Java";
		city="Delhi";
		StringBuilder sbRes = new SbExample2().show(age, name, course, city);
		System.out.println(sbRes);
	}
}
=======
package com.hcl.obj.java;



public class SbExample2 {

public StringBuilder show(int age, String name, String course, String city){
		
		StringBuilder sbError  = new StringBuilder();
		boolean isValid =true;
		if(age<=20){
			sbError.append("Age must be greater than 20"+"\r\n");
			isValid = false;
		}
		if(name.indexOf(' ')== -1){
			sbError.append("Name contains both First and Last Name"+"\r\n");
			isValid = false;
		}
		if(!course.equalsIgnoreCase("JAVA")){
			sbError.append("Only Java course Allowed..."+"/r/n");
			isValid = false;
		}
		if(isValid == true){
		sbError.append("Age "+age+"\r\n");
		sbError.append("Name "+name+"\r\n");
		sbError.append("Course "+course+"\r\n");
		sbError.append("city "+city+"\r\n");
		}
		return sbError;
		}
	
	public static void main(String[] args) {
		int age;
		String name;
		String course;
		String city;
		age =21;
		name = "Ram jk";
		course = "Java";
		city="Delhi";
		StringBuilder sbRes = new SbExample2().show(age, name, course, city);
		System.out.println(sbRes);
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
