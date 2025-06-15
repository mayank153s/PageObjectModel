package maven.pom.ultimateQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven.abstractComponent.AbstractComponent;

public class LandingPage extends AbstractComponent {

	WebDriver driver;
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	
	@FindBy(linkText="ULTIMATE QA")
	WebElement pageHeaderTitle;
	
	@FindBy(xpath="//ul[@id=\"menu-main-menu\"]/li")
	List<WebElement> headerElements;
	
	public String validateURL() {
		return driver.getCurrentUrl();
	}
	
	public void verifyHeaderElements() {
		for(int i=0;i<headerElements.size();i++) {
			System.out.println(headerElements.get(i).getText()+"   --"+i);
		}
	}
	
	public void getDynamicDropdownElements() {
	
	}
	
}
