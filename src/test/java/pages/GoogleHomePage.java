package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePage {
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(how = How.NAME, using = "q")
	WebElement searchField;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Buscar con Google']")
	WebElement searchButton;
	
	public GoogleHomePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}
	
	public boolean at() {
		
		//searchField =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		//searchButton =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Google Search']")));
		return searchField.isDisplayed() ;
				//&& searchButton.isDisplayed();
	}
	
	public void search(String keyword) {
		searchField.sendKeys(keyword);
		wait.until(ExpectedConditions.elementToBeClickable(this.searchButton));
		searchButton.click();
	}

}
