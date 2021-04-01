package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.baseclass;
import com.cucumber.helper.PageObjectManager;
import com.cucumber.pom.BookNow;
import com.cucumber.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BookNowStepDefinition extends baseclass {
     public static WebDriver driver = Runner.driver;
      PageObjectManager pom = new PageObjectManager(driver);
      
    // BookNow bn = new BookNow(driver);
	
	@Given("^User Enter First Name as \"([^\"]*)\"$")
	public void user_Enter_First_Name_as(String firstname) throws Throwable {
		implicitWait(30);
	    inputValueElement(pom.getBn().getFirst_name(), firstname);
	   
	}

	@Given("^User Enter Last Name as \"([^\"]*)\"$")
	public void user_Enter_Last_Name_as(String lastname) throws Throwable {
		inputValueElement(pom.getBn().getLast_name(), lastname);
	   
	}

	@Given("^User Enter address as \"([^\"]*)\"$")
	public void user_Enter_address_as(String address) throws Throwable {
		inputValueElement(pom.getBn().getAddress(), address);
	   
	}

	@Given("^User enter credit card number \"([^\"]*)\"$")
	public void user_enter_credit_card_number(String cardnum) throws Throwable {
	    
		inputValueElement(pom.getBn().getCreditcardnum(), cardnum);
	}

	@Given("^User select credit card type$")
	public void user_select_credit_card_type() throws Throwable {
		dropDownSelection(pom.getBn().getCreditcardtype(), "ByIndex", "2");
	   
	}

	@Given("^User select credit card expiry date and year$")
	public void user_select_credit_card_expiry_date_and_year() throws Throwable {
		
		dropDownSelection(pom.getBn().getExpirydate(), "ByIndex", "2");
		dropDownSelection(pom.getBn().getExpiryyear(), "ByIndex", "3");
	    
	   
	}

	@Given("^User enter credit card ccv \"([^\"]*)\"$")
	public void user_enter_credit_card_ccv(String ccv) throws Throwable {
	    inputValueElement(pom.getBn().getCreditcardccv(), ccv);
	   
	}

	@Then("^user verify the Book Hotel$")
	public void user_verify_the_Book_Hotel() throws Throwable {
	    clickOnElement(pom.getBn().getBooknow());
	   implicitWait(40);
	}


}
