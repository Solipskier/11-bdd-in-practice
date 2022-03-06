Feature: Validate downloading progress

  Scenario Outline: Download complete
    Given I open the <url> page
    When I click on start download button
    Then Download finishes with <message>


    Examples:
      | url                                                                  | message   |
      | https://demo.seleniumeasy.com/jquery-download-progress-bar-demo.html | Complete! |