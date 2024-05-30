package com.bdd.web.stepdefinition;

import com.bdd.web.step.LoginStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefintion {

    LoginStep loginStep = new LoginStep();

    @Given("^De que ingreso a la pagina \"([^\"]*)\"$")
    public void DeQueIngresoALaPagina(String IDTest) throws Throwable {
        loginStep.DeQueIngresoALaPagina(IDTest);
        System.out.println("fin given");
    }
    @And("^No tengo una cuenta registrada$")
    public void NoTengoUnaCuentaRegistrada() throws Throwable {
        System.out.println("fin and");
    }
    @When("^Selecciono el boton register$")
    public void seleccionoElBotonRegistrar() throws Throwable {
        loginStep.seleccionoElBotonRegistrar();
    }
    @And("^Ingreso los datos en el formulario \"([^\"]*)\"$")
    public void IngresoLosDatosEnElFormulario(String IDTest) throws Throwable {
        loginStep.ingresarFirstName(IDTest);
        loginStep.ingresarLastName(IDTest);
        loginStep.ingresarAddress(IDTest);
        loginStep.ingresarCity(IDTest);
        loginStep.ingresarState(IDTest);
        loginStep.ingresarZipCode(IDTest);
        loginStep.ingresarPhone(IDTest);
        loginStep.ingresarSsn(IDTest);
        loginStep.ingresarUsername(IDTest);
        loginStep.ingresarPassword(IDTest);
        loginStep.ingresarConform(IDTest);
    }
    @And("^Selecciono el boton Register$")
    public void seleccionoElBotonRegister() throws Throwable {
        loginStep.seleccionoElBotonRegister();
    }
    @Then("^Validamos el mensaje$")
    public void validamoselMensaje() throws Throwable {
        loginStep.validamoselMensaje();
    }
    /*-----------------------------------*/
    @And("^Tengo una cuenta registrada$")
    public void TengoUnaCuentaRegistrada() throws Throwable {
        System.out.println("fin AND");
    }
    @When("^Ingreso mi usuario y contranseña \"([^\"]*)\"$")
    public void IngresoMiUsuarioyContranseña(String IDTest) throws Throwable {
        loginStep.ingresarUsername2(IDTest);
        loginStep.ingresarPassword2(IDTest);
    }
    @And("^Selecciono el boton ingresar$")
    public void SeleccionoElBotonIngresar() throws Throwable {
        loginStep.SeleccionoElBotonIngresar();
    }
    @Then("^Validamos la pantalla de inicio$")
    public void ValidamosLaPantallaDeInicio() throws Throwable {
        loginStep.ValidamosLaPantallaDeInicio();
    }


}