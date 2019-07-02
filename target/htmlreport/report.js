$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/eg1.feature");
formatter.feature({
  "name": "Login Test",
  "description": "Description:Registered user can login to the application using valid username and valid password ",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid combination",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user opens login page in newtours application",
  "keyword": "Given "
});
formatter.match({
  "location": "login.user_opens_login_page_in_newtours_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter username as \"mercury\" and password as \"mercury\"",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_enter_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click submit button",
  "keyword": "And "
});
formatter.match({
  "location": "login.click_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify login success",
  "keyword": "Then "
});
formatter.match({
  "location": "login.verify_login_success()"
});
formatter.result({
  "status": "passed"
});
});