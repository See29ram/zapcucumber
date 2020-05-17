$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/udemy/pageclasses/zappostest.feature");
formatter.feature({
  "name": "Zappos feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Another Product Search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User landed at HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.udemy.pageclasses.ZapposStepDefn.user_landed_at_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Zappos_User Clicked on Sigin and Navigate to Login Page",
  "keyword": "When "
});
formatter.match({
  "location": "com.udemy.pageclasses.ZapposStepDefnAnother.zappos_user_Clicked_on_Sigin_and_Navigate_to_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Zappos_User provide credentials and Navigate to User Search Page",
  "keyword": "And "
});
formatter.match({
  "location": "com.udemy.pageclasses.ZapposStepDefnAnother.zappos_user_provide_credentials_and_Navigate_to_User_Search_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Zappos_User Search Product \"hats\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.udemy.pageclasses.ZapposStepDefnAnother.zappos_user_Search_Product(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Zappos_User Search result should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.udemy.pageclasses.ZapposStepDefnAnother.zappos_user_Search_result_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});