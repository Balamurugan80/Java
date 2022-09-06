$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featurefiles/login.feature");
formatter.feature({
  "name": "Login Facebook Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To check the invalid user name and invalid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to Enter the Invalid user Id and Invalid  Password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_Enter_the_Invalid_user_Id_and_Invalid_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to Click the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_Click_the_Login_Button()"
});
formatter.result({
  "status": "passed"
});
});