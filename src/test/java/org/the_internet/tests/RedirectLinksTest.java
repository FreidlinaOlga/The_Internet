package org.the_internet.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.the_internet.pages.HomePage;
import org.the_internet.pages.RedirectLinksPage;

public class RedirectLinksTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getRedirectLinks();
        new RedirectLinksPage(driver).getRedirectTrigger();

    }

    @Test
    public void testRedirectLinks() {
        new RedirectLinksPage(driver).checkBrokenRedirectLinks();

    }
}
