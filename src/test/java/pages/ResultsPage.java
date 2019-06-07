package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ResultsPage {
	
WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//*[@class='srg']")
	WebElement resultsContainer;
	
		
	public ResultsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean at() {
		return false;
	}
	
	public void validateListOfResults() {
		Assert.assertNotNull(resultsContainer);
	}

}
