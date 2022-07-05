package com.testcases;

import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.projectBase.ProjectBaseMethod;

public class tc001_PageLoginTC extends ProjectBaseMethod{
	
	@Test
	public void pageLoginScenaio() {
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickSubmit()
		.verifyPage();
	}

}
