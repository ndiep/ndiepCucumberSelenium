@AutoGravityTest
Feature: AutoGravityTest
	Goes through searching for car and loan

Scenario: Title of your scenario
Given user is on apply page
When I choose a make
	And I choose a model
	And I select a trim
	And I click select loan
Then I should be on find a dealership
When I enter in city
	And I select dealer from list
Then I should be on search for financing
When I start financing
	And I enter in personal information
