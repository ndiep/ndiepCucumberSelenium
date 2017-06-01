$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SetupFeatures/SetupAutomateUsers2.feature");
formatter.feature({
  "line": 1,
  "name": "Administrator Successfully Creates a New Member",
  "description": "",
  "id": "administrator-successfully-creates-a-new-member",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6206479064,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login to Portal Home using admin account",
  "description": "",
  "id": "administrator-successfully-creates-a-new-member;login-to-portal-home-using-admin-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Home Page",
  "rows": [
    {
      "cells": [
        "https://rpubs120025.ags.esri.com/portal/home/"
      ],
      "line": 5
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User navigates to Login page and Logs in with Username and Password",
  "rows": [
    {
      "cells": [
        "admin",
        "adminuser01"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User Navigate to My Organization Page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Adds a single user",
  "rows": [
    {
      "cells": [
        "auto1@e.com",
        "autoPublisher",
        "automate",
        "automate1",
        "automate.1",
        "Publisher"
      ],
      "line": 12
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User Navigate to My Organization Page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Adds a single user",
  "rows": [
    {
      "cells": [
        "auto2@e.com",
        "autoUser",
        "automate",
        "automate2",
        "automate.2",
        "User"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User LogOut from the Application",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User navigates to Login page and Logs in with Username and Password",
  "rows": [
    {
      "cells": [
        "automate1",
        "automate.1"
      ],
      "line": 19
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User LogOut from the Application",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User navigates to Login page and Logs in with Username and Password",
  "rows": [
    {
      "cells": [
        "automate2",
        "automate.2"
      ],
      "line": 22
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User LogOut from the Application",
  "keyword": "And "
});
formatter.match({
  "location": "Test_Steps.user_is_on_Home_Page(DataTable)"
});
formatter.result({
  "duration": 1079712268,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_enters_UserName_and_Password(DataTable)"
});
formatter.result({
  "duration": 12202244115,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.message_displayed_Login_Successfully()"
});
formatter.result({
  "duration": 163115,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.publisher_Navigate_to_My_Organization_Page()"
});
formatter.result({
  "duration": 3774293376,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.adds_a_single_user(DataTable)"
});
formatter.result({
  "duration": 22544070505,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.publisher_Navigate_to_My_Organization_Page()"
});
formatter.result({
  "duration": 2757401911,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.adds_a_single_user(DataTable)"
});
formatter.result({
  "duration": 27734020581,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_LogOut_from_the_Application()"
});
formatter.result({
  "duration": 2049335118,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_enters_UserName_and_Password(DataTable)"
});
formatter.result({
  "duration": 7303779813,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_LogOut_from_the_Application()"
});
formatter.result({
  "duration": 2612512356,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_enters_UserName_and_Password(DataTable)"
});
formatter.result({
  "duration": 5655716690,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_LogOut_from_the_Application()"
});
formatter.result({
  "duration": 1125970477,
  "status": "passed"
});
formatter.after({
  "duration": 126876295,
  "status": "passed"
});
});