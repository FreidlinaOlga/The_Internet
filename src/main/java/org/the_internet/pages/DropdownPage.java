package org.the_internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownPage extends BasePage {

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement dropdown;

    public DropdownPage selectOption(String text) {
        Select select = new Select(dropdown);
        select.selectByVisibleText(text);
        return this;
    }

    public DropdownPage verifyText() {
        String firstSelectedOption = new Select(dropdown).getFirstSelectedOption().getText();
        Assert.assertTrue(shouldHaveText(dropdown, firstSelectedOption, 5));
        return this;
    }
}
