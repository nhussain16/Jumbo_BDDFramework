Feature: Find dream jobs at Jumbo
  In order to get my desired job
	As a candidate
	I want to look jobs which matches with my skills

  Scenario: Search for App tester job from search option available at website header
    Given I want to access jumbo jobs portal
    When I search for 'App tester'
    Then searched vacancies count is shown as a result

	Scenario: Search invalid text from search option available at website header
    Given I want to access jumbo jobs portal
    When I search for 'invalid text'
    Then validation message is shown as a result

  Scenario: Look for App tester job details from search option available at website header
    Given I want to access jumbo jobs portal
    When I search for 'App tester'
    	And access job details
    Then office branch, location and hours per week display on screen
    	And verify the correct page title display