package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.projectBase.ProjectBaseMethod;

public class MyHomePage extends ProjectBaseMethod{
	
	public MyHomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public MyHomePage verifyMyHomePage() {
		String homePageTitle = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_myHome']")).getText();
		Assert.assertEquals(properties.getProperty("myHomePageTitle"), homePageTitle);
		
		return this;
	}
	
	public ContactPage clickContact() {
		driver.findElement(By.linkText("Contacts")).click();
		return new ContactPage(driver);
	}
}
