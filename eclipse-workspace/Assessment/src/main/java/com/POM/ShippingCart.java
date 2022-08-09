package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import TestBase.BaseClass;

public class ShippingCart extends BaseClass {
public  void test3() throws InterruptedException  {
		
		
	WebElement ele =driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]"));
	Actions actions = new Actions(driver);
	actions.moveToElement(ele).perform();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[3]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='layered_id_attribute_group_2']")).click();
	Select se = new Select(driver.findElement(By.xpath("//select[@id='selectProductSort']")));
	se.selectByValue("price:asc");
	WebElement ele2 =driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
	Actions actions2 = new Actions(driver);
	actions.moveToElement(ele2).perform();
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")).click();
	WebElement ele3 =driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img"));
	Actions actions3 = new Actions(driver);
	actions.moveToElement(ele3).perform();
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span")).click();
	
	driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")).click();
	
		
	
		
	
		
		
		
		
	} 
	
public  Boolean TextDisplay2() {
	
	
	boolean pqr =driver.findElement(By.xpath("//td[@id='total_shipping']")).isDisplayed();
	System.out.println("Boolean value " +pqr);
	return pqr;
	
	
}

}
