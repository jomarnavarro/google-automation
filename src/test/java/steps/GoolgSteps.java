package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GoogleHomePage;
import pages.ResultsPage;

public class GoolgSteps {

	public WebDriver driver;
	public GoogleHomePage home;
	public ResultsPage results;

	@Given("I open de browser")
	public void openBrowser() {

		driver = new ChromeDriver();
		home = new GoogleHomePage(driver);
		results = new ResultsPage(driver);
	}

	@And("I navigate to google")
	public void navigateGoogle() {
		driver.navigate().to("http://www.google.com");
		Assert.assertTrue(home.at());

	}

	@When("I search for automation")
	public void searchValue() {
		home.search("automation");
	}

	@Then("I validate a list results")
	public void validateListOfResults() {
		results.validateListOfResults();
	}

	@After
	public void finish() {
		driver.close();
	}

}
