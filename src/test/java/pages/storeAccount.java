package pages;

import base.baseStore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class storeAccount extends baseStore {

    public storeAccount() {PageFactory.initElements(driver,this);}

    public @FindBy(css = ".account")
    WebElement AccountButton;

    public boolean accountPresent() {return AccountButton.isDisplayed();}








}
