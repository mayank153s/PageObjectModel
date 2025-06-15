package maven.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import maven.pageobjectmodel.LoginPage;
import maven.pageobjectmodel.ProductPage;

public class StandAloneTest extends BaseTest {

	WebDriver driver;
	
	@Test
	public void LoginFunctionality() {
		// TODO Auto-generated method stub
		System.out.println("login");
		driver = GoToApplication();
		LoginPage loginpage= new LoginPage(driver);
		loginpage.Login("6377791534", "Mayank@153s");
		
	}
	
	
	@Test
	public void SearchProductFucntionality() {
		
		ProductPage pg = new ProductPage(driver);
		pg.SearchBar("shoes for men");
		
	}

}
