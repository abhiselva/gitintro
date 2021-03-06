package samplemavenproject.mavenjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsClass {

	public ExtentReports extent;
	public ExtentSparkReporter reporter;
	public ExtentTest test;
	
	@BeforeTest
	public void config()

	{
// ExtentReports , ExtentSparkReporter
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
        reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Abhi");

	}

	@Test
	public void initialDemo() {
		test = extent.createTest("Intial Demo");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.close();
        //test.fail("Its fail");
	}

	@Test
    public void testCase1() {
        test = extent.createTest("Test Case 1", "PASSED test case");
        Assert.assertTrue(true);
    }
    
    @Test(timeOut=1000)
    public void testCase2() {
        test = extent.createTest("Test Case 2", "PASSED test case");
        Assert.assertTrue(true);
    }
    
    @Test
    public void testCase3() {
        test = extent.createTest("Test Case 3", "PASSED test case");
        Assert.assertTrue(true);
    }
     
    @Test
    public void testCase4() {
        test = extent.createTest("Test Case 4", "PASSED test case");
        Assert.assertTrue(false);
        test.fail("Failed");
    }
    
    @AfterMethod
    public void flushing() {
    	extent.flush();
    }
}
//public class ExtentReportsClass {
//
//	ExtentReports extent;
//	ExtentTest test;
//
////	@BeforeTest
////	public void startReport() {
////		
////	}
//
//	@Test
//	public void config()
//	{
//		String path = System.getProperty("user.dir") + "\\reports\\index.html";
//		extent = new ExtentReports(path);
//		ExtentHtmlReporter html = new ExtentHtmlReporter("Extent.html");
//		ExtentSparkReporter extentx = new ExtentXReporter("localhost");
//		extentx.r
//		test = extent.startTest("installapp");
//		extent.attachReporter(html, extentx);
//		 
//		 
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.tripadvisor.com/");
//        String Title = driver.getTitle();
//        Assert.assertTrue(Title.contains("Trip"));
//        extent.endTest(test);
//        extent.flush();
//	}
//}
