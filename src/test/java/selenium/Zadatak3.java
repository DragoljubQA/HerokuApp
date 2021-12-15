package selenium;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Zadatak3 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe" );

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.sportvision.rs/patike/69812591-champion-johnny");
        WebElement velicina = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[1]/div/div[2]/div[4]/ul/li[3]"));
        velicina.click();
        Thread.sleep(3000);
        WebElement cart = driver.findElement(By.id("nb_addToCartButton"));
        cart.click();
        Thread.sleep(3000);

        driver.navigate().to("https://www.sportvision.rs/kupovina");
        driver.manage().deleteCookieNamed("NBPHPSessionSecure");
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);

        String alert = driver.findElement(By.className("empty-cart-alert-wrapper")).getText();

        Thread.sleep(3000);
        System.out.println(alert);



    }

}
