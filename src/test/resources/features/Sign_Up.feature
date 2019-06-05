Feature: User Registration on Doordash web app


  Background:
    Given user is already on Sign Up Page
    When title of sign up page is "DoorDash Food Delivery | Restaurant Delivery"


  Scenario Outline : User should be able to sign up with valid input
    Then user enters valid "<firstname>", "<lastname>" and "<email>"
    And  user enters valid "<phone>" and "<password>"
    When user clicks on SignUp button
    Then Home Page should be displayed

    Examples:
      | firstname  |  lastname |  email                    |  phone        | password |
      | Amanda     |  Anderson |  dariana.osinski@yahoo.com|  202-555-0119 | 123456   |



  Scenario Outline: User should not be able to sign up with invalid phone number
    Then user enters valid "<firstname>", "<lastname>" and "<email>"
    And  user enters invalid "<phone>" and valid "<password>"
    When user clicks on SignUp button
    Then "Valid mobile number required" should be displayed under Mobile Number box

    Examples:
      | firstname  |  lastname |  email    |  phone        | password |
      | Amanda     |  Anderson |  abcdefg  |  111-111-111  | 123456   |


  Scenario Outline: User should not be able to sign up with invalid password
    Then user enters valid "<firstname>", "<lastname>" and "<email>"
    And  user enters valid "<phone>" and invalid "<password>"
    When user clicks on SignUp button
    Then "Valid password required" should be displayed under Password box

    Examples:
      | firstname  |  lastname |  email    |  phone        | password |
      | Amanda     |  Anderson |  abcdefg  |  111-111-111  | 11       |

  Scenario Outline : User should be able to view password
    Then user enters valid "<password>"
    When user clicks Show inside of the password box
    Then password should be visible
    Examples:
       | password|
       | 123456   |

  Scenario Outline : User should be able to hide the password
    Then user enters valid "<password>"
    When user clicks Hide inside of the password box
    Then password should be invisible
    Examples:
      | password|
      | 123456   |

  Scenario : User should be able to sign up with Facebook link
    Then user clicks on Continue with Facebook link button
    Then Facebook log in window should pop-up

  Scenario : User should be able to sign up with Google link
    Then user clicks on Continue with Google link button
    Then Sign In with Google window should pop-up

  Scenario : User should be able to view Terms And Conditions link
    Then user clicks on Terms and Conditions button
    Then driver should navigate to Terms and Conditions Agreement page

  Scenario : User should be able to view Privacy Statements link
    Then user clicks on Privacy Statement button
    Then driver should navigate to Privacy Policy page

  Scenario : User should be able to click Sign In link
    Then user clicks on Sign In link
    Then driver should navigate to Sign page
