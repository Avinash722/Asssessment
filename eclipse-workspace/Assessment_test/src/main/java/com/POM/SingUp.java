package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import Utility.ExcelReader;

public class SingUp extends BaseClass {
	
public  void test1() throws InterruptedException  {
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("avinash.dinkle@sourcefuse.com");
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys(ExcelReader.getuserdata(0));
		System.out.println("pass");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys(ExcelReader.getuserdata(1));
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(ExcelReader.getuserdata(2));
		
		Select se = new Select(driver.findElement(By.xpath("//select[@id='days']")));
		se.selectByValue("18");
		Select se1 = new Select(driver.findElement(By.xpath("//select[@id='months']")));
		se1.selectByValue("09");
		Select se2 = new Select(driver.findElement(By.xpath("//select[@id='years']")));
		se2.selectByValue("09");
		
		
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys(ExcelReader.getuserdata(3));
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(ExcelReader.getuserdata(4));
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys(ExcelReader.getuserdata(5));
		Select se3 = new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
		se3.selectByValue("30");
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys(ExcelReader.getuserdata(6));
		
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys(ExcelReader.getuserdata(7));
		
		driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
		
		
		
		
	
		
		 
		
		
	}
	
	
public  Boolean textdisplayed() {
		
		
	boolean mno=driver.findElement(By.xpath("//h1[contains(text(),'My account')]")).isDisplayed();
	System.out.println("Boolean value " +mno);
	return mno;

	
	
}


}
