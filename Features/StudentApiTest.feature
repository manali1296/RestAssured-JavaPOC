Feature: Test Student API List

@1 @TestDemo
Scenario: get student list
When I go to "http://localhost"
Then I get all student data
Then I verify status code 200


@2 @TestDemo
Scenario: post student list
When I go to "http://localhost:8080"
Then I post student data
Then I verify status code 201

@3 @TestDemo
Scenario: Delete student data
When I go to "http://localhost"
Then I delete id-10 from student data
Then I verify status code 204


@4 @TestDemo
Scenario: Put student data
When I go to "http://localhost"
Then I put some student data
Then I verify status code 200

@5 @TestDemo
Scenario: use Patch to update the data
When I go to "http://localhost"
Then I update the data of student
Then I verify status code 200