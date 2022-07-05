package com.testcases;

import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.projectBase.ProjectBaseMethod;

public class tc002_PageLoginTextBox extends ProjectBaseMethod{
	@Test
	public void fieldCheck() {
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.userNameField()
		.verifyTitle();
	}
}
