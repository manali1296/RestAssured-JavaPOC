$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("StudentApiTest.feature");
formatter.feature({
  "line": 1,
  "name": "Test Student API List",
  "description": "",
  "id": "test-student-api-list",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 30,
  "name": "use Patch to update the data",
  "description": "",
  "id": "test-student-api-list;use-patch-to-update-the-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@5"
    },
    {
      "line": 29,
      "name": "@TestDemo"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "I go to \"http://localhost\"",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I update the data of student",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "I verify status code 200",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost",
      "offset": 9
    }
  ],
  "location": "StudentStep.i_go_to(String)"
});
formatter.result({
  "duration": 929989000,
  "status": "passed"
});
formatter.match({
  "location": "StudentStep.i_update_the_data_of_student()"
});
formatter.result({
  "duration": 2701248100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 21
    }
  ],
  "location": "StudentStep.i_verify_status_code(int)"
});
formatter.result({
  "duration": 2533400,
  "status": "passed"
});
});