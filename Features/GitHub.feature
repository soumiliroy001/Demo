Feature: Github Registration and login

Scenario: github login
	Given user is on github login
	When user enter username or email
	And user enter password
	And click on SignIn button
	Then verify the title "GitHub" of page