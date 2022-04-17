package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		//System.out.println("Pass is encountered");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		System.out.println("Failure is encountered" + result.getName() + " " + result.getTestName());
	}

}
