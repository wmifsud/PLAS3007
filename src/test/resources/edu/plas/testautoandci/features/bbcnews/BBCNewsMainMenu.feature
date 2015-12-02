@bbc @news @mainMenu
Feature: BBC News Main Menu

  @mainMenuNumberOfItems @lecture5
  Scenario: Main menu items
    Given I navigate to http://www.bbc.com/news
    Then there are 18 main menu items

  Scenario: Main menu items are visible
    Given I navigate to http://www.bbc.com/news
    Then the main menu is visible with the following items:
      | Home                 |
      | Video                |
      | World                |
      | UK                   |
      | Business             |
      | Tech                 |
      | Science              |
      | Magazine             |
      | Entertainment & Arts |
      | Health               |
      | In Pictures          |

  @clickOnMenuItems @lecture6
  Scenario Outline: Main menu items open a separate index
    Given I navigate to http://www.bbc.com/news
    When I click on the menu item '<menuItem>'
    Then the '<menuItem>' index is displayed

  Examples:
    | menuItem             |
    | Home                 |
    | Video                |
    | World                |
    | US & Canada          |
    | UK                   |
    | Business             |
    | Tech                 |
    | Science              |
    | Magazine             |
    | Entertainment & Arts |
    | Health               |