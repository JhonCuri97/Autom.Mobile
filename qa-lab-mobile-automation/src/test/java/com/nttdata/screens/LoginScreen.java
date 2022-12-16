package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginScreen extends PageObject {

    @AndroidFindBy(xpath= "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement userInput;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement passInput;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement loginButton;

    public void enterUser(String user){
        getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        userInput.click();
        userInput.sendKeys(user);
    }

    public void enterPass(String pass){
        passInput.click();
        passInput.sendKeys(pass);
    }

    public void enterLogin(){
        loginButton.click();
    }
}
