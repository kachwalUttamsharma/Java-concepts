package com.hcl.lamda;

public class WithoutLamdaExpression {
 public static void main(String[] args) {
	MyInterface myinterface=new MyInterface(){
		@Override
		public void sayMessage(){
			System.out.println("Welcome to My interface");
		}
	};
	myinterface.sayMessage();
}
}
