import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestComtrade {

    public static WebDriver driver;
    public String pass = "Zaza0303";

    @Before
    public void testSetUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.comtradeshop.com/customer/account/create");
    }

    @Test
    public void registracija() {
        WebElement ime = driver.findElement(By.id("firstname"));
        ime.clear();
        ime.sendKeys("Aleksandra");

        WebElement prezime = driver.findElement(By.id("lastname"));
        prezime.clear();
        prezime.sendKeys("Markovic");

        WebElement email = driver.findElement(By.id("email_address"));
        email.clear();
        email.sendKeys("aleksandra.markovic@gmail.com");

        WebElement newsletter = driver.findElement(By.id("is_subscribed"));
        newsletter.click();

        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys(pass);

        WebElement potvrdaPassword = driver.findElement(By.id("confirmation"));
        potvrdaPassword.clear();
        potvrdaPassword.sendKeys(pass);

        WebElement posalji = driver.findElement(By.xpath("//button[@title=\"Submit\"]"));
        posalji.click();

        WebElement povratnaPoruka = driver.findElement(By.cssSelector(".alert.alert-success"));
        Assert.assertTrue(povratnaPoruka.isDisplayed());
        Assert.assertEquals("Hvala na registraciji. Molimo proverite email i aktivirajte Vaš nalog.", povratnaPoruka.getText());
    }

    @Test
    public void testingDropdown() {
        WebElement dropdown = driver.findElement(By.id("pravnolice"));
        Select pibDropdown = new Select(dropdown);
        pibDropdown.selectByVisibleText("Da");

    }


    @Test
    public void testingRegistracijaPravnogLica() {
        WebElement ime = driver.findElement(By.id("firstname"));
        ime.clear();
        ime.sendKeys("Aleksandra");

        WebElement prezime = driver.findElement(By.id("lastname"));
        prezime.clear();
        prezime.sendKeys("Markovic");

        WebElement email = driver.findElement(By.id("email_address"));
        email.clear();
        email.sendKeys("aleksandra.markovic@yahoo.com");

        WebElement newsletter = driver.findElement(By.id("is_subscribed"));
        newsletter.click();

        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys(pass);

        WebElement potvrdaPassword = driver.findElement(By.id("confirmation"));
        potvrdaPassword.clear();
        potvrdaPassword.sendKeys(pass);

        WebElement dropdown = driver.findElement(By.id("pravnolice"));
        Select pibDropdown = new Select(dropdown);
        pibDropdown.selectByVisibleText("Da");

        WebElement firma = driver.findElement(By.id("firma"));
        firma.clear();
        firma.sendKeys("Shyft");

        WebElement pib = driver.findElement(By.id("pib"));
        pib.clear();
        pib.sendKeys("123456789");

        WebElement posalji = driver.findElement(By.xpath("//button[@title=\"Submit\"]"));
        posalji.click();

        WebElement povratnaPoruka = driver.findElement(By.cssSelector(".alert.alert-success"));
        Assert.assertTrue(povratnaPoruka.isDisplayed());
        Assert.assertEquals("Hvala na registraciji. Molimo proverite email i aktivirajte Vaš nalog.", povratnaPoruka.getText());
    }


    @Test
    public void testingRegistracijaPravnogLicaSaPogresnimPibom() {
        WebElement ime = driver.findElement(By.id("firstname"));
        ime.clear();
        ime.sendKeys("Aleksandra");

        WebElement prezime = driver.findElement(By.id("lastname"));
        prezime.clear();
        prezime.sendKeys("Markovic");

        WebElement email = driver.findElement(By.id("email_address"));
        email.clear();
        email.sendKeys("aleksandra.markovic@google.com");

        WebElement newsletter = driver.findElement(By.id("is_subscribed"));
        newsletter.click();

        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys(pass);

        WebElement potvrdaPassword = driver.findElement(By.id("confirmation"));
        potvrdaPassword.clear();
        potvrdaPassword.sendKeys(pass);

        WebElement dropdown = driver.findElement(By.id("pravnolice"));
        Select pibDropdown = new Select(dropdown);
        pibDropdown.selectByVisibleText("Da");

        WebElement firma = driver.findElement(By.id("firma"));
        firma.clear();
        firma.sendKeys("Shyft");

        WebElement pib = driver.findElement(By.id("pib"));
        pib.clear();
        pib.sendKeys("am1234567");

        WebElement posalji = driver.findElement(By.xpath("//button[@title=\"Submit\"]"));
        posalji.click();

        WebElement povratnaPoruka = driver.findElement(By.cssSelector(".alert.alert-success"));
        Assert.assertTrue(povratnaPoruka.isDisplayed());
        Assert.assertEquals("Hvala na registraciji. Molimo proverite email i aktivirajte Vaš nalog.", povratnaPoruka.getText());

    }





}
