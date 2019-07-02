Feature:Login Test
Description:Registered user can login to the application using valid username and valid password 
Scenario:Login with valid combination
Given user opens login page in newtours application
When user enter username as "mercury" and password as "mercury"
And Click submit button
Then verify login success