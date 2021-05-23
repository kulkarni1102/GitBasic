package extentReportSession;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class TestingExtentReport {
	
	@Test
	
	void test()
	{
		
		ExtentReports report = new ExtentReports(System.getProperty("user.dir")+ "//ExtentReport.html");
		ExtentTest test = report.startTest("test to verify the title");
		System.out.println("launch the browser");
		test.log(LogStatus.PASS, "Launch the browser");
		System.out.println("Enter the url");
		test.log(LogStatus.PASS, "Url is success");
		System.out.println("close the browser");
		test.log(LogStatus.PASS, "title is correct");
		report.endTest(test);
		report.flush();
		
	}

}
