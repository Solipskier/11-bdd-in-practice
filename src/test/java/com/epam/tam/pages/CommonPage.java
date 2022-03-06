package com.epam.tam.pages;

import com.epam.tam.hooks.Hooks;
import com.epam.tam.utils.BasePageObject;
import org.openqa.selenium.WebDriver;

public class CommonPage extends BasePageObject {
    public CommonPage(WebDriver driver) {
        super(driver);
    }

    public void openPage(String url) {
        Hooks.getDriver().get(url);
    }

}
