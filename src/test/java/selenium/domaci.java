package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class domaci {

    public static void main(String[] args) throws InterruptedException {
        //
        System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]")).click();  //ELEMENT
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"item-0\"]")).click();  //Klikne na "Text Box"
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"userName\"]")).clear();
        Thread.sleep(1000);  																//Polje "Full name" ocisti pa unese vase ime
        driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Igor Obrovac");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).clear();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("igor.ob.90@gmail.com");  //unese mail
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"item-1\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button")).click();  //padajuci meni
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[1]")).click();  //samo desktop
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[1]")).click(); // ponovo elements da zatvori spisak

        Thread.sleep(5000);
        driver.close();






    }

}
