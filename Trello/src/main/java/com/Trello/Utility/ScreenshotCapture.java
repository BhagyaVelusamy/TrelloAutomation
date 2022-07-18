package com.Trello.Utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Trello.Configurations.BasicConfiguration;

public class ScreenshotCapture {

	public void screenShotCapture() {
		File file = ((TakesScreenshot) BasicConfiguration.driver).getScreenshotAs(OutputType.FILE);

		try {
			String filepath = "/target";
			FileUtils.copyFile(file, new File(filepath + ".png"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
