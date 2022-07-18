package com.Trello.PageObjects;

public interface DashBoardPageElements {
	
	String trelloMenuInBoardScreen = "//*[@id='header']/a/div/div";
	String boardMenu = "//*[@class='rta9kchj3lSXQk P2YtVJyxrOCJp6']";
	String yourWorkspaceTitle ="//*[@class='boards-page-section-header-name']";
//	String boardUnderWorkspace ="//*[@id='content']/div/div[2]/div/div/div/div/div[1]/nav/div[2]/div/ul/li/ul/li[1]/a";
	String boardUnderWorkspace ="//*[@class='rta9kchj3lSXQk P2YtVJyxrOCJp6 QWO+HauLbGdqT2 soqkBVb8aJJ0wI WrgVKSfIAMO9VB']";
//	String boardTitle ="//input[@class='nch-textfield__input Hj0IB7nx8rs7UO Hj0IB7nx8rs7UO ysTE7s-UXRkpYP']";
	String boardTitle ="//*[@class='nch-textfield__input Hj0IB7nx8rs7UO Hj0IB7nx8rs7UO ysTE7s-UXRkpYP']";
	//String boardTitle="//*[@data-test-id='create-board-title-input']";
	String createboard = "//span[@class='boards-page-board-section-header-options-item-name']/span[contains(text(),'Boards')]";
	String addboardplusbutton ="//button[@class='FwTZlPFZOdDHDe Ts+YceGnvTbKoG _4y7Skbm3OXlhNV d3VddHWjHgldJq JIXQq8gDYY04N6']";
	String createNewBoard ="//span[contains(text(),'Create new board')]";

//	String frame_newBoard ="//*[@id='ssIFrame_google']";
	
	//String createButton = "/html/body/div[4]/div/section/div/div/div[2]/form/button";
	String createButton ="//button[@class='G2lWjDVJsvar3H Ts+YceGnvTbKoG HPCwi137Em5EYI JIXQq8gDYY04N6']";
}
