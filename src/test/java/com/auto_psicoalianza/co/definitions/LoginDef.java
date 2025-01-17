package com.auto_psicoalianza.co.definitions;

import com.auto_psicoalianza.co.steps.login.LoginStep;
import com.auto_psicoalianza.co.steps.soporte.SoporteStep;
import com.auto_psicoalianza.co.steps.validations.ValidationStep;
import com.auto_psicoalianza.co.uttilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginDef {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationStep validate;

    @Given("el usuario navega al sitio web")
    public void userNavigateTo(){
        url.navigateTo("https://v2.psicoalianza.com/login");
    }

    @When("ingresa credenciales validas")
    public void userLoginWithValidCredentials(){
        login.typeemail("14251103");
        login.typepassword("123456789$$");
        login.clickLogin();
    }

    @Then("la aplicacion deberia mostrar el panel principal")
    public void systemShowPanel(){
        Assert.assertTrue(validate.titleVisible());
    }

    @When("ingresa credenciales invalidas")
    public void userLoginWithInvalidCredentials(){
        login.typeemail("14251103");
        login.typepassword("1234548895");
        login.clickLogin();
    }

    @Then("la aplicacion deberia mostrar un mensaje de error")
    public void systemErrorLogin(){
        Assert.assertTrue(validate.errorIsDisplayed());
    }

}
