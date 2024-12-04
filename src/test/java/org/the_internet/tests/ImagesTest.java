package org.the_internet.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.the_internet.pages.HomePage;
import org.the_internet.pages.ImagesPage;

public class ImagesTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getBrokenImages();

    }

    @Test
    public void testImages() {
        new ImagesPage(driver).checkBrokenImages();

    }
}
