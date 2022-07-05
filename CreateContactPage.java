package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.projectBase.ProjectBaseMethod;

public class CreateContactPage extends ProjectBaseMethod{
	public CreateContactPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public CreateContactPage verifyCreatContact() {
		String creatContact = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_contacts']")).getText();
		Assert.assertEquals(properties.getProperty("createContact"), creatContact);
		return this;
	}
	
	public CreateContactPage enterFName() {
		driver.findElement(By.id("firstNameField")).sendKeys("Aadhiya");
		return this;
	}
	public CreateContactPage enterLName() {
		driver.findElement(By.id("lastNameField")).sendKeys("Yogi");
		return this;
	}
	
	public CreateContactPage enterLocalFName() {
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Aadhi");
		return this;
	}
	
	public CreateContactPage enterLocalLName() {
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Yogu");
		return this;
	}
	
	public CreateContactPage enterDepartment() {
		driver.findElement(By.name("departmentName")).sendKeys("Searching");
		return this;
	}
	
	public CreateContactPage enterDescription() {
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Write the description");
		return this;
	}
	
	public CreateContactPage enterPrimaryEmail() {
		driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("yogeshvasan94@gmail.com");
		return this;
	}
	
	public CreateContactPage selectDropdown() {
		WebElement state = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select dropS = new Select(state);
		dropS.selectByVisibleText("New York");
		return this;
	}
	
	public ViewContactPage clickCreateContact() {
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		return new ViewContactPage(driver);
	}
}
