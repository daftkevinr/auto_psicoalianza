package com.auto_psicoalianza.co;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.auto_psicoalianza.co.definitions",
        tags = "@Login"

)
public class Runner {
}
