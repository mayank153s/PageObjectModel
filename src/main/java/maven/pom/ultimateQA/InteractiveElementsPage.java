package maven.pom.ultimateQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import maven.abstractComponent.AbstractComponent;

public class InteractiveElementsPage extends AbstractComponent {

	WebDriver driver;
	public InteractiveElementsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	

   
	
	
}
