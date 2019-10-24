package com.hcl.Jason;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JSONDecode {
 public static void main(String[] args) {
	 String s="{\"name\":\"uttam\",\"salary\":100000.0,\"age\":24}";  
//	    Object obj=JSONValue.parse(s);  
	    JSONObject jsonObject = (JSONObject) JSONValue.parse(s);  
	    String name = (String) jsonObject.get("name");  
	    double salary = (Double) jsonObject.get("salary");  
	    long age = (Long) jsonObject.get("age");  
	    System.out.println(name+" "+salary+" "+age);  
}
}
