package org.the_internet.tests;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.the_internet.pages.HomePage;
import org.the_internet.pages.HoversPage;

public class HoversTest extends TestBase {

    @BeforeMethod
    public void preconditions() {
        new HomePage(driver).getHovers();
    }

    @Test
    public void hoversTest() {
        new HoversPage(driver).hoverToolTips()
                .verifyToolTips("name: user1");
    }
}
