package com.cucumber.helper;

import java.io.IOException;

public class FileReaderManager {

	
	private FileReaderManager() {
		
	}
	
	
	
	public static FileReaderManager getInstance() {
        FileReaderManager frm = new FileReaderManager();
        return frm;
	}
	
	public static ConfigurationReader GetConInstence() throws IOException {
     ConfigurationReader con = new ConfigurationReader();
     return con;
     
	}
	
}
