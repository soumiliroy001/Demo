#Author-->Comment
@SmokeScenario
Feature: Feature to test login functionality

@SmokeTest
  Scenario: Check login is successful with valid credentials
    Given User is in login page
    When User enters username and password
    And Clicks on login button
    Then User is navigated to home page

  #Scenario Outline: Check login is successful with valid credentials
    #Given User is in login page
    #When User enters <username> and <password>
    #And Clicks on login button
    #Then User is navigated to home page

    #Examples: 
      #| username | password |
      #| user1    | pass1    |
      #| user2    | pass2    |
