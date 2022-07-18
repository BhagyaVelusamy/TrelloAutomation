package com.Trello.PageObjects;

public interface LoginPageElements {

	String trelloIcon = "/html/body/div[1]/img";
	String loginTitle = "/html/body/div[1]/section/div/div/h1";

	String username = "//*[@id='user']";
	String password = "//*[@id='password']";
	String loginButton = "//*[@id='login']";
	String loginButtonForAtlassion  ="//*[@id=\"login-submit\"]/span";
	String loginByAtlassion = "//*[@value='Log in with Atlassian']";
	String continueWithGoogleButton = "//*[@id='googleButton']/span[2]";
	String continueWithMicrosoftButton = "//*[@id='msftButton']";
	String continueWithApple = "//*[@id='signInWithAppleButton']";
	String loginwithSSO = "//*[@id='use-sso-button']";

}
