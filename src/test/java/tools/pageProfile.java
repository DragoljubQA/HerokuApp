package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class pageProfile {
    WebDriver driver;
    pageBooks booksPage;
    JavascriptExecutor js;
    WebElement deleteAllBooksBtn;
    WebElement conformationBtn;
    WebElement logOutBtn;

    public pageProfile(WebDriver driver, pageBooks booksPage, JavascriptExecutor js) {
        this.driver = driver;
        this.booksPage = booksPage;
        this.js = js;
    }

    public String deleteBooks() throws InterruptedException {
        Thread.sleep(5000);
        //i LogOut dugme i Delete All Books dugme imaju isti id, radi dugme logout
        //i kad se za  Delete All Books dugme u findElement by id stavi id radi dugme logout
        deleteAllBooksBtn = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[3]/div[3]/button"));
        js.executeScript("arguments[0].scrollIntoView();", deleteAllBooksBtn);
        deleteAllBooksBtn.click();
        Thread.sleep(1000);
        conformationBtn = driver.findElement(By.id("closeSmallModal-ok"));
        conformationBtn.click();
        Thread.sleep(1000);

        String mesage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return mesage;
    }
    public void logingOut() {
        logOutBtn = driver.findElement(By.id("submit"));
        js.executeScript("arguments[0].scrollIntoView();", logOutBtn);
        logOutBtn.click();
    }



}
