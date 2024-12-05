package org.the_internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FileUploadPage extends BasePage {
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "file-upload")
    WebElement fileUpload;

    public FileUploadPage uploadFile(String path) {
        fileUpload.sendKeys(path);
        return this;
    }

    @FindBy(id = "file-submit")
    WebElement submit;

    public FileUploadPage submitTheUpload() {
        click(submit);
        return this;
    }

    @FindBy(css = "h3")
    WebElement uploaded;

    public FileUploadPage verifyFileUploaded(String text) {
        Assert.assertTrue(shouldHaveText(uploaded, text, 5));
        return this;
    }
}
