package com.cucumber.helper;

import com.cucumber.baseclass.baseclass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends baseclass {
	
	@Before
	public void first(Scenario scenario) {
 String name = scenario.getName();
 System.out.println(name);
	}

	@After
	public void second(Scenario scenario) throws Throwable {
		String status = scenario.getStatus();
		if(scenario.isFailed()) {
		screenshot("C:\\Users\\Mohamed Anas\\Desktop\\zai\\hdhd.png");
		}
	}
}
