package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.TestBase.BaseClass;

public class AddCart extends BaseClass {
	



	public  void test() throws InterruptedException  {
		
		
		driver.findElement(By.xpath("//a[text()='Books' and contains(@class,'nav-a')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"acs-product-block-1\"]/a/span/span[1]")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(10000);
		
		
		
	
		
		
		
		
	}
	
	
public  Boolean getSuccessMessage() {
		
		
	boolean xyz=driver.findElement(By.xpath("//span[contains(text(),'Added to Cart')]")).isDisplayed();
	System.out.println("Boolean value " +xyz);
	return xyz;

	
	
}
}