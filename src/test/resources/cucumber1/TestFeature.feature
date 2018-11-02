#Feature: This will test the list of available books
@tag
Feature: Title of your feature
 

#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
  @tag1
  Scenario: Test the application load and default page
    Given user launch the application
    Then user verifies the link "books"
    Then user click on link "books"
