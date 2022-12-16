package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchDetailsScreen;
import net.thucydides.core.annotations.Step;

public class SwagLabSearchSteps {

    LoginScreen loginScreen;
    SearchDetailsScreen searchDetailsScreen;

    @Step("Ingresar credenciales usuario {0} y password {0}")
    public void enterLogin(String user, String pass){
        loginScreen.enterUser(user);
        loginScreen.enterPass(pass);
        loginScreen.enterLogin();
    }

    @Step("Aparece el titulo PRODUCTS")
    public String getTitle(){
        return searchDetailsScreen.getTitle();
    }

    @Step("existe un item")
    public String getItem(){
        return searchDetailsScreen.getItem();
    }

}
