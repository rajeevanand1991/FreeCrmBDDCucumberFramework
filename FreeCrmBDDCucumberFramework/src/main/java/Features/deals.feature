Feature: Deal data creation

Scenario: Free CRM Create a new deal Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters username and password
|	rajeevanand1991@gmail.com	|	Test@123	|
Then user clicks on login button
Then user is on home page
Then user moves to new deals page
Then user enters deal details
|	test deal	|	1000	|	50	|	10	|
Then close the browser