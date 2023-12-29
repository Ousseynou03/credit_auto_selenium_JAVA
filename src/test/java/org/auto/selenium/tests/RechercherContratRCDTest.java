package org.auto.selenium.tests;

import org.auto.selenium.pages.AuthentificationPage;
import org.auto.selenium.pages.HomePage;
import org.auto.selenium.pages.PageAccueilRCD;
import org.testng.annotations.Test;

import java.io.IOException;

public class RechercherContratRCDTest extends BaseTest{

    @Test
    public void testRechercherContratRCD() throws InterruptedException, IOException {
        test = extent.createTest("Search Contrat", "Rechercher Contrat en tant que RCD");
        HomePage homePage = new HomePage(driver);
        AuthentificationPage authentificationPage = new AuthentificationPage(driver);
        PageAccueilRCD pageAccueilRCD = new PageAccueilRCD(driver);
        homePage.accesCreditAuto();
        authentificationPage.usernameRCD();
        authentificationPage.passwordRDC();
        authentificationPage.clickButtonConnexion();
        pageAccueilRCD.verifyConnectRCD();
        pageAccueilRCD.rechercheContrat();
        pageAccueilRCD.saisirNom();
        pageAccueilRCD.saisirPrenom();
        pageAccueilRCD.clickRechercher();
        pageAccueilRCD.verifierNumContrat();
        captureScreenshot(driver, "Rechercher Contrat");

    }
}
