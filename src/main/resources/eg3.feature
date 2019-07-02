Feature: signup
Scenario Outline: test signup function with different set of input
Given user open signup page
When user enters fn as "<firstname>"
And user enters ln as "<lastname>"
And user enters db as "<dob>"
And user enters pwd as "<password>"
And user enters cpwd as "<confirm password>"
Then click signup button
And verify signup success message

Examples:
|firstname|lastname|dob|password|confirm password|
|jan|lif|7.6.1998|janlif|janlif|
|janish|lifra|10.5.1996|nellif|nellif|