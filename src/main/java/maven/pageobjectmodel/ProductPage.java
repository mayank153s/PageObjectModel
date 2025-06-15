package maven.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven.abstractComponent.AbstractComponent;

public class ProductPage extends AbstractComponent{
	
	WebDriver driver;

	public ProductPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//input[@id=\"twotabsearchtextbox\"]")
	WebElement searchBar;
	
	@FindBy(id ="nav-search-submit-button")
	WebElement searchIcon;
	
	
	
	public void SearchBar(String str) {
		System.out.println(str);
		searchBar.sendKeys(str);
		searchIcon.click();
	} 
	
	public void Products() {
		
	}
	
	
	
	
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * }
	 */

}
