package com.cucumber.stepdefinition;

import org.apache.poi.poifs.crypt.dsig.KeyInfoKeySelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.baseclass.baseclass;
import com.cucumber.helper.FileReaderManager;
import com.cucumber.helper.PageObjectManager;
import com.cucumber.pom.LoginPage;
import com.cucumber.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends baseclass {
    
	public static WebDriver driver = Runner.driver;
	//LoginPage lp = new LoginPage(driver);
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("^User Launch the Application$")
	public void user_Launch_the_Application() throws Throwable {
		
		String url = FileReaderManager.getInstance().GetConInstence().geturl();
	    getUrl(url);
	}

	@When("^User enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String username) throws Throwable {
	    inputValueElement(pom.getLp().getUsername(), username);
	}

	@When("^User enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String password) throws Throwable {
	   inputValueElement(pom.getLp().getPassword(), password);
	}

	@Then("^user verify valid username and password$")
	public void user_verify_valid_username_and_password() throws Throwable {
	    clickOnElement(pom.getLp().getLogin());
	}

}
