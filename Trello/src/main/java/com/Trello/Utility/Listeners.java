package com.Trello.Utility;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class Listeners implements ITestListener, IAnnotationTransformer {

	public void onTestStart(ITestResult result) {
		// not implemented
		//onTestStart(result);
	}

	public void onTestSuccess(ITestResult result) {
		// not implemented
		//onTestSuccess(result);
	}

	public void onTestFailure(ITestResult result) {
		// not implemented
		//onTestFailure(result);
	}

	public void onTestSkipped(ITestResult result) {
		// not implemented
	//	onTestSkipped(result);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// not implemented
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	public void onStart(ITestContext context) {
		// not implemented
	}

	public void onFinish(ITestContext context) {
		// not implemented
	}

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// not implemented

		annotation.setRetryAnalyzer(RetryAnalyser.class);
	}

}
