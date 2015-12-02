@student
  Feature: Students
    Scenario: Check Student List
      Given I navigate to http://40.127.132.250:8090/listStudents
      Then there are '10' students

    Scenario: Check student details
      Given I navigate to http://40.127.132.250:8090/listStudents
      Then students have no details missing

    Scenario: Check francesco students
      Given I navigate to http://40.127.132.250:8090/listStudents
      Then there are '3' students named 'Francesco'


    Scenario: Check malta students
      Given I navigate to http://40.127.132.250:8090/listStudents
      Then there are at least '2' students from 'Malta'

    Scenario: Check belarus students
      Given I navigate to http://40.127.132.250:8090/listStudents
      Then there are '0' students from 'Belarus'

    Scenario: Check numbers numeric
      Given I navigate to http://40.127.132.250:8090/listStudents
      Then all mobile numbers are numeric