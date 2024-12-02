package org.the_internet.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.the_internet.pages.HomePage;
import org.the_internet.pages.MultipleWindowsPage;

public class MultipleWindowsTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getMultipleWindows();
    }

    @Test
    public void multipleWindowsTest() {
        new MultipleWindowsPage(driver)
                .switchToClickHere(1)
                .verifyByNewWindowTitle("New Window");
    }
}
