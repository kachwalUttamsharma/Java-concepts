package com.hcl.fi;

@FunctionalInterface
public interface MethodReferenceStatic {
 public String sayHello(Integer str);
 public static String someMethod(Integer num)
 {
	 return "Welcome Static :" +num;
 }
}
