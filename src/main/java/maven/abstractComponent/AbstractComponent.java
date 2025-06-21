package maven.abstractComponent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {

	WebDriver driver;
	

	
	public AbstractComponent(WebDriver driver) {
		this.driver = driver;
	}

	public void WaitTillElementAppear(By findby) {
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(findby));

	}
	
    public void Wait(WebElement element) {
		
		WebDriverWait ww = new WebDriverWait(driver,Duration.ofSeconds(20));
		ww.until(ExpectedConditions.invisibilityOf(element));
	}
    
    public void ScrollUntilELementFound(WebElement element) {
    	Actions action = new Actions(driver);
    	action.scrollToElement(element).perform();
    }

}
