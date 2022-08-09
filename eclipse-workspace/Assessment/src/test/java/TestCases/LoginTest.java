package TestCases;

import org.testng.annotations.Test;

import com.POM.LogIn;

import TestBase.BaseClass;

public class LoginTest extends BaseClass {
	@Test
	public void added() throws InterruptedException {
			test = extent.createTest("Log in test");
			LogIn abc= new LogIn();
			System.out.println();
		    abc.test2();
		    Thread.sleep(2000);
		    if(abc.TextDisplay()==true)
		    {
		    	System.out.println("Logged in ");
		    } 
		   
		    
	}

}
