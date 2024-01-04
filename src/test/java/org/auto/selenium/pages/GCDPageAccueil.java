package org.auto.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GCDPageAccueil {

    // Variables
    private final WebDriver driver;
    private static String chpCredit = "lnkCredit";
    private static String chpCreationContrat = "lnkCreerContrat";

    private static String chpVerificationMotCeationContrat = "text-center";
    private static String chpMontantAchat = "form_simulation_montantAchat";
    private static String chpMontantCredit = "form_simulation_montantCredit";
    private static String chpDuree = "form_simulation_duree";


    // Fin Variables

    public GCDPageAccueil(WebDriver driver) {
        this.driver = driver;
    }


    // cliquer sur Credit
    public void clickCredit() throws InterruptedException {
        driver.findElement(By.id(chpCredit)).click();
        Thread.sleep(1000);
    }

    // Choisir Créer contrat de crédit auto
    public void checkCreeContrat() throws InterruptedException {
        driver.findElement(By.id(chpCreationContrat)).click();
        WebElement txtCreationContrat = driver.findElement(By.className(chpVerificationMotCeationContrat));
        String msgVerify = txtCreationContrat.getText();
        msgVerify.equals("Création d'un contrat de crédit");
        Thread.sleep(2000);
    }




}
