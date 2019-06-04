Feature: User Registration on Doordash web app

  Scenario Outline : User should be able to sign up with valid input

    Given user is already on Sign Up Page
    When title of sign up page is "DoorDash Food Delivery | Restaurant Delivery"
    Then user enters valid "<firstname>", "<lastname>" and "<email>"
    And  user enters "<phone>" and "<password>"
    When user clicks on SignUp button
    Then Home Page should be displayed

    Examples:
      | firstname  |  lastname |  email                    |  phone        | password |
      | Amanda     |  Anderson |  dariana.osinski@yahoo.com|  202-555-0119 | 123456   |