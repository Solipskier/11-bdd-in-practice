package com.epam.tam.stepdefs;

import com.epam.tam.hooks.Hooks;
import com.epam.tam.pages.BasicSelectDropDownPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class BasicSelectDropDownSteps {
    private BasicSelectDropDownPage basicSelectDropDownPage = new BasicSelectDropDownPage(Hooks.getDriver());

    @When("^I select (.+) from dropdown menu$")
    public void selectDayFromTheDropDown(String day) {
        basicSelectDropDownPage.selectDay(day);
    }

    @And("^The (.+) should be selected$")
    public void validateTheSelectedDay(String day) {
        Assertions.assertEquals(day, basicSelectDropDownPage.getSelectedDay());
    }

    @Then("^The (.+) should be displayed$")
    public void validateTheSelectedDayMsg(String msg) {
        Assertions.assertEquals(msg, basicSelectDropDownPage.getSelectedDayMsg());
    }
}
