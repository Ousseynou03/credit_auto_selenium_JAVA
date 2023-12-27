package org.auto.selenium.tests;

import org.auto.selenium.pages.AuthentificationPage;
import org.auto.selenium.pages.HomePage;
import org.testng.annotations.Test;


import java.io.IOException;

public class AuthentificationPageTest extends BaseTest{


    // Authentification RCD
    @Test
    public void authentificationRCDTest() throws IOException, InterruptedException {
        test = extent.createTest("Connexion RCD", "Se Connecter en tant que RCD");
        HomePage homePage = new HomePage(driver);
        AuthentificationPage authentificationPage = new AuthentificationPage(driver);
        homePage.accesCreditAuto();
        authentificationPage.usernameRCD();
        authentificationPage.passwordRDC();
        authentificationPage.clickButtonConnexion();
        captureScreenshot(driver, "authRCD");
    }

    // Authentification LOUEUR
    @Test
    public void authentificationLoueurTest() throws IOException, InterruptedException {
       // test = extent.createTest("Connexion LOUEUR", "Se Connecter en tant que LOUEUR");
        HomePage homePage = new HomePage(driver);
        AuthentificationPage authentificationPage = new AuthentificationPage(driver);
        homePage.accesCreditAuto();
        authentificationPage.usernameLoueur();
        authentificationPage.passwordLoueur();
        authentificationPage.clickButtonConnexion();
        captureScreenshot(driver, "authLoueur");
    }

    // Authentification GESTIONNAIRE DE CREDIT
    @Test
    public void authentificationGCreditTest() throws IOException, InterruptedException {
        test = extent.createTest("Connexion GESTIONNAIRE DE CREDIT", "Se Connecter en tant que GESTIONNAIRE DE CREDIT");
        HomePage homePage = new HomePage(driver);
        AuthentificationPage authentificationPage = new AuthentificationPage(driver);
        homePage.accesCreditAuto();
        authentificationPage.usernameGCredit();
        authentificationPage.passwordGCredit();
        authentificationPage.clickButtonConnexion();
        captureScreenshot(driver, "auth Gestionnaire credit");
    }


    // Authentification ADMINISTRATION CREDIT AUTO
    @Test
    public void authentificationACreditAutoTest() throws IOException, InterruptedException {
        test = extent.createTest("Connexion ADMINISTRATION CREDIT AUTO", "Se Connecter en tant que ADMINISTRATION CREDIT AUTO");
        HomePage homePage = new HomePage(driver);
        AuthentificationPage authentificationPage = new AuthentificationPage(driver);
        homePage.accesCreditAuto();
        authentificationPage.usernameACreditAuto();
        authentificationPage.passwordACreditAuto();
        authentificationPage.clickButtonConnexion();
        captureScreenshot(driver, "authACreditAuto");
    }


    // Authentification incorrecte de Responsable Credit
    @Test
    public void incorrecteAuthentificationRCDTest() throws IOException , InterruptedException{
        test = extent.createTest("Connexion  Incorrecte RCD", "Se Connecter en tant que incorrecte RCD");
        HomePage homePage = new HomePage(driver);
        AuthentificationPage authentificationPage = new AuthentificationPage(driver);
        homePage.accesCreditAuto();
        authentificationPage.incorrectUsernameRCD();
        authentificationPage.incorrectPasswordRDC();
        authentificationPage.clickButtonConnexion();
        authentificationPage.messageErreur();
        captureScreenshot(driver, "auth incorrect rcd");
    }


}
