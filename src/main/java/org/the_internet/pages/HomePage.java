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

    @FindBy(css = "[href='/windows']")
    WebElement multipleWindows;

    public MultipleWindowsPage getMultipleWindows() {
        click(multipleWindows);
        return new MultipleWindowsPage(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Dropdown')]")
    WebElement dropdown;

    public DropdownPage getDropdown() {
        click(dropdown);
        return new DropdownPage(driver);
    }

    @FindBy(css = "[href='/horizontal_slider']")
    WebElement horizontalSlider;

    public SliderPage getHorizontalSlider() {
        click(horizontalSlider);
        return new SliderPage(driver);
    }

    @FindBy(css = "[href='/drag_and_drop']")
    WebElement dragAndDrop;

    public DragAndDropPage getDragAndDrop() {
        click(dragAndDrop);
        return new DragAndDropPage(driver);
    }

    @FindBy(css = "[href='/hovers']")
    WebElement hovers;

    public HoversPage getHovers() {
        click(hovers);
        return new HoversPage(driver);
    }

    @FindBy(css = "[href='/broken_images']")
    WebElement brokenImages;

    public ImagesPage getBrokenImages() {
        click(brokenImages);
        return new ImagesPage(driver);
    }

    @FindBy(css = "[href='/redirector']")
    WebElement redirector;

    public RedirectLinksPage getRedirectLinks() {
        click(redirector);
        return new RedirectLinksPage(driver);
    }

    @FindBy(css = "[href='/upload']")
    WebElement upload;

    public FileUploadPage getFileUpload() {
        click(upload);
        return new FileUploadPage(driver);
    }
}
