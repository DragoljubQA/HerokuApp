package tools;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testTools {

    WebDriver driver;
    pageTools toolsPage;
    JavascriptExecutor js;
    pageBooks booksPage;
    pageLogin loginPage;
    pageProfile profilePage;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.js = (JavascriptExecutor) driver;
        this.toolsPage = new pageTools(driver, js);
        this.booksPage = new pageBooks(driver, js);
        this.loginPage = new pageLogin(driver);
        this.profilePage = new pageProfile(driver, booksPage, js);
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
    }

    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        Thread.sleep(500);
    }

    @Test(priority = 1)
    public void booksPageLogIn() throws InterruptedException {

        toolsPage.pageScrol();
        toolsPage.clickOnBooksAppTab();
        Thread.sleep(1000);
        booksPage.clickOnLogINBtn();
        loginPage.inputUsername("korisnik");
        loginPage.inputPassword("passWord#1973");
        Thread.sleep(500);
        loginPage.clickOnLoginBtn();
        Thread.sleep(1000);
        Assert.assertEquals(loginPage.getLoginValue(), "korisnik");
    }

    @Test(priority = 5)
    public void addingBookToColection() throws InterruptedException {

        String mesage = booksPage.choosingBookTwo();
        Assert.assertEquals(mesage, "Book added to your collection.");
    }

    @Test(priority = 10)
    public void deletingBookFromColection() throws InterruptedException {

        booksPage.clickOnProfileBtn();
        String mesage = profilePage.deleteBooks();
        Assert.assertEquals(mesage, "All Books deleted.");
    }

    @Test(priority = 15)
    public void logingOut() {

        profilePage.logingOut();
    }

    @AfterClass
    public void afterClass() {
        driver.manage().deleteAllCookies();
        //nisam sigurna da li je ova linija potrebna, po logici ne bi trebalo
        driver.navigate().refresh();
        driver.close();
    }

}
