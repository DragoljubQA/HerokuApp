package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageBooks {

    WebDriver driver;
    pageTools toolsPage;
    WebElement logINBtn;
    WebElement book2;
    WebElement addNewBookBtn;
    WebElement profileBtn;
    JavascriptExecutor js;


    public pageBooks(WebDriver driver, JavascriptExecutor js) {
        this.driver = driver;
        this.js = js;
    }

    public WebElement getLogINBtn() {
        return logINBtn;
    }

    public void clickOnLogINBtn() throws InterruptedException {
        logINBtn = driver.findElement(By.id("login"));
        logINBtn.click();
    }
    public String choosingBookTwo() throws InterruptedException {
        book2 = driver.findElement(By.id("see-book-Learning JavaScript Design Patterns"));
        book2.click();
        addNewBookBtn = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[2]/div[9]/div[2]/button"));
        js.executeScript("arguments[0].scrollIntoView();", addNewBookBtn);
        addNewBookBtn.click();
        Thread.sleep(1500);
        String mesage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return mesage;

    }

    public void clickOnProfileBtn() {
        //neće da klikne dugme, tako da je workaround - sa jsExecutor da ode na stranu profile
        profileBtn = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[3]"));
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        //js.executeScript("window.location = 'https://demoqa.com/profile'");	//workarond
        js.executeScript("arguments[0].scrollIntoView();", profileBtn);
        profileBtn.click();

    }













}
