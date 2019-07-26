package com.test;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;


public class assertClass {
  @Test
  public void test1() {
	  Assert.assertTrue(20>18);
  }
  @Test
  public void test2() {
	  Assert.assertTrue("hello".equals("hi"));
	 
  }
  @Test
  public void test3() {
	  Assert.assertFalse(20>18);
  }
  @Test
  public void test4() {
	  Assert.assertFalse("Sukanya".equals("Sarkar"));
  }
  @Test
  public void test5() {
	  Assert.assertEquals("Sukanya","Sarkar");
  }
  @Test
  public void test6() {
	  Assert.assertEquals("Sukanya".contains("Suk"),true);
  }
  @Test
  public void test7() {
	  String a=null;
	  Assert.assertNull(a);
  }
  @Test
  public void test8() {
	  String a=null;
	  String b=a;
	  Assert.assertSame(a,b);
  }
  @Test
  public void test9() {
	 
	  Assert.fail("test failure");
  }
  @Test
  public void test10() {
	  Assert.assertTrue(true);
	  Assert.assertTrue(false);
	  Assert.assertTrue(true);
  }
  @Test
  public void test11() {
	  SoftAssert sa=new SoftAssert();
	  
	  sa.assertTrue(true);
	  sa.assertTrue(false);
	  sa.assertTrue(false);
	  sa.assertFalse(false);
	  sa.assertAll();
  }
}
