package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
					"src/test/resources/features/Google.feature"
				},
				strict = false,
				plugin = {
						"pretty",
						"html:target/google-html"
				},
				glue = {
					"pages",
					"steps",
					"utils"
				}
		)
public class GoogleRunner {}
