package com.cucumber.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.baseclass;
import com.cucumber.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\cucumber\\feature" , 
                     glue = {"com\\cucumber\\stepdefinition","com\\cucumber\\helper"},
                     monochrome = true,
                     tags = "@123",
                     plugin = {"json:ReportJson/reports.json",
                    		 "com.cucumber.listener.ExtentCucumberFormatter:Reports/extendsReports.html"}

                     )


public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws IOException {
		
		String browser = FileReaderManager.getInstance().GetConInstence().getbrowsername();
      driver = baseclass.browserLaunch(browser);
      
	}
	
	
	
	@AfterClass
	public static void tearDown() {
     driver.quit();
	}

}
