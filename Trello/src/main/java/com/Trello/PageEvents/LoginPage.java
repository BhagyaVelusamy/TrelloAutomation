package com.Trello.PageEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Trello.PageObjects.LoginPageElements;
import com.Trello.Utility.ElementFetch;

public class LoginPage {

	WebDriverWait wait;
	ElementFetch elementFetch = new ElementFetch();


	public void enterLoginCredentials(String username, String password) throws InterruptedException {

		// Enter username & password value
		elementFetch.getWebElement("XPATH", LoginPageElements.username).sendKeys(username);
		Thread.sleep(3000);
		if (elementFetch.getWebElement("XPATH", LoginPageElements.loginByAtlassion).isDisplayed()) {
			System.out.println("User is already logged in using atlassian login");
			System.out.println("Continue loggin in using atlassion");
			elementFetch.getWebElement("XPATH", LoginPageElements.loginByAtlassion).click();
			if(elementFetch.getWebElement("XPATH", LoginPageElements.password).isDisplayed()) {
				elementFetch.getWebElement("XPATH", LoginPageElements.password).sendKeys(password);
				Thread.sleep(2000);
				elementFetch.getWebElement("XPATH", LoginPageElements.loginButtonForAtlassion).click();
				Thread.sleep(2000);
			}
			
		} else  {

			elementFetch.getWebElement("XPATH", LoginPageElements.password).sendKeys(password);
			Thread.sleep(2000);
			clickOnLoginButton();
			Thread.sleep(2000);


		}

	}

	public void clickOnLoginButton() {

		WebElement loginbutton = elementFetch.getWebElement("XPATH", LoginPageElements.loginButton);
		if (loginbutton.isDisplayed()) {
			loginbutton.click();
		} else {
			System.out.println("Login Button is not displayed");
		}

	}

	public void loginUsingOtherOptions(String loginMethod) {


		if(loginMethod.contains("google")) {
			elementFetch.getWebElement("XPATH", LoginPageElements.continueWithGoogleButton).click();
		}
		else if(loginMethod.contains("microsoft")) {
			elementFetch.getWebElement("XPATH", LoginPageElements.continueWithMicrosoftButton).click();
		}
		else if(loginMethod.contains("apple")) {
			elementFetch.getWebElement("XPATH", LoginPageElements.continueWithApple).click();
		}
		else if(loginMethod.contains("SSO")) {
			elementFetch.getWebElement("XPATH", LoginPageElements.loginwithSSO).click();
		}
		else {
			System.out.println("CLick on valid login method");
		}
	}


}
