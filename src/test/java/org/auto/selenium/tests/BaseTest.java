package org.auto.selenium.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

public class BaseTest {

    //Variables

    public static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest test;



    //Fin Variables


    @BeforeMethod
    public void setup() {
        // Initialisation du rapport ExtentReports
        extent = new ExtentReports();

        try {
            // Configuration du journal log4j
            PropertyConfigurator.configure("log4j.properties");

            // Configuration du rapport HTML avec ExtentSparkReporter
         //   ExtentSparkReporter spark = new ExtentSparkReporter("Results/rapport.html");
            ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir").concat("/Results/").concat("reports").concat(".html"));

            extent.attachReporter(spark);

            // Initialisation du navigateur Firefox
            driver = new FirefoxDriver();
            driver.get("http://credit-auto.qsiconseil.ma/");
            driver.manage().window().maximize();
        } catch (Exception e) {
            // Gestion de l'exception : enregistrez dans le rapport et propagez l'exception
            test = extent.createTest("Setup Error", "Erreur lors de la configuration");
            test.log(Status.FAIL, e.getMessage());
            throw new RuntimeException("Erreur lors de la configuration", e);
        }
    }



    public void captureScreenshot(WebDriver driver, String testName) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destionationFile = new File(System.getProperty("user.dir").concat("/screenshots/").concat(testName).concat(".png"));
        FileUtils.copyFile(sourceFile, destionationFile);
        System.out.println("***** Screenshot taken *****");

    }

    @AfterMethod
    public void tearDownTest() throws InterruptedException {
        Thread.sleep(2);
        // Fermeture du navigateur
        driver.close();

        // Enregistrement d'un message de log dans le rapport
        test.log(Status.INFO, "Navigateur fermé");

        // Génération du rapport
        extent.flush();
    }
}
