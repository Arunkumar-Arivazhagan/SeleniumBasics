package listerners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener, ISuiteListener
{

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		//ISuiteListener.super.onStart(suite);
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		//ISuiteListener.super.onFinish(suite);
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test Started...." + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test successfully completed...." + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed...." + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped...." + result.getName());
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test completed...." + context.getName());
	}	

}
