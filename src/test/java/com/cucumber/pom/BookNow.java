package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookNow {
  public static WebDriver driver;
  
	@FindBy(id = "first_name")
	private WebElement first_name;
	
	@FindBy(id = "last_name")
	private WebElement last_name;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement creditcardnum;
	
	@FindBy(id = "cc_type")
	private WebElement creditcardtype;
	
	@FindBy(id = "cc_exp_month")
	private WebElement expirydate;
	
	@FindBy(id = "cc_exp_year")
	private WebElement expiryyear;
	
	@FindBy(id = "cc_cvv")
	private WebElement creditcardccv;
	
	
	@FindBy(id = "book_now")
	private WebElement booknow;

	public BookNow(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
			}
	
	public WebElement getFirst_name() {
		return first_name;
	}


	public WebElement getLast_name() {
		return last_name;
	}


	public WebElement getAddress() {
		return address;
	}


	public WebElement getCreditcardnum() {
		return creditcardnum;
	}


	public WebElement getCreditcardtype() {
		return creditcardtype;
	}


	public WebElement getExpirydate() {
		return expirydate;
	}


	public WebElement getExpiryyear() {
		return expiryyear;
	}


	public WebElement getCreditcardccv() {
		return creditcardccv;
	}


	public WebElement getBooknow() {
		return booknow;
	}
	
	
	
	

	

	
	
}
