package pages;

import base.baseHerokuappDDT;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class herokuappLogoutPageDDT extends baseHerokuappDDT {

    public herokuappLogoutPageDDT() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy(css = ".flash.success")
    WebElement SuccessfulLogin;

    public @FindBy(css = ".icon-2x.icon-signout")
    WebElement SignOutButton;

    public @FindBy(css = ".close")
    WebElement CloseNotification2;

    public @FindBy(id = "flash")
    WebElement Flash;

    public boolean successLogin() {return SuccessfulLogin.isDisplayed();}
    public void clickSignOut() {SignOutButton.click();}
    public void closeNotificationLogout() {CloseNotification2.click();}
    public boolean flash() {return false;}
    public String jedan() {return SuccessfulLogin.getText();}
    public String dva() {return "You logged into a secure area!\n" +
            "×";}


}
