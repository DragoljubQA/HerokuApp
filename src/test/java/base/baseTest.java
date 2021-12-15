package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseTest {

    public static WebDriver driver;
    public static WebDriverWait wdwait;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, 30);
        driver.manage().window().maximize();
        //driver.get("https://www.yahoo.com");
        driver.get("https://www.comtradeshop.com");
    }

    @Test
    public void popupKill() {
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Otvori nalog")));
        driver.switchTo().frame(driver.findElement(By.cssSelector(".ub-emb-iframe")));
        driver.findElement(By.cssSelector(".lp-pom-body.lp-convertable-page")).sendKeys(Keys.ESCAPE);
        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Otvori nalog")).click();

    }

    @After
    public void tearDown() {
//        driver.close();
//        driver.quit();
    }
}
