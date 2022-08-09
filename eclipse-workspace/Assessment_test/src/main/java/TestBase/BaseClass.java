package TestBase;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Utility.configData;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Utility.ConfigReader;

public class BaseClass {
	public static ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	@BeforeSuite
	public void setReport() {

		htmlReporter = new ExtentHtmlReporter("./reports/extent.html");
		htmlReporter.config().setEncoding("UTF-8");
		htmlReporter.config().setDocumentTitle("Amazon");
		htmlReporter.config().setReportName("Amazon Automation test");
		htmlReporter.config().setTheme(Theme.DARK);
 
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);	
		

	}
	public static WebDriver driver;
	public ConfigReader config;
	
	@BeforeClass
	public void setupSuit() {
		config = new ConfigReader();
		 }
		 
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\Executable\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.get(config.getUrl());
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void TearDown(ITestResult result) {
		{

			if (result.getStatus() == ITestResult.FAILURE) {

				String excepionMessage = Arrays.toString(result.getThrowable().getStackTrace());
				test.fail("<details>" + "<summary>" + "<b>" + "<font color=" + "red>" + "Exception Occured:Click to see"
						+ "</font>" + "</b >" + "</summary>" + excepionMessage.replaceAll(",", "<br>") + "</details>"
						+ " \n");
				String failureLogg = "TEST CASE FAILED";
				Markup m = MarkupHelper.createLabel(failureLogg, ExtentColor.RED);
				test.log(Status.FAIL, m);
			}

			else if (result.getStatus() == ITestResult.SUCCESS) {

				String methodName = result.getMethod().getMethodName();

				String logText = "<b>" + "TEST CASE: - " + methodName.toUpperCase() + "  PASSED" + "</b>";

				Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
				test.pass(m);

			}
			}
		
		}
	
	
	
	@AfterSuite
	public void endReport() {

		extent.flush();
		driver.close();
		
	}

}
