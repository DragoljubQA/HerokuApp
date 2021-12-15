package pages;

import base.baseTestComtrade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class comtradeSporetiBeli extends baseTestComtrade {

    public comtradeSporetiBeli() { PageFactory.initElements(driver, this); }

    public @FindBy(xpath = "//strong[contains(text(),'Bela')]")
    WebElement drugaBoja;

    public String drugaBojaText() { return drugaBoja.getText(); }

}