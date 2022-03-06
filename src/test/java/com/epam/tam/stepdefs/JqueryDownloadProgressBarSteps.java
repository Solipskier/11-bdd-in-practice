package com.epam.tam.stepdefs;

import com.epam.tam.hooks.Hooks;
import com.epam.tam.pages.JqueryDownloadProgressBarPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class JqueryDownloadProgressBarSteps {
    private final JqueryDownloadProgressBarPage jqueryDownloadProgressBarPage = new JqueryDownloadProgressBarPage(Hooks.getDriver());

    @When("^I click on start download button")
    public void clickOnStartDownloadButton() { jqueryDownloadProgressBarPage.clickOnStartDownloadButton(); }

    @Then("^Download finishes with (.+)")
    public void isMessageDisplayed(String message) {
        Assertions.assertTrue(jqueryDownloadProgressBarPage.isMessageDisplayed(message), "Message is not displayed!");
    }
}
