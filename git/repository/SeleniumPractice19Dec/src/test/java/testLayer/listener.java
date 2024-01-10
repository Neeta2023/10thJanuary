package testLayer;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("successful test");
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test failed");
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("test skipped");
		
		
	}
	
	
	
	

}
