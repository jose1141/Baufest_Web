package com.BaufestWeb.bdd.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.IOException;

public class TestBase {
    public  static WebDriver driver;

    public WebDriver getDriver(String browser) throws IOException {

        System.out.println("El valor del browser es: " + browser);

        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equals("safari")) {
            driver = new SafariDriver();
        } else {
            System.out.println("Por favor ingrese correctamente el browser: " + browser);
        }

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        return driver;
    }
}
