package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class WebDriver_demo2 {
	@Test
	public void f() {
		WebDriver driver=DriverUtility.getDriver("ie");
		String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("title of the page "+driver.getTitle());
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.id("userName")).sendKeys("lalitha");
		driver.findElement(By.id("password")).sendKeys("password123");
		driver.findElement(By.name("Login")).click();
		driver.close();

	}

}
