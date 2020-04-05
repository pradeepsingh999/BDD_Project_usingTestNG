$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Basic_Search.feature");
formatter.feature({
  "line": 1,
  "name": "Check basic search functionality in iPulse",
  "description": "",
  "id": "check-basic-search-functionality-in-ipulse",
  "keyword": "Feature"
});
formatter.before({
  "duration": 236200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verifying basic search functionality",
  "description": "",
  "id": "check-basic-search-functionality-in-ipulse;verifying-basic-search-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "open the iPulse application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "insert testscriptuser into the username field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "insert welcome123123 into the password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user should be login and logout button should be visible",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on search work order top menu",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "pick first work order no.",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "insert into the work order field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "first work order should be same as picked one",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.open_the_iPulse_application()"
});
formatter.result({
  "duration": 41295305100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testscriptuser",
      "offset": 7
    },
    {
      "val": "username",
      "offset": 31
    }
  ],
  "location": "stepDefinitions.insert_value_into_the_field(String,String)"
});
formatter.result({
  "duration": 86581700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "welcome123123",
      "offset": 7
    },
    {
      "val": "password",
      "offset": 30
    }
  ],
  "location": "stepDefinitions.insert_value_into_the_field(String,String)"
});
formatter.result({
  "duration": 51947000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.click_login_button()"
});
formatter.result({
  "duration": 58869100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.user_should_be_login_and_logout_button_should_be_visible()"
});
formatter.result({
  "duration": 9400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.click_on_search_work_order_top_menu()"
});
formatter.result({
  "duration": 11200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.click_on_search_button()"
});
formatter.result({
  "duration": 8600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.pick_first_work_order_no()"
});
formatter.result({
  "duration": 6700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.insert_into_the_work_order_field()"
});
formatter.result({
  "duration": 6700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.click_on_search_button()"
});
formatter.result({
  "duration": 5700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.first_work_order_should_be_same_as_picked_one()"
});
formatter.result({
  "duration": 6400,
  "status": "passed"
});
});