Feature: Validate checkboxes on the page

  Scenario Outline: Check all checkboxes
    Given I open the <url> page
    When I check all checkboxes
    And All checkboxes are checked
    Then Button <string> appears

    Examples:
      | url                                                    | string     |
      | https://demo.seleniumeasy.com/basic-checkbox-demo.html | Uncheck All |