package com.epam.tam.pages;

import com.epam.tam.utils.BasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BasicSelectDropDownPage extends BasePageObject {

    public BasicSelectDropDownPage(WebDriver driver) { super(driver); }

    @FindBy(css = "select#select-demo")
    WebElement selectDayDropDown;

    @FindBy(css = "p.selected-value")
    WebElement selectedDayMsg;


    public void selectDay(String day) {
        Select select = new Select(selectDayDropDown);
        select.selectByVisibleText(day);
    }

    public String getSelectedDay(){
        Select select = new Select(selectDayDropDown);
        return select.getFirstSelectedOption().getText();
    }

    public String getSelectedDayMsg(){
        return selectedDayMsg.getText();
    }
}
