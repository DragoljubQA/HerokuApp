package pages;

import base.baseTestComtrade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class comtradeSporetiTri extends baseTestComtrade {

    public comtradeSporetiTri() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy(xpath = "//a[@title=\"K5111SG kombinovani šporet\"]")
    WebElement prviSporet;
    public @FindBy(xpath = "//a[@title=\"K5121WD kombinovani šporet\"]")
    WebElement drugiSporet;

    public void clickSporet1() {
        prviSporet.click();
    }

    public void clickSporet2() {
        drugiSporet.click();
    }

}