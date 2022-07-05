package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.projectBase.ProjectBaseMethod;

public class ViewContactPage extends ProjectBaseMethod{
	public ViewContactPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public ViewContactPage verifyViewContactPage() {
		String viewContactText = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_contacts']")).getText();
		Assert.assertEquals(properties.getProperty("viewContactTxt"), viewContactText);
		return this;
	}
	
	
}
