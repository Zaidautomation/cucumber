package com.cucumber.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	 
	public static Properties pra;
	
 public ConfigurationReader() throws IOException {
	
	 File f = new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\cucumber\\properties\\Configuration.properties");
     FileInputStream fis = new FileInputStream(f);
     pra = new Properties();
     pra.load(fis);
   
}
	public static String getbrowsername() {
	String browser =	pra.getProperty("browsername");
	return browser;
	}
	
	public static String geturl() {
		String urls = pra.getProperty("url");
		return urls;
	}
	
	

}
