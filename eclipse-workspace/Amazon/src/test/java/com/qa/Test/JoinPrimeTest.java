package com.qa.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.MouseHover;
import com.qa.TestBase.BaseClass;

public class JoinPrimeTest extends BaseClass {
	@Test(priority=2)
	public void joined() throws InterruptedException {
		test = extent.createTest("Join prime");
		MouseHover qwe = new MouseHover();
		System.out.println();
	    qwe.test4();
	    Thread.sleep(2000);
	    if(qwe.getSuccessMessage()==true)
	    {
	    	System.out.println("added");
	    }
	   
	    
}
	}
