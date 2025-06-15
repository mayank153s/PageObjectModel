package maven.test;

import java.io.File;
import java.io.File.*;
import java.time.Duration;

import javax.swing.plaf.basic.BasicFileChooserUI;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import maven.pageobjectmodel.LoginPage;

public class BaseTest {
	
	WebDriver driver;

	public WebDriver InitializeDriver() {
		
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		return driver;
	}
	
	
	
	public WebDriver GoToApplication() {
		
		driver = InitializeDriver();
	    driver.get("https://www.amazon.in/");
		
		return driver;
	}
	
	
    public void GoToUltimateQA() {
	    driver.get("https://ultimateqa.com/automation/");
		
	}
	
	
//	public String getScreenshot(String testCaseName) {
//		TakesScreenshot ss = (TakesScreenshot)driver;
		
//		creating source file
//		File source = ss.getScreenshotAs(OutputType.FILE);
//		destination
//		File file = new File("E:/Automation/PageObjectModel/test-output/screenshots"+testCaseName+".png");
	    
//		FileUtils.copy(source,file);
		
//	}
	
	
	
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
