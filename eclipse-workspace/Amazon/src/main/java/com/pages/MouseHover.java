package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.BaseClass;

public class MouseHover extends BaseClass {
	
	
	

	public void test4() throws InterruptedException  {
		
		WebElement ele =driver.findElement(By.xpath("//a[@id='nav-link-amazonprime']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='nav-link-amazonprime']")).click();
		Thread.sleep(10000);
		
		
		
		
}
	public  Boolean getSuccessMessage() {
		
		
		boolean text =driver.findElement(By.xpath("//a[@id='a-autoid-0-announce']")).isDisplayed();
		System.out.println("Boolean value " +text);
		return text;

		
		
	}}
