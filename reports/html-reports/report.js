$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("student/Student.feature");
formatter.feature({
  "line": 2,
  "name": "Students",
  "description": "",
  "id": "students",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9012952929,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Check belarus students",
  "description": "",
  "id": "students;check-belarus-students",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@student"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I navigate to http://40.127.132.250:8090/listStudents",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "all mobile numbers are numeric",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://40.127.132.250:8090/listStudents",
      "offset": 14
    }
  ],
  "location": "NavigationSteps.iNavigateTo(String)"
});
formatter.result({
  "duration": 7927844108,
  "status": "passed"
});
formatter.match({
  "location": "StudentSteps.assertMobileNumbersNumeric()"
});
formatter.result({
  "duration": 399593555,
  "status": "passed"
});
formatter.after({
  "duration": 161955965,
  "status": "passed"
});
});