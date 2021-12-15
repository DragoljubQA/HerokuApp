package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class Zadatak2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe" );

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");

        WebElement a = driver.findElement(By.className("card-body"));
        a.click();
        WebElement b = driver.findElement(By.id("item-0"));
        b.click();
        WebElement c = driver.findElement(By.id("userName"));
        c.clear();
        c.sendKeys("Johnny Banana");


    }

}
