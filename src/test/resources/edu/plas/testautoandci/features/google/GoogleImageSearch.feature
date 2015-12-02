@google @imageSearch
Feature: Google Image Search

  Scenario Outline: Image search
    Given I navigate to https://www.google.com/imghp
    When I search for '<searchText>' on Google Images
    Then there are '<occurrences>' images that contain '<expectedSearchResult>'

  Examples:
    | searchText                         | occurrences | expectedSearchResult             |
    | most colourful monkey in the world | at least 3  | pink monkey                      |
    | boring zebra                       | 0           | orange with red polka dot zebras |

  @animalImages @lecture6
  Scenario Outline: Image search
    Given I navigate to https://www.google.com/imghp
    When I search for '<searchText>' on Google Images
    Then there are '10 or more' images

  Examples:
    | searchText                         |
    | most colourful monkey in the world |
    | boring zebra                       |