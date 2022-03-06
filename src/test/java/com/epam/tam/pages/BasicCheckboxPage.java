package com.epam.tam.pages;

import com.epam.tam.utils.BasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicCheckboxPage extends BasePageObject {

    public BasicCheckboxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//label[text()='Option 1']/input")
    WebElement option1;

    @FindBy(xpath = "//label[text()='Option 2']/input")
    WebElement option2;

    @FindBy(xpath = "//label[text()='Option 3']/input")
    WebElement option3;

    @FindBy(xpath = "//label[text()='Option 4']/input")
    WebElement option4;

    @FindBy(id = "check1")
    WebElement checkUncheckButton;

    public void checkOption1() { option1.click(); }
    public void checkOption2() { option2.click(); }
    public void checkOption3() { option3.click(); }
    public void checkOption4() { option4.click(); }

    public boolean isOption1Checked() { return option1.isSelected(); }
    public boolean isOption2Checked() { return option2.isSelected(); }
    public boolean isOption3Checked() { return option3.isSelected(); }
    public boolean isOption4Checked() { return option4.isSelected(); }

    public String getCheckUncheckText() { return checkUncheckButton.getAttribute("value"); }
}
