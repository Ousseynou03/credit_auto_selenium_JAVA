package org.auto.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    //Variables de la page d'accueil google
    public static WebDriver driver;

    private final String chpAccesCreditAuto = "lnkAccesCreditAuto";


    // Fin Variables

    public HomePage(WebDriver driver) {
        HomePage.driver = driver;
    }


    // Cliquer sur Acces Credit Auto

    public void accesCreditAuto() throws InterruptedException {
     //   driver.get("http://credit-auto.qsiconseil.ma/");
        driver.findElement(By.id(chpAccesCreditAuto)).click();
        Thread.sleep(3000);
    }




/*
    public void clickOusseynou() throws InterruptedException {
        driver.findElement(By.xpath(chpOsseynou)).click();
        Thread.sleep(2000);
    }
*/


}
