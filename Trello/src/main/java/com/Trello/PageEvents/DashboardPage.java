package com.Trello.PageEvents;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Trello.Configurations.BasicConfiguration;
import com.Trello.PageObjects.DashBoardPageElements;
import com.Trello.Utility.ElementFetch;

public class DashboardPage extends BasicConfiguration{
	
	WebDriverWait wait;
	ElementFetch elementFetch = new ElementFetch();
	
	public void selectTemplate(String boardTitle) throws InterruptedException {
		
	Thread.sleep(10000);	
	//Scroll to the end of the screen
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
	
	elementFetch.getWebElement("XPATH", DashBoardPageElements.createboard).click();
	
	//elementFetch.getWebElement("XPATH", DashBoardPageElements.createNewBoard).click();
	Thread.sleep(5000);
	elementFetch.getWebElement("XPATH", DashBoardPageElements.addboardplusbutton).click();
	Thread.sleep(3000);
	WebElement boardname = elementFetch.getWebElement("XPATH", DashBoardPageElements.boardTitle);
	//elementFetch.getWebElement("XPATH", DashBoardPageElements.boardTitle).click();
	boardname.click();
	Thread.sleep(2000);
	boardname.sendKeys(boardTitle);
	Thread.sleep(2000);
	elementFetch.getWebElement("XPATH", DashBoardPageElements.createButton).click();
	Thread.sleep(5000);
	
	
		
	}
	
	public void selectBoard() throws InterruptedException {
		Thread.sleep(10000);	
		//Scroll to the end of the screen
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		
		elementFetch.getWebElement("XPATH", DashBoardPageElements.boardUnderWorkspace).click();;
		Thread.sleep(5000);
		
	}
	
	

}
