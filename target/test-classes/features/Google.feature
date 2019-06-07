#Authors: jomarnavarro@gmail.com, cesar.guerra@gmail.com, esmeralda.tirado23@gmail.com

@tag
Feature: Google Search
  As a Simple Mortal
  I want to do some google search
  So that I can learn something

  @tag1
  Scenario: User searches for automation in google.com
    Given I open de browser
    And I navigate to google
    When I search for automation
    Then I validate a list results
