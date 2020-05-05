package CommonUtilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listner extends Cutilities implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		
	System.out.println("The test case Started and info is:"+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		date();
		try {
			Screenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The test case Success HURRAY and info is:"+result.getName());
	}

    public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
    	try {
			Screenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The test case failed and info is:"+result.getName());
		
	}
    public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

    public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

    public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

    public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
