package com.cucumber.pom.stepDefinitions;

import org.junit.Assert;

import com.cucumber.pom.base.CPBase;
import com.cucumber.pom.pages.CPHome;
import com.cucumber.pom.pages.CPLogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CPLoginSteps extends CPBase {

	CPLogin login;
	CPHome home;

	@Given("^user opens tutorials ninja page$")
	public void user_opens_tutorials_ninja_page() throws Throwable {
		CPBase.initialization();
	}

	@Then("^user is in login page$")
	public void user_is_in_login_page() throws Throwable {
		login = new CPLogin();
		String title = login.validateLoginPageTitle();
		Assert.assertEquals("Account Login", title);
	}

	@Then("^user logs in$")
	public void user_enters_email_and_password() throws Throwable {
		home = login.login(props.getProperty("username"), props.getProperty("password"));
	}

	@Then("^user validates home page title$")
	public void user_validates_home_page_title() throws Throwable {
		String homeTitle = home.validateHomeTitle();
		Assert.assertEquals("My Account", homeTitle);
	}

	// @Then("^user validates username$")
	// public void user_validates_username() throws Throwable {
	//
	// }

}
