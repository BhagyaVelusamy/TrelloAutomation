package com.Trello.Utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Trello.Configurations.BasicConfiguration;

public class ElementFetch {

	public WebElement getWebElement(String identifierType, String identifierValue) {
		switch (identifierType) {
		case "ID":
			return BasicConfiguration.driver.findElement(By.id(identifierValue));
		case "CSS":
			return BasicConfiguration.driver.findElement(By.cssSelector(identifierValue));
		case "CLASS NAME":
			return BasicConfiguration.driver.findElement(By.className(identifierValue));
		case "LINK TEXT":
			return BasicConfiguration.driver.findElement(By.linkText(identifierValue));
		case "NAME":
			return BasicConfiguration.driver.findElement(By.name(identifierValue));
		case "PARTIAL LINK TEXT":
			return BasicConfiguration.driver.findElement(By.partialLinkText(identifierValue));
		case "TAG NAME":
			return BasicConfiguration.driver.findElement(By.tagName(identifierValue));
		case "XPATH":
			return BasicConfiguration.driver.findElement(By.xpath(identifierValue));
		default:
			return null;
		}

	}

	public List<WebElement> getWebElements(String identifierType, String identifierValue) {
		switch (identifierType) {
		case "ID":
			return BasicConfiguration.driver.findElements(By.id(identifierValue));
		case "CSS":
			return BasicConfiguration.driver.findElements(By.cssSelector(identifierValue));
		case "CLASS NAME":
			return BasicConfiguration.driver.findElements(By.className(identifierValue));
		case "LINK TEXT":
			return BasicConfiguration.driver.findElements(By.linkText(identifierValue));
		case "NAME":
			return BasicConfiguration.driver.findElements(By.name(identifierValue));
		case "PARTIAL LINK TEXT":
			return BasicConfiguration.driver.findElements(By.partialLinkText(identifierValue));
		case "TAG NAME":
			return BasicConfiguration.driver.findElements(By.tagName(identifierValue));
		case "XPATH":
			return BasicConfiguration.driver.findElements(By.xpath(identifierValue));
		default:
			return null;
		}

	}

}
