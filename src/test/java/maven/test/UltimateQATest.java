package maven.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import maven.pom.ultimateQA.LandingPage;

public class UltimateQATest extends BaseTest {
	
	WebDriver driver = InitializeDriver();
	LandingPage landingPage= new LandingPage(driver);
	
	
    @Test(priority=1)
	public void VerifyLandingPage() {
		GoToUltimateQA();
		String url = landingPage.validateURL();
		Assert.assertEquals(url,"https://ultimateqa.com/automation/");
	}
	
    @Test(priority=2)
    public void GetHeaderElements() {
    	landingPage.verifyHeaderElements();
    }
	
	
}
