Feature: Validate radio buttons

  Scenario Outline: Select Male and Adult
    Given I open the <url> page
    When I click Male radio button
    And I click Adult radio button
    And I click Get values button
    Then I see <gender> and <age>


    Examples:
      | url                                                    | gender    | age |
      | https://demo.seleniumeasy.com/basic-radiobutton-demo.html | Sex : Male | Age group: 15 - 50 |