package com.epam.tam.stepdefs;

import com.epam.tam.hooks.Hooks;
import com.epam.tam.pages.CommonPage;
import io.cucumber.java.en.Given;
import io.cucumber.messages.Messages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonSteps {
    CommonPage commonPage = new CommonPage(Hooks.getDriver());
    WebDriver driver = Hooks.getDriver();

    @Given("^I open the (.+) page$")
    public void iOpenThePage(String url) {
        commonPage.openPage(url);
        blockAd();
    }

    public void blockAd() {
        if (!driver.findElements(By.id("at-cv-lightbox-close")).isEmpty()){
            WebElement closeButton = driver.findElement(By.id("at-cv-lightbox-close"));
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(closeButton));
            closeButton.click();
        }
    }
}
