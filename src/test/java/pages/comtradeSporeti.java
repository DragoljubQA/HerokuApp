package pages;

import base.baseTestComtrade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class comtradeSporeti extends baseTestComtrade {

    public comtradeSporeti(){PageFactory.initElements(driver,this);}

    public @FindBy(css = ".am-opener.sharkskin-collapse")
    WebElement hoverMenu;
    public @FindBy(xpath = ".//a[@href=\"/bela-tehnika\"]")
    WebElement hoverBelaTehnika;
    public @FindBy(xpath = ".//a[@href=\"/sporeti\"]")
    WebElement sporeti;


    public void hoverOverMenu() {
        Actions hover = new Actions(driver);
        hover.moveToElement(hoverMenu).perform();
    }

    public void hoverOverSecondMenu() {
        Actions hover = new Actions(driver);
        hover.moveToElement(hoverBelaTehnika).perform();
    }

    public void clickSporeti() {
        sporeti.click();
    }


}
