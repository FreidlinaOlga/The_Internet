package org.the_internet.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.the_internet.pages.DragAndDropPage;
import org.the_internet.pages.HomePage;

public class DragAndDropTest extends TestBase{

    @BeforeMethod

    public void preconditions(){
        new HomePage(driver).getDragAndDrop();

    }

    @Test
    public void dragAndDropTest(){
            new DragAndDropPage(driver).actionDragMe()
                    .verifyDropped("A");
        }
    }

