Feature: Order a shirt

  @OrderTShirt
  Scenario: Order a shirt online from web application
    Given user is on home page
    When user sign up to the application
    And order a shirt
    Then success msg is displayed

  @ChangeName
  Scenario: Change name in my account
    Given user is on home page
    When user sign into the account
    And change first name on Personal Information page
    Then changed name is displayed Personal Information page