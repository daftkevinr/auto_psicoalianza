package com.auto_psicoalianza.co.steps.soporte;


import com.auto_psicoalianza.co.pages.soporte.SoportePage;
import net.thucydides.core.annotations.Step;

public class SoporteStep extends SoportePage {

    @Step("Dar Click en boton soporte")
    public void clickOptionSoporte() {
        btn_soporte.click();
    }

    @Step("Dar Click en Crear Soporte")
    public void clickAddSoporte() {
        btn_addsoporte.click();
    }

    @Step("Seleccionar empresa")
    public void clickSelectEmpresa() {
        select_empresa.click();
    }

    @Step("Escribir empresa")
    public void clickTypeEmpresa(String empresa) {
        txt_empresa.sendKeys(empresa);
    }

    @Step("Seleccionar resultado empresa")
    public void clickFindEmpresa() {
        find_empresa.click();
    }

    @Step("Escribir numero de celular")
    public void clickTypeCelular(String celular) {
        txt_cel.sendKeys(celular);
    }

    @Step("Seleccionar boton producto")
    public void clickBtnProducto() {
        btn_producto.click();
    }
}
