
  Feature: Create new user functionality
    Background: Land to Home page
      Given Go to login page
      Given Enter "aseyinovva1212@gmail.com" in userName or Email field
      And Enter "aseyinova1212" in password input field
      When user click on login button
      Then  user should successfully logged in

     @Test
      Scenario: Positive: Create new user
        Given user should click Add user button in Admin Home page
        And verify following field names are displayed
          | First name | Last name | Email address | Username | Password | Bio | User type | Time zone | Language |
      And  enter following data to create new user
        | firstName | lastName | emailAddress  | userName | password |
        |Elon       | Musk     |musk@gmail.com | elon     |123a#sdf  |
        |Leo        | Messi    |messiLi@psq.com| leo      |fds@a2323 |

