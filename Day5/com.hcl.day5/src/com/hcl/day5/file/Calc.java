<<<<<<< HEAD
package com.hcl.day5.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {

	public static void main(String[] args) {
		int a,b,c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			a=Integer.parseInt(br.readLine());
			b=Integer.parseInt(br.readLine());
			c=a+b;
			System.out.println("Sum is " +c);
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
=======
package com.hcl.day5.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {

	public static void main(String[] args) {
		int a,b,c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			a=Integer.parseInt(br.readLine());
			b=Integer.parseInt(br.readLine());
			c=a+b;
			System.out.println("Sum is " +c);
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
