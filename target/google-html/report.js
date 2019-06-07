$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Google.feature");
formatter.feature({
  "name": "Google Search",
  "description": "  As a Simple Mortal\n  I want to do some google search\n  So that I can learn something",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "User searches for automation in google.com",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "I open de browser",
  "keyword": "Given "
});
formatter.match({
  "location": "GoolgSteps.openBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to google",
  "keyword": "And "
});
formatter.match({
  "location": "GoolgSteps.navigateGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for automation",
  "keyword": "When "
});
formatter.match({
  "location": "GoolgSteps.searchValue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate a list results",
  "keyword": "Then "
});
formatter.match({
  "location": "GoolgSteps.validateListOfResults()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});