Feature: Login functionality

  Background: Land to Home page
    Given Go to login page
  @smoke
  Scenario: Positive : Login with credentials admin
    Given Enter "aseyinovva1212@gmail.com" in userName or Email field
    And Enter "aseyinova1212" in password input field
    When user click on login button
    Then  user should successfully logged in


    @Smoke
    Scenario: Positive : Login with credentials new users
      Given Enter "aseyinovva1212@gmail.com" in userName or Email field
      And Enter "aseyinova1212" in password input field
      When user click on login button
      Then  user should successfully logged in
      When user click add user new button
      Then user should be in add user page
      And user should see following field names
      | First name | Last name | Email address | Username | Password | Bio | User type |Time zone | Language |


