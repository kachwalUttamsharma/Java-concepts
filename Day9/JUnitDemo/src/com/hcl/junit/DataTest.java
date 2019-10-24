<<<<<<< HEAD
package com.hcl.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {
	
	@Test(expected = NullPointerException.class)
	public void testNullEx(){
		Data obj = null;
		assertEquals(5, obj.sum(2, 3));
	}
	
	
	@Test
	public void testDiv(){
		Data obj = new Data();
		assertEquals(2, obj.div(5, 2));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivEx(){
		Data obj = new Data();
		obj.div(5, 0);
	}
	
	@Test
	public void testGetProperty(){
		Data obj = new Data();
		assertNull(obj.getPropetryTest("him"));
		assertNotNull(obj.getPropetryTest("Meena"));
	}
	
	@Test
	public void testEven(){
		Data obj = new Data();
		assertTrue(obj.even(10));
		assertFalse
		(obj.even(7));
	}
	
	
//	@Test
//	public void testeven(){
//		Data obj = new Data();
//		assertEquals(true, obj.even(4));
//	}
	
	

	@Test
	public void testMinArray(){
		Data obj = new Data();
		int[] x = new int[]{9,2,1,4};
		assertEquals(1, obj.minArray(x));
	}
	
	@Test
	public void testMax3(){
		Data obj = new Data();
		assertEquals(5, obj.max3(5, 1, 3));
		assertEquals(5, obj.max3(1, 5, 3));
		assertEquals(5, obj.max3(3, 1, 5));
	}
	
	@Test
	public void testsum(){
		Data obj = new Data();
		assertEquals(4,obj.sum(2,2));
		assertEquals(4,obj.sum(1, 3));
	}
	@Test
	public void testSayHello() {
		Data obj = new Data();
		assertEquals("Welcome to Junit", obj.sayHello());
	}

}
=======
package com.hcl.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {
	
	@Test(expected = NullPointerException.class)
	public void testNullEx(){
		Data obj = null;
		assertEquals(5, obj.sum(2, 3));
	}
	
	
	@Test
	public void testDiv(){
		Data obj = new Data();
		assertEquals(2, obj.div(5, 2));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivEx(){
		Data obj = new Data();
		obj.div(5, 0);
	}
	
	@Test
	public void testGetProperty(){
		Data obj = new Data();
		assertNull(obj.getPropetryTest("him"));
		assertNotNull(obj.getPropetryTest("Meena"));
	}
	
	@Test
	public void testEven(){
		Data obj = new Data();
		assertTrue(obj.even(10));
		assertFalse
		(obj.even(7));
	}
	
	
//	@Test
//	public void testeven(){
//		Data obj = new Data();
//		assertEquals(true, obj.even(4));
//	}
	
	

	@Test
	public void testMinArray(){
		Data obj = new Data();
		int[] x = new int[]{9,2,1,4};
		assertEquals(1, obj.minArray(x));
	}
	
	@Test
	public void testMax3(){
		Data obj = new Data();
		assertEquals(5, obj.max3(5, 1, 3));
		assertEquals(5, obj.max3(1, 5, 3));
		assertEquals(5, obj.max3(3, 1, 5));
	}
	
	@Test
	public void testsum(){
		Data obj = new Data();
		assertEquals(4,obj.sum(2,2));
		assertEquals(4,obj.sum(1, 3));
	}
	@Test
	public void testSayHello() {
		Data obj = new Data();
		assertEquals("Welcome to Junit", obj.sayHello());
	}

}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
