package selenium;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class Zadatak4 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe" );

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://cms.demo.katalon.com/my-account/");
        Thread.sleep(3000);
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("customer");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123456789");
        WebElement submit = driver.findElement(By.name("login"));
        submit.click();

        Thread.sleep(3000);

        // create file named Cookies to store Login Information
        File file = new File("Cookies.data");
        try
        {
            // Delete old file if exists
            file.delete();
            file.createNewFile();
            FileWriter fileWrite = new FileWriter(file);
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);
            // loop for getting the cookie information

            // loop for getting the cookie information
            for(Cookie ck : driver.manage().getCookies())
            {
                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));
                Bwrite.newLine();
            }
            Bwrite.close();
            fileWrite.close();

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
