package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class baseHerokuappDDT {

    public static WebDriver driver;
    WebDriverWait wdwait;
    ExcelReader citacIzExcela;

    @Before
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, 30);
        driver.manage().window().maximize();
        citacIzExcela =  new ExcelReader("data/AutomationTestPlan.xlsx");
        driver.navigate().to(citacIzExcela.getStringData("LogInTests", 0, 2));
    }

    @After
    public void tearDown() throws InterruptedException {
        driver.close();
        driver.quit();
    }

}
