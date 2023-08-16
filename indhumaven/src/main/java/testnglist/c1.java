package testnglist;

import org.testng.ITestContext;

import org.testng.ITestListener;
import org.testng.ITestResult;

/*
 * ITestListener => builtin interface
 * OnStart, OnFinish, OnTestSucess, OnTestfailure
 * step 1:
 * class=> Interface => class definition=> implements interfacename
 * right click => source => override or implement method 
 * selected start, finish, success, failure
 * 
 * 
 */

public class c1 implements ITestListener{

	public void onTestSuccess(ITestResult result) {
		System.out.println("Success!!!!!");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("failed!!!!!");
	}

	public void onStart(ITestContext context) {
		System.out.println("Started!!!!!");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Finished!!!!!");
	}
	

}
