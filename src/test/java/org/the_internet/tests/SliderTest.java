package org.the_internet.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.the_internet.pages.HomePage;
import org.the_internet.pages.SliderPage;

public class SliderTest extends TestBase {

    @BeforeMethod

    public void precondition() {
        new HomePage(driver).getHorizontalSlider();

    }

    @Test
    public void horizontalSliderTest() {

        new SliderPage(driver).shiftSliderX().verifySliderValue("5");
    }
}
