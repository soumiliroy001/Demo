Feature: Feature to test google search functionality

  Scenario: Google search is working
    Given Browser is open
    And User is on google search page
    When User enters a text in search box
    And hits enter
    Then User is navigate to search result
