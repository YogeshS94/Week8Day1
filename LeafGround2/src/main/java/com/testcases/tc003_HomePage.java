package com.testcases;

import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.projectBase.ProjectBaseMethod;

public class tc003_HomePage extends ProjectBaseMethod {
	@Test
	public void homePageVerification() {
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickSubmit()
		.verifyPage()
		.verifyLogout()
		.verifyLink()
		.crm_sfa_Link()
		.verifyMyHomePage();
	}

}
