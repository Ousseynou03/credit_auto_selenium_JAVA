package org.auto.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageAccueilRCD {


    // Variables
    private static WebDriver driver;

    // champ mot clé rcd
    private static String chpRCD = "/html/body/nav/div/div[2]/i";

    // Champ de recherche de contrat
    private static String chpRechercheContrat = "lnkRechercherContrat";

    // Champ nom
    private static String chpNom = "nameClient";

    // Champ prenom
    private static String chpPrenom = "firstnameClient";

    // Champ bouton rechercher
    private static String btnRechercher = "clickSubmit";



    // Fin Variables

    public PageAccueilRCD(WebDriver driver) {
        this.driver = driver;
    }


    // Vérifier qu'on est bien connecté en tant que RCD
    public void verifyConnectRCD(){
        String motCleRCD = driver.findElement(By.xpath((chpRCD))).getText();
        motCleRCD.equals("rcd");
    }

    // Cliquer sur rechercher un contrat
    public void rechercheContrat(){
        driver.findElement(By.id(chpRechercheContrat)).click();
    }

    // Renseigner le nom du client
    public void saisirNom() throws InterruptedException {
        driver.findElement(By.id(chpNom)).sendKeys("BEN");
        Thread.sleep(2000);
    }

    // Renseigner le prenom du client
    public void saisirPrenom() throws InterruptedException {
        driver.findElement(By.id(chpPrenom)).sendKeys("Deaclan");
        Thread.sleep(2000);
    }

    // Cliquer sur le bouton rechercher
    public void clickRechercher(){
        driver.findElement(By.id(btnRechercher)).click();
    }

    // Vérifier si le numéro de Contrat n° 783465498 est présent pour le client Deaclan BEN
    public void verifierNumContrat(){
        WebElement numContrat = driver.findElement(By.className("text-center"));
        String texteContrat = numContrat.getText();
        if (texteContrat.equals("Contrat n° 783465498")) {
            System.out.println("Le contrat correspond.");
        } else {
            System.out.println("Le contrat ne correspond pas.");
        }

    }



}
