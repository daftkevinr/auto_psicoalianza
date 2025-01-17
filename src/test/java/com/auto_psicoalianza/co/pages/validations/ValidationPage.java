package com.auto_psicoalianza.co.pages.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationPage extends PageObject {

    @FindBy(xpath = "//p[normalize-space()='Bienvenido']")
    protected WebElementFacade lbl_welcome;

    @FindBy(xpath = "//div[@role='alert']")
    protected WebElementFacade lbl_errorMessage;
}
