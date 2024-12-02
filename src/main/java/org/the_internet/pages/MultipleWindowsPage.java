package org.the_internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class MultipleWindowsPage extends BasePage {

    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/windows/new']")
    WebElement newWindowButton;

    public MultipleWindowsPage switchToClickHere(int index) {
        click(newWindowButton);
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(index));
        return this;
    }

    @FindBy(className = "example")
    WebElement example;

    public MultipleWindowsPage verifyByNewWindowTitle(String text) {
        Assert.assertTrue(shouldHaveText(example, text, 3));
        return this;
    }
}
