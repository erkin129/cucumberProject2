package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement continueButton;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    public void putUsername(String email){
        this.email.sendKeys(email);
        continueButton.click();
    }
    public void putPassword(String password){
        this.password.sendKeys(password);
        loginButton.click();
    }
}
