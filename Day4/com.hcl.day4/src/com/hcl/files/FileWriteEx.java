<<<<<<< HEAD
package com.hcl.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

  public class FileWriteEx {
    public static void main(String[] args) {
		File src,tar;
		FileReader fr;
		FileWriter fw;
		src = new File( "C:/hcljava/Day4/com.hcl.day4/src/com/hcl/ex/Custom.java" );
		tar = new File("C:/files/Custom.java");
		try {
			fr = new FileReader(src);
			fw = new FileWriter(tar);
			int ch;
			while((ch=fr.read()) != -1){
				fw.write((char)ch);
			}
			fr.close();
			fw.close();
			System.out.println("***File copied***");
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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

  public class FileWriteEx {
    public static void main(String[] args) {
		File src,tar;
		FileReader fr;
		FileWriter fw;
		src = new File( "C:/hcljava/Day4/com.hcl.day4/src/com/hcl/ex/Custom.java" );
		tar = new File("C:/files/Custom.java");
		try {
			fr = new FileReader(src);
			fw = new FileWriter(tar);
			int ch;
			while((ch=fr.read()) != -1){
				fw.write((char)ch);
			}
			fr.close();
			fw.close();
			System.out.println("***File copied***");
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
