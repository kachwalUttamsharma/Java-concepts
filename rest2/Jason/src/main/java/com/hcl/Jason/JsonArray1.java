package com.hcl.Jason;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonArray1 {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	JSONArray array=new JSONArray();
	for (int i = 0; i < 3; i++) {
		JSONObject object=new JSONObject();
		object.put("Name",sc.nextLine() );
		object.put("salary", Integer.parseInt(sc.nextLine()));
		object.put("Age", Integer.parseInt(sc.nextLine()));
		array.add(object);
	}
             System.out.println(array);
}
}
