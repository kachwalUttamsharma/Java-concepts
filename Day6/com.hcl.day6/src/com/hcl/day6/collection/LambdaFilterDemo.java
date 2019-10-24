<<<<<<< HEAD
package com.hcl.day6.collection;

import java.util.ArrayList;
import java.util.List;

public class LambdaFilterDemo {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product (1,"Samsung",17000));
		list.add(new Product (1,"Iphone",65000));
		list.add(new Product (1,"Sony",27000));
		list.add(new Product (1,"Pixel",56000));
		list.add(new Product (1,"Redmi",12000));
		list.add(new Product (1,"Oneplus",75000));
		
		list.stream().filter(p -> p.price >= 30000).forEach(x ->{
			System.out.println(x);
		});
		System.out.println("Names starting with s");
		list.stream().filter(p -> p.name.startsWith("S")).forEach(x ->{
			System.out.println(x.name);
		});
		
		Product maxp = list.stream().max((p1,p2) -> p1.price >= p2.price ?
				1 : -1).get();
		System.out.println("Max Price Record");
		System.out.println(maxp);
		
		Product minp = list.stream().min((p1,p2) -> p1.price >= p2.price ?
				1 : -1).get();
		System.out.println("Min Price Record");
		System.out.println(minp);
	}
}
=======
package com.hcl.day6.collection;

import java.util.ArrayList;
import java.util.List;

public class LambdaFilterDemo {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product (1,"Samsung",17000));
		list.add(new Product (1,"Iphone",65000));
		list.add(new Product (1,"Sony",27000));
		list.add(new Product (1,"Pixel",56000));
		list.add(new Product (1,"Redmi",12000));
		list.add(new Product (1,"Oneplus",75000));
		
		list.stream().filter(p -> p.price >= 30000).forEach(x ->{
			System.out.println(x);
		});
		System.out.println("Names starting with s");
		list.stream().filter(p -> p.name.startsWith("S")).forEach(x ->{
			System.out.println(x.name);
		});
		
		Product maxp = list.stream().max((p1,p2) -> p1.price >= p2.price ?
				1 : -1).get();
		System.out.println("Max Price Record");
		System.out.println(maxp);
		
		Product minp = list.stream().min((p1,p2) -> p1.price >= p2.price ?
				1 : -1).get();
		System.out.println("Min Price Record");
		System.out.println(minp);
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
