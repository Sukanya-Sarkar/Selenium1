package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class webDriver_demo1 {
	WebDriver driver=null;
 /* @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.00.10\\Desktop\\browsers and drivers\\chromedriver.exe\\");
	  driver= new ChromeDriver();
	  String url="http://www.google.com";
	  driver.get(url);
	  driver.manage().window().maximize();
	  System.out.println("the title of the page "+driver.getTitle());
	  }*/
	/*@Test
	public void g() {
		  
		  System.setProperty("webdriver.ie.driver", "C:\\Users\\Training_b6b.00.10\\Desktop\\browsers and drivers\\IEDriverServer.exe\\");
		  driver= new InternetExplorerDriver();
		  String url="http://www.google.com";
		  driver.get(url);
		  driver.manage().window().maximize();
		  System.out.println("the title of the page "+driver.getTitle());
		  }*/
	 @Test
	  public void f() {
		  
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Training_b6b.00.10\\Desktop\\browsers and drivers\\geckodriver.exe");
		  driver= new FirefoxDriver();
		  String url="http://www.google.com";
		  driver.get(url);
		  driver.manage().window().maximize();
		  System.out.println("the title of the page "+driver.getTitle());
		  }
	
}
