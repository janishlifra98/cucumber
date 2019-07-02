Feature: Test Login

Scenario:Login with valid 
Given open newtours application
When user enter un as "mercury" and pwd as "mercury"
And  submit login form
Then verify pass 

Scenario:Login with invalid 
Given open newtours application
When user enter un as "jan" and pwd as "jan"
And  submit login form
Then verify failure 