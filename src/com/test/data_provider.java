	package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class data_provider {
	
  @Test(dataProvider = "loginData")
  public void testLogin(String username, String password) {
	  System.out.println("username:"+username+"\t\t password :"+password);
  }

  @DataProvider
  public Object[][] loginData() {
	  Object[][]data= {
			  {"Sukanya","Sarkar"},
			  {"shrinikethan","sample"},
			  {"srinivas","sampletest"}
	  };
    return data;
  }
}
