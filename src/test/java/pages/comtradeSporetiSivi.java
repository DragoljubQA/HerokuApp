package pages;

import base.baseTestComtrade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class comtradeSporetiSivi extends baseTestComtrade {

    public comtradeSporetiSivi() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy(xpath = "//strong[contains(text(),'Siva metalik')]")
    WebElement boja;

    public String bojaText() { return boja.getText(); }

}