package org.auto.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthentificationPage {

    // Variables

    private final WebDriver driver;

    private static String chpUsername = "username";
    private static String chpPassword = "password";


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
        this.driver = driver;
    }

    // Renseigner le username RCD
    public void usernameRCD(){
        driver.findElement(By.id(chpUsername)).sendKeys(usernameRCD);
    }

    //Renseigner le password RDC
    public void passwordRDC (){
        driver.findElement(By.id(chpPassword)).sendKeys(passwordRCD);
    }




}
