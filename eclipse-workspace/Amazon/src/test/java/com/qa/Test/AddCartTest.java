package com.qa.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.AddCart;
import com.qa.TestBase.BaseClass;

import PageObject.HomePage;

public class AddCartTest extends BaseClass
{
@Test(priority=3)
public void added() throws InterruptedException {
		test = extent.createTest("Add to cart test");
		AddCart abc= new AddCart();
		System.out.println();
	    abc.test();
	    Thread.sleep(2000);
	    if(abc.getSuccessMessage()==true)
	    {
	    	System.out.println("added");
	    }
	   
	    
}
}
	

