package org.the_internet.tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.the_internet.pages.FileUploadPage;
import org.the_internet.pages.HomePage;


public class FileUploadTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getFileUpload();

    }

    @Test
    public void fileUploadTest() {
        new FileUploadPage(driver)
                .uploadFile("C:/QA/The_Internet/Снимок экрана 2024-10-31 151113.png")
                .submitTheUpload()
                .verifyFileUploaded("File Uploaded!");
    }
}
