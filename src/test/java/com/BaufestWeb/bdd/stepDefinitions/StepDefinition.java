package com.BaufestWeb.bdd.stepDefinitions;

import com.BaufestWeb.bdd.pages.*;
import com.BaufestWeb.bdd.utils.ConfigManager;
import com.BaufestWeb.bdd.utils.TestBase;
import cucumber.api.Scenario;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class StepDefinition {

    static WebDriver driver;
    Scenario scenario;
    IndexPage indexPage;
    ConfigManager configManager = new ConfigManager();


    StepDefinition() {
        TestBase driverManager = new TestBase();
        try {
            if (StepDefinition.driver == null) {

                StepDefinition.driver = driverManager.getDriver(configManager.getProperty("browser"));
            }
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail("Fallo al iniciar el webdriver");
        }
    }

    static Logger logger;

    static {
        logger = Logger.getLogger(StepDefinition.class);
        PropertyConfigurator.configure("log4j.properties");
    }

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    void stepPass(String message) {
        System.out.println("PASS : " + message + "\n");
        Assert.assertTrue(message, true);
    }

    void stepFail(String message) {
        System.out.println("FAIL : " + message + "\n");
        Assert.fail(message);
    }
}
