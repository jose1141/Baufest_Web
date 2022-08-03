package com.BaufestWeb.bdd.pages;

import com.BaufestWeb.bdd.utils.Common;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage {

    private WebDriver driver;

    private Alert alerta;
    public IndexPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "signin2")
    private WebElement btnSignup;

    @FindBy(id = "signInModalLabel")
    private WebElement signInModalLabel;

    @FindBy(id = "sign-username")
    private WebElement txtUsuario;

    @FindBy(id = "sign-password")
    private WebElement txtContraseña;

    @FindBy(xpath = "//button[contains(text(),'Sign up')]")
    private WebElement btnRegistrar;




    public void clickSigninButton() {
        btnSignup.click();
    }

    public void verifyvisibilitySiginmodal() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("signInModalLabel"))));
    }

    public void registrarUsuario(String usuario, String contraseña) {
        Common.setText(txtUsuario, usuario);
        Common.setText(txtContraseña, contraseña);
        btnRegistrar.click();
    }

    public String retornaMensajeAlerta() {
        if (alerta == null) {
            WebDriverWait wait = new WebDriverWait(driver, 2);
            wait.until(ExpectedConditions.alertIsPresent());
            alerta = driver.switchTo().alert();
        }
        return  alerta.getText();
    }

    public void clickOkAlerta() throws InterruptedException {
        if (alerta == null) {
            WebDriverWait wait = new WebDriverWait(driver, 2);
            wait.until(ExpectedConditions.alertIsPresent());
            alerta = driver.switchTo().alert();
        }
        alerta.accept();

    }
}
