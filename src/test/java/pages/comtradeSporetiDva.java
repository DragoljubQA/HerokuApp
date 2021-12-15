package pages;

import base.baseTestComtrade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class comtradeSporetiDva extends baseTestComtrade {

    public comtradeSporetiDva() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy(xpath = "//a[@title=\"Kombinovani šporeti\"]")
    WebElement kombinovaniSporeti;

    public void clickKombinovaniSporet() {
        kombinovaniSporeti.click();
    }

}