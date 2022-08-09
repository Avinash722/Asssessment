package TestCases;

import org.testng.annotations.Test;

import com.POM.ShippingCart;
import com.POM.SingUp;

import TestBase.BaseClass;

public class SignupTest extends BaseClass {
	@Test
	public void added() throws InterruptedException {
		test = extent.createTest("Creating User ");
		SingUp abc2= new SingUp();
		System.out.println();
	    abc2.test1();
	    Thread.sleep(2000);
	    if(abc2.textdisplayed()==true)
	    {
	    	System.out.println("User created ");
	    } 

}}


