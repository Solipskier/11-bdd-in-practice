package com.epam.tam.pages;

import com.epam.tam.utils.BasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicRadioButtonPage extends BasePageObject {
    public BasicRadioButtonPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "input[value=Male][name=gender]")
    WebElement maleRadioButton;

    @FindBy(css = "input[value=\"15 - 50\"][name=ageGroup]")
    WebElement adultsRadioButton;

    @FindBy(css = "button[onclick=\"getValues();\"]")
    WebElement getValuesButton;

    @FindBy(css = "p.groupradiobutton")
    WebElement message;

    public void clickOnMaleRadioButton() { maleRadioButton.click(); }
    public void clickOnAdultsRadioButton() { adultsRadioButton.click(); }
    public void clickOnGetValuesButton() { getValuesButton.click(); }

    public String getRadioButtonValues() { return message.getText(); }


}
