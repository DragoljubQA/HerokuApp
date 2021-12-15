package pages;

import base.baseStore;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.Keys.ENTER;

public class storeRegistration extends baseStore {

    public storeRegistration() {
        PageFactory.initElements(driver,this);
    }

    public @FindBy(id = "customer_firstname")
    WebElement FirstName;
    public @FindBy(id = "customer_lastname")
    WebElement LastName;
    public @FindBy(id = "passwd")
    WebElement Password;
    public @FindBy(id = "address1")
    WebElement Address;
    public @FindBy(id = "city")
    WebElement City;
    public @FindBy(id = "id_state")
    WebElement StateDropDown;
    public @FindBy(id = "postcode")
    WebElement Postcode;
    public @FindBy(id = "phone_mobile")
    WebElement Mobile;
    public @FindBy(id = "submitAccount")
    WebElement RegisterButton;

    public void clearFirstName() {FirstName.clear();}
    public void inputFirstName(String FirstNameInput) {FirstName.sendKeys(FirstNameInput);}
    public void clearLastName() {LastName.clear();}
    public void inputLastName(String LastNameInput) {LastName.sendKeys(LastNameInput);}
    public void clearPassword() {Password.clear();}
    public void inputPassword(String PasswordInput) {Password.sendKeys(PasswordInput);}
    public void clearAddress() {Address.clear();}
    public void inputAddress(String AddressInput) {Address.sendKeys(AddressInput);}
    public void clearCity() {City.clear();}
    public void inputCity(String CityInput) {City.sendKeys(CityInput);}
    public void clickState() {StateDropDown.click();}
    public void inputState(String StateInput) {StateDropDown.sendKeys(StateInput);}
    public void enterState() {StateDropDown.sendKeys(Keys.ENTER);}
    public void clearPostcode() {Postcode.clear();}
    public void inputPostcode(String PostcodeInput) {Postcode.sendKeys(PostcodeInput);}
    public void clearMobile() {Mobile.clear();}
    public void inputMobile(String MobileInput) {Mobile.sendKeys(MobileInput);}
    public void clickRegistration() {RegisterButton.click();}


}
