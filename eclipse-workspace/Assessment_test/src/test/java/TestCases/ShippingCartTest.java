package TestCases;

import org.testng.annotations.Test;

import com.POM.ShippingCart;

import TestBase.BaseClass;

public class ShippingCartTest extends BaseClass {
		@Test
		public void added() throws InterruptedException {
			test = extent.createTest("Check shipping ");
			ShippingCart abc2= new ShippingCart();
			System.out.println();
		    abc2.test3();
		    Thread.sleep(2000);
		    if(abc2.TextDisplay2()==true)
		    {
		    	System.out.println("Added shipping chargaes ");
		    } 

}}