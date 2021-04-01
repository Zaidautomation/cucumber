package com.cucumber.stepdefinition;



import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.baseclass;
import com.cucumber.helper.PageObjectManager;
import com.cucumber.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BookHotelPage extends baseclass {

	public static WebDriver driver = Runner.driver;
	PageObjectManager pom = new PageObjectManager(driver);
	//com.cucumber.pom.BookHotelPage bp = new com.cucumber.pom.BookHotelPage(driver);
	
	
	@Given("^Select hotel location$")
	public void select_hotel_location() throws Throwable {
	    
		dropDownSelection(pom.getBp().getLocation(), "ByIndex", "5");
	    
	}

	@Given("^User choose the hotel$")
	public void user_choose_the_hotel() throws Throwable {
		dropDownSelection(pom.getBp().getHotelname(), "ByIndex", "1");
	    
	}

	@Given("^User choose room type$")
	public void user_choose_room_type() throws Throwable {
	    dropDownSelection(pom.getBp().getRoomtype(), "ByIndex", "2");
	    
	}

	@Given("^User choose number of rooms$")
	public void user_choose_number_of_rooms() throws Throwable {
	    
	   dropDownSelection(pom.getBp().getNumberofnos(), "ByIndex", "2"); 
	}

	@Given("^User choose booking date$")
	public void user_choose_booking_date() throws Throwable {
		inputValueElement(pom.getBp().getBookdate(), "23/02/2021");
	}

	@Given("^User choose end date$")
	public void user_choose_end_date() throws Throwable {
	    
		inputValueElement(pom.getBp().getEnddate(), "25/02/2021");
	}

	@Given("^User choose adult per rooms$")
	public void user_choose_adult_per_rooms() throws Throwable {
		dropDownSelection(pom.getBp().getPerroom(), "ByIndex", "2");
	    
	}

	@Given("^User choose child per rooms$")
	public void user_choose_child_per_rooms() throws Throwable {
		dropDownSelection(pom.getBp().getChildroom(), "ByIndex", "2");
	    
	}

	@Then("^user verify the search results$")
	public void user_verify_the_search_results() throws Throwable {
		clickOnElement(pom.getBp().getDone());
	    
	}
}
