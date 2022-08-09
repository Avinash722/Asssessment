package com.qa.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.TestBase.BaseClass;

public class TitleTest extends BaseClass {
	
      @Test(priority=1)
	public void TitleTest1() throws InterruptedException {
		
    	  test = extent.createTest("Verifiy title");
    	  
		String actualTitle = driver.getTitle();
		
		String ExpectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if (actualTitle.equals(ExpectedTitle)) {
			Assert.assertTrue(true); 

		} else {
			Assert.assertTrue(false);
	}

}}
