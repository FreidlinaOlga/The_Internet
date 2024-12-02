package org.the_internet.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.the_internet.pages.DropdownPage;
import org.the_internet.pages.HomePage;

public class DropdownTest extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getDropdown();
    }

    @Test
    public void selectOptionTest() {
        new DropdownPage(driver).selectOption("Option 2")
                .verifyText();


    }


}
