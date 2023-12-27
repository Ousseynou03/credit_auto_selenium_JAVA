package org.auto.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthentificationPage {

    // Variables

    private static WebDriver driver;

    private static String chpUsername = "username";
    private static String chpPassword = "password";

    private static String chpConnexion = "/html/body/div[2]/div/div/form/fieldset/button";
    private static String chpInvalidIdentifiant = "/html/body/div[2]/div/div/div";



    // Username & Password Responsable Credit
    private static String usernameRCD = "rcd";
    private static String passwordRCD = "acial!rcd2018";

    // Username & Password LOUEUR
    private static String usernameLoueur = "lcd";
    private static String passwordLoueur = "acial!acd2018";

    // Username & Password GESTIONNAIRE DE CREDIT
    private static String usernameGCredit = "gcd";
    private static String passwordGcredit = "acial!gcd2018";

    // Username & Password ADMINISTRATION CREDIT AUTO
    private static String usernameACreditAuto = "acd";
    private static String passwordACreditAuto = "acial!acd2018";




    // Fin variable

    public AuthentificationPage(WebDriver driver) {
        AuthentificationPage.driver = driver;
    }

    // Cliquer sur le bouton Connexion
    public void clickButtonConnexion(){
        driver.findElement(By.xpath(chpConnexion)).click();
    }

    // Renseigner le username RCD
    public void usernameRCD() throws InterruptedException {
        driver.findElement(By.id(chpUsername)).sendKeys(usernameRCD);
        Thread.sleep(2000);
    }

    //Renseigner le password RDC
    public void passwordRDC () throws InterruptedException {
        driver.findElement(By.id(chpPassword)).sendKeys(passwordRCD);
        Thread.sleep(2000);
    }

    // Renseigner le username LOUEUR
    public void usernameLoueur() throws InterruptedException {
        driver.findElement(By.id(chpUsername)).sendKeys(usernameLoueur);
        Thread.sleep(2000);
    }

    // Renseigner le password Loueur
    public void passwordLoueur() throws InterruptedException {
        driver.findElement(By.id(chpPassword)).sendKeys(passwordLoueur);
        Thread.sleep(2000);
    }

    // Renseigner Username & Password GESTIONNAIRE DE CREDIT
    public void usernameGCredit() throws InterruptedException {
        driver.findElement(By.id(chpUsername)).sendKeys(usernameGCredit);
        Thread.sleep(2000);
    }

    public void passwordGCredit() throws InterruptedException {
        driver.findElement(By.id(chpPassword)).sendKeys(passwordGcredit);
        Thread.sleep(2000);
    }

    // Renseigner Username & Password ADMINISTRATION CREDIT AUTO
    public void usernameACreditAuto() throws InterruptedException {
        driver.findElement(By.id(chpUsername)).sendKeys(usernameACreditAuto);
        Thread.sleep(2000);
    }

    public void passwordACreditAuto() throws InterruptedException {
        driver.findElement(By.id(chpPassword)).sendKeys(passwordACreditAuto);
        Thread.sleep(2000);
    }


    // Renseigner Username & Password Responsable Credit incorrectes
    public void incorrectUsernameRCD() throws InterruptedException {
        driver.findElement(By.id(chpUsername)).sendKeys("rcdd");
        Thread.sleep(2000);
    }

    public void incorrectPasswordRDC () throws InterruptedException {
        driver.findElement(By.id(chpPassword)).sendKeys("acial!rcd2019");
        Thread.sleep(2000);
    }

    // Vérification message d'erreur aprés erreur de connexion
    public void messageErreur() throws InterruptedException {
        WebElement errorMessageElement = driver.findElement(By.xpath(chpInvalidIdentifiant));
        // Assurez-vous que le message d'erreur est présent sur la page
        assert errorMessageElement.isDisplayed(): "Le message d'erreur 'Identifiants invalides' n'est pas présent sur la page.";
        // Vous pouvez également récupérer le texte du message d'erreur si nécessaire
        String errorMessageText = errorMessageElement.getText();
        errorMessageText.equals("Identifiants invalides");

        assert errorMessageText.contains("Identifiants invalides"): "Le texte du message d'erreur ne correspond pas à 'Identifiants invalides'.";
        System.out.println("Message d'erreur : " + errorMessageText);
        Thread.sleep(2000);
    }




}
