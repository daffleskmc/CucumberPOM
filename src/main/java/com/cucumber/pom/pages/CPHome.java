package com.cucumber.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.pom.base.CPBase;

public class CPHome extends CPBase {

	@FindBy(xpath = "")
	WebElement homeUsername;

	public CPHome() {
		PageFactory.initElements(driver, this);
	}

	public String validateHomeTitle() {
		return driver.getTitle();
	}

	public boolean validateHomeUserName() {
		return homeUsername.isDisplayed();
	}
}
