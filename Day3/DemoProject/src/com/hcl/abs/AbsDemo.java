<<<<<<< HEAD
package com.hcl.abs;

abstract class Training{
	abstract void name();
	abstract void email();
}

class Anubhav extends Training{

	@Override
	void name() {
		System.out.println("Name is Anubhav.");
		}

	@Override
	void email() {
		System.out.println("Anubhavanand@gmail.com");
		}
	
}

class Saikrishna extends Training {

	@Override
	void name() {
		System.out.println("Name is SaiKrishna.");
		
	}

	@Override
	void email() {
		System.out.println("SaiKri@gmail.com");	
	}
}

public class AbsDemo {

	public static void main(String[] args) {
	//	Training t1 = new Anubhav();
	//	Training T2 = new Saikrishna();
		
		Training[] arr = new Training[]{
				new Anubhav(),
				new Saikrishna()	
		};
		for(Training t : arr){
			t.name();
			t.email();
		}	
	}
}
=======
package com.hcl.abs;

abstract class Training{
	abstract void name();
	abstract void email();
}

class Anubhav extends Training{

	@Override
	void name() {
		System.out.println("Name is Anubhav.");
		}

	@Override
	void email() {
		System.out.println("Anubhavanand@gmail.com");
		}
	
}

class Saikrishna extends Training {

	@Override
	void name() {
		System.out.println("Name is SaiKrishna.");
		
	}

	@Override
	void email() {
		System.out.println("SaiKri@gmail.com");	
	}
}

public class AbsDemo {

	public static void main(String[] args) {
	//	Training t1 = new Anubhav();
	//	Training T2 = new Saikrishna();
		
		Training[] arr = new Training[]{
				new Anubhav(),
				new Saikrishna()	
		};
		for(Training t : arr){
			t.name();
			t.email();
		}	
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
