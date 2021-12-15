package pages;

import base.baseStore;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class storeHomepage extends baseStore {

    public storeHomepage() {
        PageFactory.initElements(driver,this);
    }

    public @FindBy(css = ".header_user_info")
    WebElement SignIn;

    public void clickSignIn() {SignIn.click();}

}
