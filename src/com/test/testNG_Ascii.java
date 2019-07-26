package com.test;

import org.testng.annotations.Test;

public class testNG_Ascii {
  @Test (priority=3)
  public void Apple() {
	  System.out.println("1");
  }
  @Test (priority=1)
  public void APple() {
	  System.out.println("2");
  }
  @Test (priority=2)
  public void apple() {
	  System.out.println("3");
  }
  @Test
  public void ApPle() {
	  System.out.println("4");
  }
}
