<<<<<<< HEAD
package com.hcl.day6.collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapGenDemo {

	public static void main(String[] args) {
		Map<Integer , String> m = new Hashtable<Integer,String>();
		m.put(1, "Darshani");
		m.put(2, "Vinod");
		m.put(3, "Laksh");
		m.put(4, "Hema");
		m.put(5, "Raghu");
		
		int key;
		String result;
		System.out.println("Enter Key ");
		Scanner sc = new Scanner(System.in);
		key = sc.nextInt();
		result = m.getOrDefault(key, "Not Found ");
		System.out.println(result);
	}
}
=======
package com.hcl.day6.collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapGenDemo {

	public static void main(String[] args) {
		Map<Integer , String> m = new Hashtable<Integer,String>();
		m.put(1, "Darshani");
		m.put(2, "Vinod");
		m.put(3, "Laksh");
		m.put(4, "Hema");
		m.put(5, "Raghu");
		
		int key;
		String result;
		System.out.println("Enter Key ");
		Scanner sc = new Scanner(System.in);
		key = sc.nextInt();
		result = m.getOrDefault(key, "Not Found ");
		System.out.println(result);
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
