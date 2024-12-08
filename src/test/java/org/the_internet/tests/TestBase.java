package org.the_internet.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.the_internet.pages.ApplicationManager;

public class TestBase {

    protected ApplicationManager app = new ApplicationManager(System.getProperty("browser", "chrome"));
    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = app.startTest();
    }

    @AfterMethod(enabled = true)
    public void tearDown() {
        app.stopTest();
    }

}
