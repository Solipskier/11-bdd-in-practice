Feature: Validate selected day in dropdown

  Scenario Outline: Select day
    Given I open the <url> page
    When I select <value> from dropdown menu
    And The <value> should be selected
    Then The <text> should be displayed

    Examples:
      | url                                                           | value  | text                    |
      | https://demo.seleniumeasy.com/basic-select-dropdown-demo.html | Friday | Day selected :- Friday  |