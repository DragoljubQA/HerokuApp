package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe" );

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https:\\www.google.com");
        driver.navigate().to("https:\\www.facebook.com");
        Thread.sleep(5000);
        driver.navigate().back();

    }

}
