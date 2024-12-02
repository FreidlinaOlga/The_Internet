package org.the_internet.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.the_internet.pages.AlertsPage;
import org.the_internet.pages.HomePage;

public class AlertsTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getJSAlerts();
    }

    @Test
    public void clickForJsAlertTest() {
        new AlertsPage(driver).jsAlert();

    }

    @Test
    public void clickForJsConfirmTest() {
        new AlertsPage(driver).selectResult("Ok").verifyResult("Ok");
    }


    @Test
    public void clickForJsPromptTest() {
        new AlertsPage(driver).sendMessageToAlert("It's Sunday!").verifyMessage("It's Sunday!");

    }
}
