package org.the_internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class AlertsPage extends BasePage {

    public AlertsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//button[contains(text(),'for JS Alert')]")
    WebElement forJsAlertButton;

    public AlertsPage jsAlert() {
        click(forJsAlertButton);
        driver.switchTo().alert().accept();
        return this;
    }

    @FindBy(xpath = "//button[contains(text(),'for JS Confirm')]")
    WebElement forJsConfirmButton;

    public AlertsPage selectResult(String result) {
        click(forJsConfirmButton);
        if (result != null && result.equals("Ok")) {
            driver.switchTo().alert().accept();
        } else if (result != null && result.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(xpath = "//p[@id='result']")
    WebElement resultElement;

    public AlertsPage verifyResult(String text) {
        Assert.assertTrue(resultElement.getText().contains(text));
        return this;
    }

    @FindBy(xpath = "//button[contains(text(),'for JS Prompt')]")
    WebElement forJsPromptButton;

    public AlertsPage sendMessageToAlert(String message) {
        click(forJsPromptButton);
        if (message != null) {
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }

    @FindBy(xpath = "//p[@id='result']")
    WebElement result;

    public AlertsPage verifyMessage(String text) {
        Assert.assertTrue(result.getText().contains(text));
        return this;
    }
}
