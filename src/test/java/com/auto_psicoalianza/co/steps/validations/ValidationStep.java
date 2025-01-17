package com.auto_psicoalianza.co.steps.validations;

import com.auto_psicoalianza.co.pages.validations.ValidationPage;
import net.thucydides.core.annotations.Step;


public class ValidationStep extends ValidationPage {

    @Step("Validar visualizacion del modulo de productos")
    public Boolean titleVisible() {
        return lbl_welcome.isDisplayed();
    }

    @Step("Validar visualizacion del mensaje de error")
    public Boolean errorIsDisplayed(){
        return lbl_errorMessage.isDisplayed();
    }
}
