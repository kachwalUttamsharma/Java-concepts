<<<<<<< HEAD
package com.hcl.day5.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
															//dataoutputstream for int or string in the main bcoz
															//they are static and doesnt blong to any object
															//but for objects we should use objectoutputstream
public class ObjInEx {

	public static void main(String[] args) {
		FileInputStream fin;
		try {
			fin = new FileInputStream("c:/files/objout.txt");
			ObjectInputStream objin = new ObjectInputStream(fin);
			String s = (String)objin.readObject();
			Date d = (Date)objin.readObject();
			System.out.println(s + d);
			objin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
=======
package com.hcl.day5.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
															//dataoutputstream for int or string in the main bcoz
															//they are static and doesnt blong to any object
															//but for objects we should use objectoutputstream
public class ObjInEx {

	public static void main(String[] args) {
		FileInputStream fin;
		try {
			fin = new FileInputStream("c:/files/objout.txt");
			ObjectInputStream objin = new ObjectInputStream(fin);
			String s = (String)objin.readObject();
			Date d = (Date)objin.readObject();
			System.out.println(s + d);
			objin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
