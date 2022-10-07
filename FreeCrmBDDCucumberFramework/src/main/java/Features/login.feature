#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Free CRM login Feature

# 1. Simple Data Driven -- without Examples keyword:
#Scenario: Free CRM login Test Scenario
#
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "rajeevanand1991@gmail.com" and "Test@123" ####
#Then user clicks on login button
#Then user is on home page


#2. With Examples keyword + Scenario Outline
Scenario Outline: Free CRM login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then close the browser

Examples:
	|	username									|	password	|
	|	rajeevanand1991@gmail.com	|	Test@123	|
	|	tom												|	test456		|

#Scenario: user is able to create a new contact
#Given user is already on home page
#When user mouse over on contacts link
#Then user clicks on New Contact link
#Then user enters firstname and lastname
#Then user clicks on save button
#Then verify new contact created
#Then close the browser



#@tag
#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
