<<<<<<< HEAD
package com.hcl.day5.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteStudent {

	public static void main(String[] args) {
		try {
			FileOutputStream fot = new FileOutputStream("c:/files/student.txt");
			ObjectOutputStream objot = new ObjectOutputStream(fot);
			Student e = new Student(1,"Laksh","Delhi",84.32);
			objot.writeObject(e);
			objot.close();
			fot.close();
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
package com.hcl.day5.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteStudent {

	public static void main(String[] args) {
		try {
			FileOutputStream fot = new FileOutputStream("c:/files/student.txt");
			ObjectOutputStream objot = new ObjectOutputStream(fot);
			Student e = new Student(1,"Laksh","Delhi",84.32);
			objot.writeObject(e);
			objot.close();
			fot.close();
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
