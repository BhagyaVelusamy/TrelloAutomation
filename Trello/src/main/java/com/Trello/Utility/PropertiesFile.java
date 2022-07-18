package com.Trello.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.Trello.Configurations.SampleTest;

public class PropertiesFile {
	static Properties prop = new Properties();
	public void readProperties() {

		try {
			String projectPath = System.getProperty("user.dir");
			FileInputStream input = new FileInputStream(projectPath+"\\src\\main\\resources\\application.properties");
			prop.load(input);

			String username = prop.getProperty("username");
			String password = prop.getProperty("password");
			String boardTitle=	prop.getProperty("boardTitle");
			String cardPosition=prop.getProperty("cardPosition");
			SampleTest.username = username;
			SampleTest.password =password;
			SampleTest.boardTitle = boardTitle;
			SampleTest.cardPosition = cardPosition;

			prop.getProperty("url");
			prop.getProperty("cardDetails");
			prop.getProperty("boardLists");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	public void writePoperties() {
		try {
			FileOutputStream output = new FileOutputStream("\\src\\main\\resources\\application.properties");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
