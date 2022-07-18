package com.Trello.Configurations;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Trello.PageEvents.BoardPage;
import com.Trello.PageEvents.DashboardPage;
import com.Trello.PageEvents.LoginPage;
import com.Trello.Utility.PropertiesFile;

public class SampleTest extends BasicConfiguration {
	
	PropertiesFile properties = new PropertiesFile();
	
	public static String password;
	public static String username;
	public static String boardTitle;
	public static String cardPosition;
	private String[] boardlists= {"Food", "Music"};
	private String[] cardDetails= {"Buffet","Party"};
	
	public void SampleTest(String password,String username, String boardTitle,String cardPosition) {
		this.password = password;
		this.username =username;
		this.boardTitle = boardTitle;
		this.cardPosition=cardPosition;
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	

	public String getCardPosition() {
		return cardPosition;
	}

	public void setCardPosition(String cardPosition) {
		this.cardPosition = cardPosition;
	}

	@Test(priority=1)
	public void loginTest() throws InterruptedException {
		properties.readProperties();
		
		LoginPage loginPage = new LoginPage();
		loginPage.enterLoginCredentials(username, password);
		
		DashboardPage dashboardPage = new DashboardPage();
		dashboardPage.selectTemplate(boardTitle);
		
		BoardPage boardPage = new BoardPage();
		boardPage.addFirstList(boardlists[0]);
		boardPage.addList(boardlists[1]);
		
		boardPage.addFirstcard(cardDetails[0]);
		boardPage.moveCardsBetweenLists(cardPosition);
		SoftAssert soft = new SoftAssert();
		soft.assertAll();
		
	
	}

}
