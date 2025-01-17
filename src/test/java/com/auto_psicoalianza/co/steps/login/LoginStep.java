package com.auto_psicoalianza.co.steps.login;

import com.auto_psicoalianza.co.pages.login.LoginPage;
import net.thucydides.core.annotations.Step;


public class LoginStep extends LoginPage {

    @Step("Ingresar email")
    public void typeemail(String email){
        txt_email.sendKeys(email);
    }

    @Step("Ingresar contraseña")
    public void typepassword(String password){
        txt_password.sendKeys(password);
    }

    @Step("Click en el boton login")
    public void clickLogin(){
        btn_login.click();
    }

    @Step("Click en el boton login")
    public void validateWelcome(){
        btn_login.click();
    }
}
