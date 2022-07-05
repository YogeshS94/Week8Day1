package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.projectBase.ProjectBaseMethod;


public class LoginPage extends ProjectBaseMethod{
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage enterUserName() {
		driver.findElement(By.id("username")).sendKeys(properties.getProperty("username"));
		return this;
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys(properties.getProperty("password"));
		return this;
	}
	
	public HomePage clickSubmit() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
	}
	public LoginPage userNameField() {
		Boolean uNameField = driver.findElement(By.id("username")).isEnabled();
		Boolean expected = true;
		Assert.assertEquals(expected, uNameField);
		Boolean pwdField = driver.findElement(By.id("password")).isEnabled();
		Assert.assertEquals(expected, pwdField);
		Boolean submitField = driver.findElement(By.className("decorativeSubmit")).isEnabled();
		Assert.assertEquals(expected, submitField);
		return this;
	}
	
	public LoginPage verifyTitle() {
		String actualTitle = driver.findElement(By.xpath("//div[@id='form']/h2")).getText();
		System.out.println(actualTitle);
		String expTitle = properties.getProperty("expTitle");
		Assert.assertEquals(actualTitle, expTitle);
		
		return this;
	}
	
	
}
