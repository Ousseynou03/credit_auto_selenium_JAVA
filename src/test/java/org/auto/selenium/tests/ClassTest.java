package org.auto.selenium.tests;


import org.auto.selenium.pages.HomePage;
import org.testng.annotations.Test;

import java.io.IOException;


public class ClassTest extends BaseTest{


    // Méthode de test

    @Test
    public void testAccesCreditAuto() throws IOException, InterruptedException {
        test = extent.createTest("Accéder Credit Auto", "Cliquer sur Accés Credit Auto");
        HomePage homePage = new HomePage(driver);
        homePage.accesCreditAuto();
        captureScreenshot(driver, "Acceuil");
    }









}
