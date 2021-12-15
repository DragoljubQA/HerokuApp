package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageLogin {
    WebDriver driver;
    WebElement username;
    WebElement password;
    WebElement loginBtn;
    WebElement usernameValue;

    public pageLogin(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public void inputUsername(String nameOfUser) {
        username = driver.findElement(By.id("userName"));
        username.clear();
        username.sendKeys(nameOfUser);
    }
    public void inputPassword(String passwordForLogin) {
        password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys(passwordForLogin);
    }
    public void clickOnLoginBtn() {
        loginBtn = driver.findElement(By.id("login"));
        loginBtn.click();
    }
    public String getLoginValue() {
        usernameValue = driver.findElement(By.id("userName-value"));
        return usernameValue.getText();
    }
}
