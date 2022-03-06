package com.epam.tam.pages;

import com.epam.tam.hooks.Hooks;
import com.epam.tam.utils.BasePageObject;
import com.epam.tam.utils.Waiters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JqueryDownloadProgressBarPage extends BasePageObject {

    public JqueryDownloadProgressBarPage(WebDriver driver) { super(driver); }
    @FindBy(css = "#downloadButton")
    WebElement startDownloadButton;

    public void clickOnStartDownloadButton() { startDownloadButton.click(); }

    public boolean isMessageDisplayed(String msg) {
        Waiters waiters = new Waiters(Hooks.getDriver(),5);
        return  waiters.waitingForTextToBePresent(By.cssSelector("#dialog"), msg);
    }
}
