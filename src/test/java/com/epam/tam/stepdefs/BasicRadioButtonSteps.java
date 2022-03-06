package com.epam.tam.stepdefs;

import com.epam.tam.hooks.Hooks;
import com.epam.tam.pages.BasicRadioButtonPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class BasicRadioButtonSteps {
    private final BasicRadioButtonPage basicRadioButtonPage = new BasicRadioButtonPage(Hooks.getDriver());
    @When("^I click Male radio button")
    public void clickOnMaleRadioButton() { basicRadioButtonPage.clickOnMaleRadioButton(); }
    @And("^I click Adult radio button")
    public void clickOnAdultsRadioButton() { basicRadioButtonPage.clickOnAdultsRadioButton(); }
    @And("^I click Get values button")
    public void clickOnGetValuesButton(){
        basicRadioButtonPage.clickOnGetValuesButton();
    }
    @Then("^I see (.+) and (.+)")
    public void validateTheRadioButtonText(String gender, String age){
        Assertions.assertTrue(basicRadioButtonPage.getRadioButtonValues().contains(gender)&&basicRadioButtonPage.getRadioButtonValues().contains(age));
    }
}
