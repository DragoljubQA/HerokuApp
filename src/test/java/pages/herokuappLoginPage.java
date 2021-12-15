package pages;

import base.baseHerokuapp;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class herokuappLoginPage extends baseHerokuapp {

    public herokuappLoginPage(){
        PageFactory.initElements(driver, this);
    }

    public @FindBy(id = "username")
    WebElement Username;

    public @FindBy(id = "password")
    WebElement Password;

    public @FindBy(css = ".fa.fa-2x.fa-sign-in")
    WebElement Button;

    public @FindBy(css = ".flash.error")
    WebElement InvalidNotification;

    public @FindBy(css = ".flash.success")
    WebElement ValidNotification;

    public @FindBy(css = ".close")
    WebElement CloseNotification1;

    public @FindBy(xpath = "//label[@for='username']")
    WebElement UsernameTitle;

    public @FindBy(xpath = "//label[@for='password']")
    WebElement PasswordTitle;

    public @FindBy(css = ".fa.fa-2x.fa-sign-in")
    WebElement LoginTitle;

    public @FindBy(id = "flash")
    WebElement Flash;

    public void clickLogin() {
        Button.click();
    }
    public void clearUsername() {Username.clear();}
    public void clearPassword() {Password.clear();}
    public void insertUsername(String usernameData) {Username.sendKeys(usernameData);}
    public void insertPassword(String passwordData) {Password.sendKeys(passwordData);}
    public boolean invalidNotification() {return InvalidNotification.isDisplayed();}
    public boolean validNotification() {return ValidNotification.isDisplayed();}
    public void closeNotificationLogin() {CloseNotification1.click();}
    public String usernameTitle() {
        return UsernameTitle.getText();
    }
    public String passwordTitle() {return PasswordTitle.getText();}
    public String loginTitle() {return LoginTitle.getText();}
    public boolean flash() {return false;}


}
