Feature: My First cucumber test

  As a tester,
  I would like to utilize cucumber,
  So that I can create BDD style tests.

  @wip
  Scenario: Google search, using selenium
    Given I have navigated to google
    When I search for "selenium"
    Then the page title should be "selenium - Google Search"

