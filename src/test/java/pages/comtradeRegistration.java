package pages;

import base.baseTest;
import base.baseTestComtrade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class comtradeRegistration extends baseTestComtrade {

    public comtradeRegistration() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy(id = "firstname")
    WebElement name;
    public @FindBy(id = "lastname")
    WebElement surname;
    public @FindBy(id = "email_address")
    WebElement email;
    public @FindBy(css = ".alert.alert-success")
    WebElement povratnaPoruka;


    public void inputNameIntoNameField(String searchData) {
        name.sendKeys("Dragoljub");
    }

    public void inputSurnameIntoSurnameField (String searchData) {
        surname.sendKeys("Boranijasevic");
    }

    public void inputEmailIntoEmailField (String searchData) {
        email.sendKeys("dragonijasevic@hotmail.yu");
    }

    public boolean verifyPorukaIsDisplayed() {
        return povratnaPoruka.isDisplayed();
    }


}
