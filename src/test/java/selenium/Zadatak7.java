package selenium;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Zadatak7 {
    WebDriver driver;
    @BeforeClass
    public void preKlase() {
        System.setProperty("webdriver.chrome.driver",
                "driver-lib\\chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @BeforeMethod
    public void setup() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/register");
        Thread.sleep(5000);
    }
    @Test (priority = 10)
    public void logIn() throws InterruptedException {
        WebElement captcha = driver.findElement(By.xpath("//*[@id=\"recaptcha-accessible-status\"]"));
        captcha.click();


    }}