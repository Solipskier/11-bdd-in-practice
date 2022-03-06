Feature: Validate input fields on the page

  Scenario Outline: Two input field validation
    Given I open the <url> page
    When I write <value A> into the value A input field
    And I write <value B> into the value B input field
    And Press the get total button
    Then The <text> should be visible

    Examples:
      | url                                                      | value A | value B | text |
      | https://demo.seleniumeasy.com/basic-first-form-demo.html | a       | b       | NaN  |