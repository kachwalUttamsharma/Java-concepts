<<<<<<< HEAD
package com.hcl.files;

import java.io.File;

public class FileInfo {
	public static void main(String[] args) {
		File f1 = new File("C:/hcljava/Day4/com.hcl.day4/src/com/hcl/ex/Custom.java");
		System.out.println("File Name " + f1.getName());
		System.out.println("Full Name " + f1.getAbsolutePath());
		File f2 = new File("C:/hcljava/Day4/com.hcl.day4/src/com/hcl/ex");
		String [] files = f2.list();
		for (String s : files) {
			System.out.println(s);
			
		}
	}

}
=======
package com.hcl.files;

import java.io.File;

public class FileInfo {
	public static void main(String[] args) {
		File f1 = new File("C:/hcljava/Day4/com.hcl.day4/src/com/hcl/ex/Custom.java");
		System.out.println("File Name " + f1.getName());
		System.out.println("Full Name " + f1.getAbsolutePath());
		File f2 = new File("C:/hcljava/Day4/com.hcl.day4/src/com/hcl/ex");
		String [] files = f2.list();
		for (String s : files) {
			System.out.println(s);
			
		}
	}

}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
