package maven.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven.abstractComponent.AbstractComponent;

public class LoginPage extends AbstractComponent {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/*
	 * @FindBy(id ="ap_email") WebElement email;
	 */
	
	@FindBy(name ="email") 
	WebElement email;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement submit;
	
	@FindBy(id="ap_password")
	WebElement pass;
	
	
	@FindBy(xpath="(//input[@class=\"a-button-input\"])[2]")
	WebElement submitCode;
	
	@FindBy(xpath="(//input[@class=\"a-button-input\"])[1]")
	WebElement submitOTP;
	
	
	public void Login(String Email, String Password) {
		driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]")).click();
		WaitTillElementAppear(By.xpath("//input[@class='a-button-input']"));
		email.sendKeys(Email);
		submit.click();
		WaitTillElementAppear(By.xpath("(//input[@class='a-button-input'])[2]"));
		pass.sendKeys(Password);
		submitCode.click();
		Wait(submitOTP);
	}
	
	
	
	
	
	

}
