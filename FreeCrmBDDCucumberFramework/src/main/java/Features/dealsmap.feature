Feature: Deal data creation

  Scenario: Free CRM Create a new deal Scenario
    Given user is already on Login Page
    When title of login page is Free CRM
    Then user enters username and password
      | username                  | password |
      | rajeevanand1991@gmail.com | Test@123 |
    Then user clicks on login button
    Then user is on home page
    Then user moves to new deals page
    Then user enters deal details
      | title      | amount | probability | commission |
      | test deal1 |   1000 |          50 |         10 |
      | test deal2 |   2000 |          60 |         20 |
      | test deal3 |   3000 |          70 |         30 |
    Then close the browser
