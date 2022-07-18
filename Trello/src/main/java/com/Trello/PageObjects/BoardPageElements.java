package com.Trello.PageObjects;

public interface BoardPageElements {
	
	String listA_textbox = "//*[@id='board']/div/form/input";
	String listA_addListButton="//*[@id='board']/div/form/div/input";
	String listA_addCard ="//*[@id='board']/div[1]/div/div[3]/a/span[2]";
	
	String listA_addcard_textbox ="//*[@id='board']/div[1]/div/div[2]/div/div[1]/div/textarea";
	String listA_addcard_confirmbutton ="//*[@id='board']/div[1]/div/div[2]/div/div[2]/div[1]/input";
	String listB_textbox="//*[@id='board']/div[2]/form/input";
	String listB_addListButton="//*[@id='board']/div[2]/form/div/input";
	String listB_addcard ="//*[@id='board']/div[2]/div/div[3]/a/span[2]";
	
	String listB_addcard_textbox = "//*[@id='board']/div[2]/div/div[2]/div/div[1]/div/textarea";
	String listB_addcard_confirmbutton ="//*[@id='board']/div[2]/div/div[2]/div/div[2]/div[1]/input";
	
	String listMenu ="//*[@id='board']/div[1]/div/div[1]/div[2]/a";
	//String MoveList = "//*[@id='chrome-container']/div[4]/div/div[2]/div/div/div/ul[1]/li[3]/a";
	String moveList ="//*[@class='js-move-list']";
	String moveCardByPosition = "//*[@class='js-select-list-pos']";
	String moveCardButton ="//input[@class='nch-button nch-button--primary wide js-commit-position']";
	
	String movedcard_newposition = "//textarea[@class='list-card-edit-title js-edit-card-title']";
	String personalprofilemenu ="//*[@class='p6oJr7SHjK+vLr aqePx81u4BGHTH Glb3QqRGpd64YB']";
	String logoutbutton ="//button[@data-test-id=\"header-member-menu-logout\"]";
	String logoutmessage = "//*[@class='sc-kGXeez ceATsc']";

}
