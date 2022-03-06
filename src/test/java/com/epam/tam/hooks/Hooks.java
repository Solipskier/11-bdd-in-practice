package com.epam.tam.hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hooks {
    private static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
