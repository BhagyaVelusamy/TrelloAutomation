package com.Trello.Configurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicConfiguration {
	public static WebDriver driver;

	@BeforeTest
	public void beforeTestMethod() {

	}

	@Parameters({ "browser", "browserVersionNumber", "URL" })
	@BeforeMethod
	public void beforeMethodMethod(String browser, String browserVersionNumber, String URL) throws InterruptedException {
		setUpDriver(browser, browserVersionNumber);
		launchURL(URL);
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void afterMethodMethod(ITestResult result) {

		if (result.getStatus() == ITestResult.SUCCESS) {

			String methodname = result.getMethod().getMethodName();
			String logtext = "Test Case : " + methodname + " Passed";

		} else if (result.getStatus() == ITestResult.FAILURE) {

			String methodname = result.getMethod().getMethodName();
			String logtext = "Test Case : " + methodname + " Failed";
		}

		driver.quit();
	}

	@AfterTest
	public void afterTestMethod() {

	}

	public void launchURL(String URL) throws InterruptedException {

		driver.get(URL);
		Thread.sleep(5000);

	}

	public void setUpDriver(String browser, String browserVersionNumber) {

		try {
			if (browser.equalsIgnoreCase("chrome")) {
				ChromeOptions options = new ChromeOptions();
				WebDriverManager.chromedriver().driverVersion(browserVersionNumber).setup();
				driver = new ChromeDriver(options);
				

			}

			else if (browser.equalsIgnoreCase("microsoftedge") || browser.equalsIgnoreCase("edge")) {
				// System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
				WebDriverManager.edgedriver().driverVersion(browserVersionNumber).setup();
				driver = new EdgeDriver();

			} else if (browser.equalsIgnoreCase("IE") || browser.equalsIgnoreCase("internetexplorer")) {
				WebDriverManager.iedriver().browserVersion(browserVersionNumber).setup();
				driver = new InternetExplorerDriver();

			} else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().browserVersion(browserVersionNumber).setup();
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("safari")) {
				WebDriverManager.safaridriver().browserVersion(browserVersionNumber).setup();
				driver = new SafariDriver();
			} else {
				System.out.println("Enter valid browser name");
			}

			// Depreciated browser

			// if(browser.equalsIgnoreCase("Opera")) {
			// WebDriverManager.operadriver().browserVersion(browserVersionNumber).setup();
			// driver = new OperaDriver();
			// }
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Error in driver setup " + e.getMessage());

		}

	} // end of LaunchBrowser

}
