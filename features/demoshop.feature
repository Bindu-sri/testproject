Feature: open demowebshop url and user shall be able to login to demowebshop site

  Scenario Outline: Succesfull login to demowebshop
    Given user launched chrome browser
    And user launched the home page of demowebshop site
    When user provides valid email as"<email>"
    When user provides valid password as"<password>"
    And user clicks on login button
    Then user shall be able to view the homepage with welcome message on top right of page along with his name

    Examples: 
      | email                | password   |
      | karthik456@gmail.com | karthik456 |
      | karthik456@gmail.com | karthik456 |
