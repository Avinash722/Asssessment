package com.POM;

import org.openqa.selenium.By;

import TestBase.BaseClass;

public class LogIn extends BaseClass {
	
	public void test2() {
	      driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
	      driver.findElement(By.xpath("//input[@id='email']")).sendKeys("patil.avi722@gmail.com");
	      driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Test@123");

	     driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
}
	public  Boolean TextDisplay() {
		
		
		boolean xyz=driver.findElement(By.linkText("Sign out")).isDisplayed();
		System.out.println("Boolean value " +xyz);
		return xyz;
		
		
	}
	
}
