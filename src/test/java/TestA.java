import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestA {

    public static WebDriver driver;

    @Before
    public void testSetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.yahoo.com");
    }

    @Test
    public void clickSignInButton () {
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("ovo je test");

        WebElement search = driver.findElement(By.name("q"));
        search.clear();
        search.sendKeys("Ovo je test!");
    }

    @Test
    public void YahooLogoDisplayedTest() {

        WebElement logo = driver.findElement(By.id("header-logo"));
        Assert.assertTrue(logo.isDisplayed());


    }

    @Test
    public void GoogleTextAndLogoFromYahoo() {

        WebElement news = driver.findElement(By.linkText("News"));
        news.click();

        WebElement search = driver.findElement(By.name("p"));
        search.clear();
        search.sendKeys("google");

        WebElement cl = driver.findElement(By.id("search-button"));
        cl.click();

        WebElement logo = driver.findElement(By.className("thmb sb"));
        Assert.assertTrue(logo.isDisplayed());

        WebElement text = driver.findElement(By.className("subTxt"));
        Assert.assertEquals("Technology company", text.getText());

    }

    @After
    public void testTearDown() {
       // driver.close();
        // driver.quit();

    }

}

//na yahoo kliknemo na news, na search ukucamo googlem kliknuti na search web, proverimo da li je logo prikazan i da li pise technology company