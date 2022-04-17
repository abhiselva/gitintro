package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsNG {
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	//public ExtentTest test;
	
	public static ExtentReports getExtentReports()

	{
// ExtentReports , ExtentSparkReporter
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
        reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Abhi");
		return extent;

	}

}
