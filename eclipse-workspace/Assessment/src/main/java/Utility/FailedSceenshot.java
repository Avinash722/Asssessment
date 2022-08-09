package Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class FailedSceenshot {
	public class Listeners implements ITestListener{

		public void onTestStart(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		public void onTestSuccess(ITestResult result) {
			


			
			 
			System.setProperty("org.uncommons.reportng.escape-output","true	");
			Reporter.log("<a href=\"E:\\Selenium\\Login.png\" target=\"_blank\">Screenshot link</a>");
			Reporter.log("<br>");
			Reporter.log("<a href=\"E:\\Selenium\\\\Login.png\" target=\"_blank\"><img height=200 width=200 src=\"E:\\\\Selenium\\\\Login.png\"></a>");
			System.out.println("Passed Test - "+result.getName());
			
			
		}

		public void onTestFailure(ITestResult result) {

			System.setProperty("org.uncommons.reportng.escape-output","false");
			Reporter.log("<a href=\"\\src\\Screenshot\\error.jpg\" target=\"_blank\">Screenshot link</a>");
			Reporter.log("<br>");
			Reporter.log("<a href=\\src\\Screenshot\\error.jpg\" target=\"_blank\"><img height=200 width=200 src=\"\\src\\Screenshot\\\\error.jpg\"></a>");
			
			
			System.out.println("Capturing Screenshot for the Failed test -- "+result.getName());
			
		}

		public void onTestSkipped(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
			
		}

		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			
		}

	}

}
