package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.projectBase.ProjectBaseMethod;

public class ContactPage extends ProjectBaseMethod{
	
	public ContactPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public ContactPage verifyContactPage() {
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		String contactText = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_contacts']")).getText();
		System.out.println(contactText);
		System.out.println(properties.getProperty("contactTxt"));
		Assert.assertEquals(properties.getProperty("contactTxt"), contactText);
		return this;
	}
	
	public CreateContactPage clickCreateContact() {
		driver.findElement(By.linkText("Create Contact")).click();
		return new CreateContactPage(driver);
	}

}
