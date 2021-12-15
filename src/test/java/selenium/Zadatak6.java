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
public class Zadatak6 {
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
        driver.navigate().to("http://cms.demo.katalon.com/");
        Thread.sleep(2000);
    }
    @Test (priority = 10)
    public void logIn() throws InterruptedException {
        WebElement myAccountTab = driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[3]/a"));
        myAccountTab.click();
        WebElement userNameInputField = driver.findElement(By.id("username"));
        userNameInputField.sendKeys("customer");
        WebElement passwordNameInputField = driver.findElement(By.id("password"));
        passwordNameInputField.sendKeys("123456789");
        WebElement logInButton = driver.findElement(By.name("login"));
        logInButton.click();
        Thread.sleep(2000);
        //WebElement logOutButton = driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/p[1]/a"));
    }
    @Test (priority = 5)
    public void dodavanjeItemaUKorpu() throws InterruptedException{
        driver.manage().addCookie(new Cookie("wordpress_4d8a854e0c8bd1c7f0585d2f4b3ad575", "customer%7C1611503464%7Ca4rAyTWklXrSYy57ZGY8AZz7ygf7jbncz80vsHkQtyc%7Ccfb54df144b7c57f94ad3bb266c83cc46bddfe76206c7f9594d4cf283e926d7a"));
        driver.navigate().refresh();
        driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[5]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[1]/div/a[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[1]/div/a[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[2]/td/div/button\r\n"));
        //String itemName = driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[3]/a")).getText();
        //Assert.assertEquals(itemName, "Flying Ninja");
        List<WebElement> proizvodiUKorpi = driver.findElements(By.className("cart_item"));
        System.out.println(proizvodiUKorpi.toString());
        driver.navigate().to("http://cms.demo.katalon.com/");
        List<WebElement> majice = driver.findElements(By.className("product-type-simple"));
        int broj = majice.size();
        System.out.println(broj);
    }
    @AfterMethod
    public void afterTest() throws InterruptedException {
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
        Thread.sleep(2000);
    }
    @AfterClass
    public void pposleKlase() {
       // driver.close();
        System.out.println("Izvrsava se posle klase");
    }
}