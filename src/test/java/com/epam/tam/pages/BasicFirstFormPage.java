package com.epam.tam.pages;

import com.epam.tam.hooks.Hooks;
import com.epam.tam.utils.BasePageObject;
import com.epam.tam.utils.Waiters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicFirstFormPage extends BasePageObject {

    public BasicFirstFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "sum1")
    private WebElement sum1;

    @FindBy(id = "sum2")
    private WebElement sum2;

    @FindBy(css = "#gettotal > button")
    private WebElement getTotalButton;

    @FindBy(id = "displayvalue")
    private WebElement totalAB;

    public void enterValueA(String message) { sum1.sendKeys(message); }

    public void enterValueB(String message) { sum2.sendKeys(message); }

    public void clickGetTotalAB () { getTotalButton.click(); }

    public boolean getTotalAB(String msg) {
        Waiters waiters = new Waiters(Hooks.getDriver(),10);
        return  waiters.waitingForTextToBePresent(By.cssSelector("#displayvalue"), msg);
    }
}
