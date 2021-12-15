package pages;

import base.baseKatalon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class katalonMyAccount extends baseKatalon {
    public katalonMyAccount() { PageFactory.initElements(driver, this); }

    public @FindBy(id = "username")
    WebElement UsernameField;

    public @FindBy(id = "password")
    WebElement PasswordField;

    public @FindBy(name = "login")
    WebElement LogInButton;

    public @FindBy(className = "woocommerce-error")
    WebElement ErrorLogIn;

    public @FindBy(className = "woocommerce-MyAccount-content")
    WebElement SuccessfulLogIn;

    public void clearUsername() {UsernameField.clear();}
    public void clearPassword() {PasswordField.clear();}
    public void inputUsername(String UsernameInput) {UsernameField.sendKeys(UsernameInput);}
    public void inputPassword(String PasswordInput) {PasswordField.sendKeys(PasswordInput);}
    public void clickLogIn() {LogInButton.click();}
    public void errorMessage() {ErrorLogIn.isDisplayed();}
    public void successfulLogIn() {SuccessfulLogIn.isDisplayed();}



}
