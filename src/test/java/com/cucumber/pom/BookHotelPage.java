package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage {

	public static WebDriver driver;
	@FindBy(id = "location")
	private WebElement location;
	
	
	@FindBy(id = "hotels")
	private WebElement hotelname;
	
	@FindBy(id = "room_type")
	private WebElement roomtype;
	
	@FindBy(id = "room_nos")
	private WebElement Numberofnos;
	
	@FindBy(id = "datepick_in")
	private WebElement bookdate;
	
	@FindBy(id = "datepick_out")
	private WebElement enddate;
	
	
	@FindBy(id = "adult_room")
	private WebElement perroom;
	
	@FindBy(id = "child_room")
	private WebElement childroom;
	
	@FindBy(id = "Submit")
	private WebElement done;
	
	public BookHotelPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotelname() {
		return hotelname;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumberofnos() {
		return Numberofnos;
	}

	public WebElement getBookdate() {
		return bookdate;
	}

	public WebElement getEnddate() {
		return enddate;
	}

	public WebElement getPerroom() {
		return perroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getDone() {
		return done;
	}

	
}
