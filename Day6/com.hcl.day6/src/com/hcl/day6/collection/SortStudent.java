<<<<<<< HEAD
package com.hcl.day6.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortStudent {
	public static void main(String[] args) {
	Comparator v = new NameStuComprtr();
	Set<Student> setStudent = new TreeSet<Student>(v);
	setStudent.add(new Student("Laksh","Babbar","Delhi",79.56));
	setStudent.add(new Student("Athar","Abbas","Punjab",89.56));
	setStudent.add(new Student("Butamn","Sharma","maharashtra",69.26));
	setStudent.add(new Student("ANu","Jain","Chennai",48.03));
	setStudent.add(new Student("Geet","Mehta","Bangalore",56.24));
	System.out.println("LIST");
	setStudent.forEach(System.out::println);
	
}
=======
package com.hcl.day6.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortStudent {
	public static void main(String[] args) {
	Comparator v = new NameStuComprtr();
	Set<Student> setStudent = new TreeSet<Student>(v);
	setStudent.add(new Student("Laksh","Babbar","Delhi",79.56));
	setStudent.add(new Student("Athar","Abbas","Punjab",89.56));
	setStudent.add(new Student("Butamn","Sharma","maharashtra",69.26));
	setStudent.add(new Student("ANu","Jain","Chennai",48.03));
	setStudent.add(new Student("Geet","Mehta","Bangalore",56.24));
	System.out.println("LIST");
	setStudent.forEach(System.out::println);
	
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
}