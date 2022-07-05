package com.testcases;

import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.projectBase.ProjectBaseMethod;

public class tc004_CreateContact extends ProjectBaseMethod{
	@Test
	public void createContactVerification() {
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickSubmit()
		.verifyPage()
		.crm_sfa_Link()
		.verifyMyHomePage()
		.clickContact()
		.verifyContactPage()
		.clickCreateContact()
		.verifyCreatContact()
		.enterFName()
		.enterLName()
		.enterLocalFName()
		.enterLocalLName()
		.enterDepartment()
		.enterDescription()
		.enterPrimaryEmail()
		.selectDropdown()
		.clickCreateContact()
		.verifyViewContactPage();
	}
}
