package org.the_internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RedirectLinksPage extends BasePage {
    public RedirectLinksPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "redirect")
    WebElement redirect;

    public RedirectLinksPage getRedirectTrigger() {
        click(redirect);
        return this;
    }

    @FindBy(css = "a")
    List<WebElement> links;

    public RedirectLinksPage checkBrokenRedirectLinks() {
        for (int i = 0; i < links.size(); i++) {
            WebElement element = links.get(i);
            String url = element.getDomAttribute("href");
            verifyLinks(url);
        }
        return this;
    }
}
