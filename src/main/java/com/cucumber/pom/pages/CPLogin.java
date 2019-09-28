package com.cucumber.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.pom.base.CPBase;

public class CPLogin extends CPBase {

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement username;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement password;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginBtn;

	public CPLogin() {
		PageFactory.initElements(driver, this);
	}

	public CPHome login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();

		return new CPHome();

	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

}
