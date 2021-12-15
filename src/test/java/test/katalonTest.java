package test;

import base.baseKatalon;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.katalonMainPage;
import pages.katalonMyAccount;

import java.time.Instant;

public class katalonTest extends baseKatalon {

    katalonMainPage KatalonMainPage;
    katalonMyAccount KatalonMyAccount;

    @Before
    public void setUpPage() {
        KatalonMainPage = new katalonMainPage();
        KatalonMyAccount = new katalonMyAccount();
    }

    @Test
    public void noCredentialsLogIn() throws InterruptedException {
        KatalonMainPage.clickMyAccountButton();
        KatalonMyAccount.clearUsername();
        KatalonMyAccount.clearPassword();
        KatalonMyAccount.clickLogIn();
        wdwait.until(ExpectedConditions.visibilityOf(KatalonMyAccount.ErrorLogIn));
        Assert.assertTrue(KatalonMyAccount.ErrorLogIn.isDisplayed());
        Assert.assertEquals("Error: Username is required.", KatalonMyAccount.ErrorLogIn.getText());
    }

    @Test
    public void wrongCredentialsLogIn() throws InterruptedException {
        KatalonMainPage.clickMyAccountButton();
        KatalonMyAccount.clearUsername();
        KatalonMyAccount.clearPassword();
        KatalonMyAccount.inputUsername("Qwerty");
        KatalonMyAccount.inputPassword("Qwerty123");
        KatalonMyAccount.clickLogIn();
        Thread.sleep(3000);
        Assert.assertTrue(KatalonMyAccount.ErrorLogIn.isDisplayed());
    }

    @Test
    public void successfulLogIn() throws InterruptedException {
        KatalonMainPage.clickMyAccountButton();
        KatalonMyAccount.clearUsername();
        KatalonMyAccount.clearPassword();
        //username: customer ; password: 123456789
        KatalonMyAccount.inputUsername("customer");
        KatalonMyAccount.inputPassword("123456789");
        KatalonMyAccount.clickLogIn();
        Thread.sleep(3000);
        Assert.assertTrue(KatalonMyAccount.SuccessfulLogIn.isDisplayed());
    }

    @Test
    public void addFirstObject() throws InterruptedException {
        KatalonMainPage.clickOnFirstObject();
        Thread.sleep(2000);
        String first = KatalonMainPage.getFirstObjectName().getText();
        KatalonMainPage.addToCartFirstObject();
        KatalonMainPage.clickCartButton();
        Thread.sleep(2000);
        String second = KatalonMainPage.getFirstObjectCartName().getText();
        Assert.assertEquals(first,second);



    }


}
