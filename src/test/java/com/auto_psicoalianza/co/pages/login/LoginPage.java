package com.auto_psicoalianza.co.pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(id = "email")
    protected WebElementFacade txt_email;


    @FindBy(id = "password")
    protected WebElementFacade txt_password;

    @FindBy(xpath = "(//button[normalize-space()='Iniciar sesión'])[1]")
    protected WebElementFacade btn_login;
    }

