package com.epam.tam.stepdefs;

import com.epam.tam.hooks.Hooks;
import com.epam.tam.pages.BasicFirstFormPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

public class BasicFirstFormSteps {
    private BasicFirstFormPage basicFirstFormPage = new BasicFirstFormPage(Hooks.getDriver());

    @When("^I write (.+) into the value A input field$")
    public void enterValueA(String valueA) { basicFirstFormPage.enterValueA(valueA); }

    @And("^I write (.+) into the value B input field$")
    public void enterValueB(String valueB) { basicFirstFormPage.enterValueB(valueB); }

    @And("^Press the get total button$")
    public void clickGetTotalButton() { basicFirstFormPage.clickGetTotalAB(); }

    @Then("^The (.+) should be visible")
    public void checkTotalAB(String message) { Assertions.assertTrue(basicFirstFormPage.getTotalAB(message)); }

}
