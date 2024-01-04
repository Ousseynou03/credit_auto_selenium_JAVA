package org.auto.selenium.tests;

import org.auto.selenium.pages.AuthentificationPage;
import org.auto.selenium.pages.HomePage;
import org.testng.annotations.Test;

public class CreationContratGCDTest extends BaseTest {

    @Test
    public void testCreationContratGCD(){
        test = extent.createTest("Creation Contrat", "Creation Contrat en tant que GCD");
        HomePage homePage = new HomePage(driver);
        AuthentificationPage authentificationPage = new AuthentificationPage(driver);

    }
}
