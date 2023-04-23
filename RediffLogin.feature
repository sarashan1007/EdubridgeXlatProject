Feature: Verify below features of Rediff app
Login feature, Forgot password link, Create a new account link

	@RegressionTest
  Scenario: Verify login with valid username and valid password
      Given user should be in login page
      When user enter valid username and valid password
      And click on signin button
      Then user should be able to logged in
      And close the browser
  
   @RegressionTest    
   Scenario: Verify login with valid username and invalid password
      Given user should be in login page
      When user enter valid username and invalid password
      And click on signin button
      Then user should not be able to logged in
      And close the browser
   
   @SmokeTest
   Scenario: Verify forgot password link
      Given user should be in login page
      Then forgot password link should be displayed in login page
      And close the browser
    
   @SmokeTest  
   Scenario: Verify create a new account link
      Given user should be in login page
      Then create new account link should be displayed in login page
      And close the browser