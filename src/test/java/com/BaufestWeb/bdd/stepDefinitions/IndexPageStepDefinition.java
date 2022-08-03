package com.BaufestWeb.bdd.stepDefinitions;

import com.BaufestWeb.bdd.pages.IndexPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

public class IndexPageStepDefinition extends StepDefinition {

    public IndexPageStepDefinition() {
        indexPage = new IndexPage(driver);
    }

    @When("^usuario presiona el boton signup$")
    public void usuarioPresionaElBotonSignup() throws InterruptedException {
        indexPage.clickSigninButton();

        indexPage.verifyvisibilitySiginmodal();
        stepPass("Modal de registro es visible!");
    }

    @And("^usuario ingresa el user \"([^\"]*)\" y contraseña \"([^\"]*)\" y presiona el boton registrar$")
    public void usuarioIngresaElUserYContraseñaYPresionaElBotonRegistrar(String usuario, String contraseña) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        indexPage.registrarUsuario(usuario, contraseña);
    }

    @Then("^Usuario verifica mensaje de confirmacion de registro \"([^\"]*)\"$")
    public void usuarioVerificaMensajeDeConfirmacionDeRegistro(String expectedMsg) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String actualMsg = indexPage.retornaMensajeAlerta();
        if (actualMsg.equals(expectedMsg)) {
            stepPass(expectedMsg + " mensaje es visible en la alerta");
            indexPage.clickOkAlerta();
        } else {
            stepFail("Mensaje Esperado : " + expectedMsg + "Mensaje Actual : " + actualMsg);
        }
    }

    @Then("^Usuario verifica mensaje de alerta de usuario existente \"([^\"]*)\"$")
    public void usuarioVerificaMensajeDeAlertaDeUsuarioExistente(String expectedMsg) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String actualMsg = indexPage.retornaMensajeAlerta();
        if (actualMsg.equals(expectedMsg)) {
            stepPass(expectedMsg + " mensaje es visible en la alerta");
            indexPage.clickOkAlerta();
        } else {
            stepFail("Mensaje Esperado : " + expectedMsg + "Mensaje Actual : " + actualMsg);
        }
    }

}
