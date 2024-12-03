package org.the_internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SliderPage extends BasePage {
    public SliderPage(WebDriver driver) {
        super(driver);


    }

    @FindBy(tagName = "input")
    WebElement sliderInput;

    public SliderPage shiftSliderX() {
        pause(1000);
        new Actions(driver).dragAndDropBy(sliderInput, 60, 0).perform();
        return this;
    }


    @FindBy(id = "range")
    WebElement range;

    public void verifySliderValue(String text) {
        Assert.assertTrue(shouldHaveText(range, text, 5));

    }
}
