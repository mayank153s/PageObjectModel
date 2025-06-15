package maven.resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	public static ExtentReports getReportObject() {
		String path = System.getProperty("E:\\Automation\\PageObjectModel\\test-output\\old\\index.html");
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Amazon automation test result");
		reporter.config().setDocumentTitle("Test Result101");
		
		
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Mayank");
		return extent;
	} 

	
	
}
