<<<<<<< HEAD
package com.hcl.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Finput {
	public static void main(String[] args) {
		try {
			FileInputStream fin= new FileInputStream("C:/hcljava/Day4/com.hcl.day4/src/com/hcl/ex/Custom.java");
			int ch;
			while((ch=fin.read()) != -1){
				System.out.print((char)ch);
			}
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
=======
package com.hcl.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Finput {
	public static void main(String[] args) {
		try {
			FileInputStream fin= new FileInputStream("C:/hcljava/Day4/com.hcl.day4/src/com/hcl/ex/Custom.java");
			int ch;
			while((ch=fin.read()) != -1){
				System.out.print((char)ch);
			}
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
