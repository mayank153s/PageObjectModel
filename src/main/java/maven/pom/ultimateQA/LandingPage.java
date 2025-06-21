package maven.pom.ultimateQA;

import java.util.HashMap;
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
	
	@FindBy(linkText = "Interactions with simple elements")
	WebElement interActiveElementsPage;
	
	@FindBy(xpath="(//div[@class='et_pb_text_inner']/h2)[2]")
	WebElement tableHeading;
	
	
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
	
	public void getTableDataHashMap() {
		interActiveElementsPage.click();
		ScrollUntilELementFound(tableHeading);
		List<WebElement> rows = driver.findElements(By.xpath("(//div[@class='et_pb_text_inner'])[3]/table/tbody/tr"));
		System.out.println(rows.size());
		HashMap<String, String> map = new HashMap<String, String>();
		
//		we put try catch block as findElement throws NoSuchElementException for row[0](as it is a header and has 
//		<th>tag not <td>tag and we are finding <td>tag in line61 )
		for(WebElement row : rows) {
			try {
			map.put(row.findElement(By.xpath("td[1]")).getText(),row.findElement(By.xpath("td[3]")).getText());
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println(map);
	}
}
