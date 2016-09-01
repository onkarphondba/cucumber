Feature: To test Navigation to website Works

  Scenario: User is navigate to website with no errors
    Given I am on website
    When I click on link
    And populate the link form
    Then I should be on correct page