package pages;

import base.baseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yahooHomePage extends baseTest {

    public yahooHomePage() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy(id = "header-logo")
    WebElement yahooLogo;
    public @FindBy(xpath = ".//a[@href=\"https://news.yahoo.com/\"]")
    WebElement newsLink;
    public @FindBy(name = "p")
    WebElement inputSearchField;
    public @FindBy(id = "search-button")
    WebElement searchButton;
    public @FindBy(css = ".fw-n.lh-xs.fz-14")
    WebElement techCompSigh;
    public @FindBy(css = ".am-opener.sharkskin-collapse")
    WebElement hoverMenu;
    public @FindBy(linkText = "Otvori nalog")
    WebElement otvoriNalogLink;

    public boolean verifyYahooLogoIsDisplayed() {
        return yahooLogo.isDisplayed();
    }

    public void clickOtvoriNalogLink() {
        otvoriNalogLink.click();
    }

    public void clickNewsLink() {
        newsLink.click();
    }

    public void inputSearchDataIntoSearchField(String searchData) {
        inputSearchField.sendKeys(searchData);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public String techCompText() {
        return techCompSigh.getText();
    }

    public void hoverOverMenu() {
        Actions hover = new Actions(driver);
        hover.moveToElement(hoverMenu).perform();
    }
}
