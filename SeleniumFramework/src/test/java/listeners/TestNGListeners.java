package listeners;

import org.testng.ITest;
import org.testng.ITestResult;

public  class TestNGListeners implements ITest {

	public void onTestStart(ITestResult result) {
		System.out.println("*****Test Started :"+result.getName());
	}

    public void onTestSuccess(ITestResult result) {
    	System.out.println("*****Test success :"+result.getName());
	}
	
    public void onTestFailure(ITestResult result) {
    	System.out.println("*****Test failed :"+result.getName());
	}
	
    public void onTestSkipped(ITestResult result) {
    	System.out.println("*****Test skipped :"+result.getName());
	}
	
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public String getTestName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
