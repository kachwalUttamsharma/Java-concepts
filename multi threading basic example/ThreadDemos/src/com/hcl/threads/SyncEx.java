package com.hcl.threads;

class Data {
	void dispMsg(String name) {
		System.out.println("Hello " +name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("How r u ");
	}
}

public class SyncEx {

}
