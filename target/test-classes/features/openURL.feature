Feature: Opening the Browser
  Background: Open URL
    Given Open the Webdriver
    Then Enter The  URL
    When Page is Loaded
    And Check the URL

  Scenario:Upcoming Bikes
    Given The page
    Then Move to new Bike
    And click on the Upcoming bikes from the list
    Then Select The manufacturer as honda
    When Results are displayed
    Then Store all the details
    And Display them All
    Then close the Browser

  Scenario: Popular car models
    Given The page
    Then Move to Used Cars
    And Select the city
    When Page is Loaded
    Then Move to the Popular cars
    And Store and Display details
    Then close the Browser

  Scenario:Login with google
    Given The page
    Then Move to Login Button
    And Click it
    When Page is Loaded
    Then Click on continue with google
    And Give Invalid Credentials
    Then Capture the Invalid Message
    Then Screenshot capture

    And close the Browser














