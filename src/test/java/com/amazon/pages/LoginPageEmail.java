package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageEmail {

    public LoginPageEmail(){
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(id = "ap_email")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement continueButton;

    @FindBy(id = "signInSubmit")
    public WebElement loginButton;

    @FindBy(id = "ap_password")
    public WebElement password;

    public void putUsername(String email){
        this.emailBox.sendKeys(email);
        continueButton.click();
    }
    public void putPassword(String password){
        this.password.sendKeys(password);

    }

    public void clickSignIn() {
        loginButton.click();
    }
}
