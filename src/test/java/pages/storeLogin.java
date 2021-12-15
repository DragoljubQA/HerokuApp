package pages;

import base.baseStore;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class storeLogin extends baseStore {

    public storeLogin(){
        PageFactory.initElements(driver,this);
    }

    public @FindBy(name = "email_create")
    WebElement CreateEmail;

    public @FindBy(id = "SubmitCreate")
    WebElement ClickSignIn;

    public void clearEmail() {CreateEmail.clear();}
    public void inputEmail(String EmailInput) {CreateEmail.sendKeys(EmailInput);}
    public void signInButton() {ClickSignIn.click();}

}
