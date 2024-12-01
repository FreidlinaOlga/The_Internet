package org.the_internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[.='Available Examples']")
    WebElement examples;

    @FindBy(xpath = "//a[contains(text(),'JavaScript Alerts')]")
    WebElement alerts;

    public AlertsPage getJSAlerts() {
        click(alerts);
        return new AlertsPage(driver);
    }

    @FindBy(css = "[href='/frames']")
    WebElement frames;

    public FramePage getFrames() {
        click(frames);
        return new FramePage(driver);
    }
}
