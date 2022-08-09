package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.TestBase.BaseClass;

public class Signup extends BaseClass 
{


	public  void test1() throws InterruptedException  {
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		Thread.sleep(10000);
		
		
		
	
		
		
		
		
	}
	
	
public  Boolean getSuccessMessage() {
		
		
	boolean xyz=driver.findElement(By.xpath("")).isDisplayed();
	System.out.println("" +xyz);
	return xyz;

	
	
}

}
