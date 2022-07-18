package com.Trello.PageEvents;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Trello.PageObjects.BoardPageElements;
import com.Trello.Utility.ElementFetch;

public class BoardPage {
	
	WebDriverWait wait;
	ElementFetch elementFetch = new ElementFetch();
	
	public void addFirstList(String listA_title) throws InterruptedException {
		
		elementFetch.getWebElement("XPATH", BoardPageElements.listA_textbox).sendKeys(listA_title);
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", BoardPageElements.listA_addListButton).click();
		Thread.sleep(1000);
	}
	
	public void addList(String listB_title) throws InterruptedException {
		
		elementFetch.getWebElement("XPATH", BoardPageElements.listB_textbox).sendKeys(listB_title);
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", BoardPageElements.listB_addListButton).click();
		Thread.sleep(1000);
	}
	
	public void addFirstcard(String listA_cardDetails) throws InterruptedException {
		
		elementFetch.getWebElement("XPATH", BoardPageElements.listA_addCard).click();
		Thread.sleep(2000);
		elementFetch.getWebElement("XPATH", BoardPageElements.listA_addcard_textbox).sendKeys(listA_cardDetails);
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", BoardPageElements.listA_addcard_confirmbutton).click();
		Thread.sleep(1000);
		
	}
	

	public void moveCardsBetweenLists(String cardPosition) throws InterruptedException {
		
		elementFetch.getWebElement("XPATH", BoardPageElements.listMenu).click();;
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", BoardPageElements.moveList).click();
		Thread.sleep(1000);
		WebElement position = elementFetch.getWebElement("XPATH", BoardPageElements.moveCardByPosition);
		Select select =new Select(position);
	//	select.selectByIndex(1);
		select.selectByVisibleText(cardPosition);
		Thread.sleep(2000);
		elementFetch.getWebElement("XPATH", BoardPageElements.moveCardButton).click();
		Thread.sleep(2000);
		
		
	}
	
	public void findXYCoordinates() throws InterruptedException {
		
		Thread.sleep(5000);
		WebElement ele =elementFetch.getWebElement("XPATH", BoardPageElements.movedcard_newposition);
		
		//Get WebElement Location on screen
		Point point = ele.getLocation();
		
		//Get X axis co-ordinate
		point.getX(); 
		System.out.println("X Co-ordinate of the card is "+point.getX());
		
		//Get Y axis co-ordinate
		point.getY();
		System.out.println("Y Co-ordinate of the card is "+point.getY());
		
	}
	
	public void logOut() throws InterruptedException {
		Thread.sleep(2000);
		elementFetch.getWebElement("XPATH", BoardPageElements.personalprofilemenu).click();
		Thread.sleep(2000);
		
		elementFetch.getWebElement("XPATH", BoardPageElements.logoutbutton).click();
		Thread.sleep(5000);
		
		if(elementFetch.getWebElement("XPATH", BoardPageElements.logoutmessage).isDisplayed()) {
			System.out.println("Log out successful");
		}
		else {
			System.out.println("Issue in logging out");
		}
		
	}

}
