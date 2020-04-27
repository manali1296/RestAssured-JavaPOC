Feature: Test Student API List

@1 @TestDemo
Scenario: get student list
#When I go to "http://localhost"
When I get all student data
Then I verify status code 200

@2 @TestDemo
Scenario: post student list
When I post student data
Then I verify status code 201
And We get Sucess response with message "Student added"

@3 @TestDemo
Scenario: Delete student data
When I delete id-25 from student data
Then I verify status code 204

@4 @TestDemo
Scenario: Put student data
When I put some student data
Then I verify status code 200

@5 @TestDemo
Scenario: use Patch to update the data
When I update the data of student
Then I verify status code 200
And We get Sucess response with message "Updated"
