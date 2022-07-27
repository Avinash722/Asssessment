package com.qa.Test;

import org.testng.annotations.Test;

import com.pages.ChnageLanguage;
import com.pages.MouseHover;
import com.qa.TestBase.BaseClass;

public class LanguageTest extends BaseClass  {
	@Test
	public void lang() throws InterruptedException {
		test = extent.createTest("Language chaange ");
		ChnageLanguage pqr = new ChnageLanguage();
		
		pqr.hindi();
	    Thread.sleep(2000);
	    if(pqr.getSuccessMessage()==true)
	    {
	    	System.out.println("added");
	    }
	   
	    
}

}
