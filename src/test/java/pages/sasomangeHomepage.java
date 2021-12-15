package pages;

import base.baseSasomange;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sasomangeHomepage extends baseSasomange {

    public sasomangeHomepage() {PageFactory.initElements(driver, this); }

    public @FindBy(className = "header-avatar")
    WebElement LoginButton;

    public @FindBy(css = "#login-screen .btn")
    WebElement PrijaviSeButton;

    public @FindBy(css = ".loggin-menu-drop-trigger > .name")
    WebElement UspesanLogin;

public void clickLogin() {LoginButton.click();}
public void clickPrijaviSe() {PrijaviSeButton.click();}


}
