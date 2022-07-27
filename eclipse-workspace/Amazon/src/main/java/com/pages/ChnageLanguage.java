package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.BaseClass;

public class ChnageLanguage extends BaseClass {
	

	
	
	
	
		
	public  void hindi() throws InterruptedException  {
		
		
		WebElement ele2 =driver.findElement(By.xpath("//a[@id='icp-touch-link-language']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ele2).perform();
		Thread.sleep(1000);
		System.out.println("aaaaa");
		WebElement asd = driver.findElement(By.xpath("(//span[contains(text(),'HI')])[2]//..//i"));
		actions.moveToElement(asd).perform();
		asd.click();
		System.out.println("fffff");
		Thread.sleep(10000);
		
		
		
	}
public  Boolean getSuccessMessage() {
		
		
		boolean langtext =driver.findElement(By.xpath("//span[contains(text(),'हिंदी-HI')]")).isDisplayed();
		System.out.println("Boolean value " +langtext);
		return langtext;

		
		
	}

}
