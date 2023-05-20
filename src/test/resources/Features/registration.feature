Feature: Registration functionalities

  Background:
    Given user is on the home page
    When user enter first name
    And user enter last name

  Scenario: Validate create new account


    And enter valid new email address
    And enter valid password
    Then create account option will active


  Scenario: Validate duplicate email will show error

    And enter used email address
    Then user will get error message