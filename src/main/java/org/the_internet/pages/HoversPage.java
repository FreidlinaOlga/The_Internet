package org.the_internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HoversPage extends BasePage {
    public HoversPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "figure")
    WebElement figure;

    public HoversPage hoverToolTips() {

        new Actions(driver).moveToElement(figure).perform();
        return this;
    }

    @FindBy(tagName = "h5")
    WebElement hoverTitle;

    public HoversPage verifyToolTips(String value) {
        Assert.assertEquals(hoverTitle.getText(), value);
        return this;

    }
}
