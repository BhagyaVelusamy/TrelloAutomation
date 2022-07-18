package com.Trello.Utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
	int count = 0;
	int retrycount = 0;

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub

		while (count < retrycount) {
			count++;
			return true;
		}
		return false;
	}

}
