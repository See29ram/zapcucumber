$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/udemy/pageclasses/zappostest.feature");
formatter.feature({
  "name": "Zappos feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Product Search",
  "description": "",
  "keyword": "Scenario"
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
  "name": "User Clicked on Sigin and Navigate to Login Page",
  "keyword": "When "
});
formatter.match({
  "location": "com.udemy.pageclasses.ZapposStepDefn.user_Clicked_on_Sigin_and_Navigate_to_Login_Page()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [https://www.zappo.com/] but found [https://www.zappos.com/]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:137)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:453)\r\n\tat org.testng.Assert.assertEquals(Assert.java:463)\r\n\tat com.udemy.pageclasses.ZapposStepDefn.user_Clicked_on_Sigin_and_Navigate_to_Login_Page(ZapposStepDefn.java:52)\r\n\tat ✽.User Clicked on Sigin and Navigate to Login Page(file:///D:/Projects/JavaProjects/LearnCucumber/src/test/java/com/udemy/pageclasses/zappostest.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User provide credentials and Navigate to User Search Page",
  "keyword": "And "
});
formatter.match({
  "location": "com.udemy.pageclasses.ZapposStepDefn.user_provide_credentials_and_Navigate_to_User_Search_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Search Product \"Shoe\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.udemy.pageclasses.ZapposStepDefn.user_Search_Product(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Product Search result should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.udemy.pageclasses.ZapposStepDefn.product_Search_result_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "Test Attach screenshot");
formatter.after({
  "status": "passed"
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
formatter.scenario({
  "name": "Favorites Scenario",
  "description": "",
  "keyword": "Scenario"
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
  "name": "I Click on Favorites",
  "keyword": "And "
});
formatter.match({
  "location": "com.udemy.pageclasses.ZapposStepDefn.i_Click_on_Favorites()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click On Home Page",
  "keyword": "And "
});
formatter.match({
  "location": "com.udemy.pageclasses.ZapposStepDefn.i_Click_On_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});