package com.auto_psicoalianza.co.pages.soporte;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SoportePage extends PageObject {

    @FindBy(xpath = "(//a[@class='col-12 btn no-visited list-primary'])[2]")
    protected WebElementFacade btn_soporte;

    @FindBy(xpath = "//button[contains(text(),'Crear soporte')]")
    protected WebElementFacade btn_addsoporte;

    @FindBy(className = "select2-selection__rendered")
    protected WebElementFacade select_empresa;

    @FindBy(className = "select2-search__field")
    protected  WebElementFacade txt_empresa;

    @FindBy(className = "select2-results__option select2-results__option--selectable select2-results__option--highlighted")
    protected  WebElementFacade find_empresa;

    @FindBy(id = "telefono_usuario")
    protected WebElementFacade txt_cel;

    @FindBy(id = "select2-tipo_prueba_id-container")
    protected WebElementFacade btn_producto;

}

