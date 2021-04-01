package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	public static WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement select;
	
	@FindBy(id = "continue")
	private WebElement continue1;

	public SelectHotel(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	
	
	public WebElement getSelect() {
		return select;
	}

	public WebElement getContinue1() {
		return continue1;
	}
	

	



	
	
	
	

}
