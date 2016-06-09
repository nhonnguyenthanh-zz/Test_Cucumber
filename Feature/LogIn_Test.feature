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

Feature: Login Action

Scenario: Successful Login with Valid Credentials
	Given User Navigate to LogIn Page
	When User enters UserName and Password
	When User is on Home Page
	Then Message displayed Login Successfully
	Then Close Browser
	
	
Scenario: Logout successfully
	Given User Navigate to LogIn Page
	When User enters UserName and Password
	When User is on Home Page
	When User LogOut from the Application
	Then Message displayed Logout Successfully
	Then Close Browser

	
