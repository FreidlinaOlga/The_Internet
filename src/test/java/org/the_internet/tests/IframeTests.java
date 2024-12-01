package org.the_internet.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.the_internet.pages.FramePage;
import org.the_internet.pages.HomePage;

public class IframeTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getFrames();
    }

    @Test
    public void iframeTest() {
        new FramePage(driver).selectIframe()
                .switchToIframeById()
                .verifyIframeByText("Your content goes here.");


    }
}
