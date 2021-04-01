package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.baseclass;
import com.cucumber.helper.PageObjectManager;
import com.cucumber.pom.SelectHotel;
import com.cucumber.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SelectHotelDefinition extends baseclass {
	
	 public static WebDriver driver = Runner.driver;
	 PageObjectManager pom = new PageObjectManager(driver);
	 
	// SelectHotel sh = new SelectHotel(driver);
	 
	@Given("^user select hotel$")
	public void user_select_hotel() throws Throwable {
	   clickOnElement(pom.getSh().getSelect());
	}

	@Then("^user verify the selected the hotel$")
	public void user_verify_the_selected_the_hotel() throws Throwable {
	    clickOnElement(pom.getSh().getContinue1());
	}



}
