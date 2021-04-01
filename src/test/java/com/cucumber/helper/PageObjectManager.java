package com.cucumber.helper;

import org.apache.xmlbeans.impl.regex.REUtil;
import org.openqa.selenium.WebDriver;

import com.cucumber.pom.BookHotelPage;
import com.cucumber.pom.BookNow;
import com.cucumber.pom.LoginPage;
import com.cucumber.pom.SelectHotel;

public class PageObjectManager {
     
	public static WebDriver driver;
	
	private LoginPage lp;
	private com.cucumber.pom.BookHotelPage bp;
	private SelectHotel sh;
	private BookNow bn;
	
	
	
	public PageObjectManager(WebDriver mdriver) {
		this.driver = mdriver;
	}
	public LoginPage getLp() {
	    lp = new LoginPage(driver);
	    return lp;
	}
	
	public com.cucumber.pom.BookHotelPage getBp() {
		bp = new BookHotelPage(driver);
		return bp;
		
	}
	public SelectHotel getSh() {
		sh = new SelectHotel(driver);
		return sh;
	
		
	}
	public BookNow getBn() {
		bn = new BookNow(driver);
		return bn;
	}
	
	/*
	 * LoginPage lp = new LoginPage(driver); com.cucumber.pom.BookHotelPage bp = new
	 * com.cucumber.pom.BookHotelPage(driver); SelectHotel sh = new
	 * SelectHotel(driver); BookNow bn = new BookNow(driver);
	 */
}
