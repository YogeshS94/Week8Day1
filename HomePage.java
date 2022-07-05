package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.projectBase.ProjectBaseMethod;

public class HomePage extends ProjectBaseMethod{
	
	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public HomePage verifyPage() {
		String homePageText = driver.findElement(By.xpath("//div[@id='form']/h2")).getText();
//		String[] s1 = homePageText.split(" ");
//		System.out.println(s1);
//		for(String s: s1) {
//			System.out.println(s);
//		}
//		String a = String.join(" ", s1);
//		System.out.println(properties.getProperty("a"));
//		System.out.println(homePageText);
		Assert.assertEquals(properties.getProperty("a"), homePageText);
		return this;
	}
	
	public MyHomePage crm_sfa_Link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}
	
	public HomePage verifyLogout() {
		Boolean btnLogout = driver.findElement(By.xpath("//input[@value='Logout']")).isEnabled();
		Boolean exp = Boolean.valueOf(properties.getProperty("expected"));
		Assert.assertEquals(exp, btnLogout);
		return this;
	}
	
	public HomePage verifyLink() {
		String crmsfaLink = driver.findElement(By.linkText("CRM/SFA")).getText();
		Assert.assertEquals(properties.getProperty("homePageLink"), crmsfaLink);
		
		return this;
	}
}
