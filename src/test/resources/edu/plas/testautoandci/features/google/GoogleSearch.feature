@google @search
Feature: Google Search

  @logo @feelingLucky
  Scenario: Google Search logo appears
    Given I navigate to https://www.google.com/ncr
    Then the Google logo is displayed
    And the I'm Feeling Lucky button is displayed
    When I hover over the I'm Feeling Lucky button
    Then a different text is shown in the I'm Feeling Lucky button

  @uom @lecture6
  Scenario: Google Search returns stats and results
    Given I navigate to https://www.google.com/ncr
    When I search for 'University of Malta' on Google Search
    Then the Google stats tab is displayed
    And the Google search results are displayed

  @flag @lecture6
  Scenario: Google Search for country returns flag
    Given I navigate to https://www.google.com/ncr
    When I search for 'Malta' on Google Search
    Then the flag of 'Malta' is displayed