package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SwagLabSearchSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class SwagLabSearchStepsDefs {

    @Steps
    SwagLabSearchSteps swagLabSearchSteps;

    @Given("me encuentro en la pagina login de saucedemo")
    public void me_enuentro_en_la_pagina_login_de_saucedemo() {

    }
    @When("se inicia sesion con usuario: {} y password: {}")
    public void se_inicia_sesion_con_usuario_y_contraseña(String user, String pass) {
        swagLabSearchSteps.enterLogin(user,pass);
    }

    @Then("debe aparecer el titulo: {}")
    public void debe_aparecer_el_titulo(String text){
        Assert.assertEquals(swagLabSearchSteps.getTitle(), text);
    }

    @And("existe el item: {}")
    public void existe_un_item(String item){
        Assert.assertEquals(swagLabSearchSteps.getItem(), item);
    }

}
