package test;

import base.ExcelReader;
import base.baseHerokuappDDT;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.herokuappLoginPageDDT;
import pages.herokuappLogoutPageDDT;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class herokuappTestDDT extends baseHerokuappDDT {

    herokuappLoginPageDDT HerokuappLoginPage;
    herokuappLogoutPageDDT HerokuappLogoutPage;
    ExcelReader citacIzExcela;

    @Before
    public void setUpPage() throws IOException {
        HerokuappLoginPage = new herokuappLoginPageDDT();
        HerokuappLogoutPage = new herokuappLogoutPageDDT();
        citacIzExcela = new ExcelReader("data/AutomationTestPlan.xlsx");

    }

//valid username is only "tomsmith" and valid password is only "SuperSecretPassword!", everything else is invalid

    @Test
    public void successfulLogin() {

        String username = citacIzExcela.getStringData("LogInTests", 3, 2);
        String password = citacIzExcela.getStringData("LogInTests", 4, 2);
        HerokuappLoginPage.clearUsername();
        HerokuappLoginPage.clearPassword();
        HerokuappLoginPage.insertUsername(username);
        HerokuappLoginPage.insertPassword(password);
        HerokuappLoginPage.clickLogin();
        Assert.assertTrue(HerokuappLogoutPage.SuccessfulLogin.isDisplayed());
    }

    @Test
    public void invalidInputRow() throws InterruptedException {
        int i = 2;
        while (i <= 6) {
            String username = citacIzExcela.getStringData("LogInTests", 12, i);
            String password = citacIzExcela.getStringData("LogInTests", 12, i);
            HerokuappLoginPage.clearUsername();
            HerokuappLoginPage.clearPassword();
            HerokuappLoginPage.insertUsername(username);
            Thread.sleep(2000);
            HerokuappLoginPage.insertPassword(password);
            Thread.sleep(2000);
            HerokuappLoginPage.clickLogin();
            i++;

        }
    }

    @Test
    public void invalidInputRowFor() throws InterruptedException {
        for(int i = 2 ; i <= 6; i++) {
            String username = citacIzExcela.getStringData("LogInTests", 12, i);
            String password = citacIzExcela.getStringData("LogInTests", 12, i);
            HerokuappLoginPage.clearUsername();
            HerokuappLoginPage.clearPassword();
            HerokuappLoginPage.insertUsername(username);
            Thread.sleep(2000);
            HerokuappLoginPage.insertPassword(password);
            Thread.sleep(2000);
            HerokuappLoginPage.clickLogin();
        }
    }

    @Test
    public void invalidInputCollumnFor() throws InterruptedException {
        for(int j = 0 ; j <= 4 ; j++) {
            for(int i = 0 ; i <= 4 ; i++) {
            String username = citacIzExcela.getStringData("LogInTests2", j, i);
            String password = citacIzExcela.getStringData("LogInTests2", j, i);
            HerokuappLoginPage.clearUsername();
            HerokuappLoginPage.clearPassword();
            HerokuappLoginPage.insertUsername(username);
            Thread.sleep(2000);
            HerokuappLoginPage.insertPassword(password);
            Thread.sleep(2000);
            HerokuappLoginPage.clickLogin();
            }
        }
    }

    @Test
    public void invalidInputCollumnFor2() throws InterruptedException {

        for(int j = 0 ; j <= 4 ; j++) {
            String username = citacIzExcela.getStringData("LogInTests2", j, 0);
            String password = citacIzExcela.getStringData("LogInTests2", j, 0);
            HerokuappLoginPage.clearUsername();
            HerokuappLoginPage.clearPassword();
            HerokuappLoginPage.insertUsername(username);
            Thread.sleep(2000);
            HerokuappLoginPage.insertPassword(password);
            Thread.sleep(2000);
            HerokuappLoginPage.clickLogin();
        }
    }

    @Test
    public void invalidInputCollumnFor3() throws InterruptedException {

        for(int j = 0 ; j <= 2 ; j++) {
            String username = citacIzExcela.getStringData("LogInTests3", j, 0);
            String password = citacIzExcela.getStringData("LogInTests3", j, 0);
            HerokuappLoginPage.clearUsername();
            HerokuappLoginPage.clearPassword();
            HerokuappLoginPage.insertUsername(username);
            Thread.sleep(2000);
            HerokuappLoginPage.insertPassword(password);
            Thread.sleep(2000);
            HerokuappLoginPage.clickLogin();
        }
    }

    @Test
    public void invalidInputCollumn() throws InterruptedException {
        int i = 12;
        int j = 2;
        while (i <= 16) {
            while (j <= 6) {
                String username = citacIzExcela.getStringData("LogInTests", i, j);
                String password = citacIzExcela.getStringData("LogInTests", i, j);
                HerokuappLoginPage.clearUsername();
                HerokuappLoginPage.clearPassword();
                HerokuappLoginPage.insertUsername(username);
                Thread.sleep(2000);
                HerokuappLoginPage.insertPassword(password);
                Thread.sleep(2000);
                HerokuappLoginPage.clickLogin();
                j++;
            }
            i++;
        }
    }

    @Test
    public void validnoIspisanTekstNakonLogIna() {
        HerokuappLoginPage.clearUsername();
        HerokuappLoginPage.clearPassword();
        HerokuappLoginPage.insertUsername("tomsmith");
        HerokuappLoginPage.insertPassword("SuperSecretPassword!");
        HerokuappLoginPage.clickLogin();
        assertEquals(HerokuappLogoutPage.dva(),HerokuappLogoutPage.jedan());

    }

    @Test
    public void emptyFieldsFailedLogin() {
        HerokuappLoginPage.clearUsername();
        HerokuappLoginPage.clearPassword();
        HerokuappLoginPage.clickLogin();
        Assert.assertTrue(HerokuappLoginPage.InvalidNotification.isDisplayed());
    }

    @Test
    public void validUsernameInvalidPasswordLogin() {
        HerokuappLoginPage.clearUsername();
        HerokuappLoginPage.clearPassword();
        HerokuappLoginPage.insertUsername("tomsmith"); //username data is valid
        HerokuappLoginPage.insertPassword("tomsmith"); //password data is invalid
        HerokuappLoginPage.clickLogin();
        Assert.assertTrue(HerokuappLoginPage.InvalidNotification.isDisplayed());
    }

    @Test
    public void invalidUsernameValidPasswordLogin() {
        HerokuappLoginPage.clearUsername();
        HerokuappLoginPage.clearPassword();
        HerokuappLoginPage.insertUsername("dragoljub"); //username data is invalid
        HerokuappLoginPage.insertPassword("SuperSecretPassword!"); //password data is valid
        HerokuappLoginPage.clickLogin();
        Assert.assertTrue(HerokuappLoginPage.InvalidNotification.isDisplayed());
    }

    @Test
    public void invalidUsernameInvalidPasswordLogin() {
        HerokuappLoginPage.clearUsername();
        HerokuappLoginPage.clearPassword();
        HerokuappLoginPage.insertUsername("dragoljub"); //username data is invalid
        HerokuappLoginPage.insertPassword("QA"); //password data is invalid
        HerokuappLoginPage.clickLogin();
        Assert.assertTrue(HerokuappLoginPage.InvalidNotification.isDisplayed());
    }

    @Test
    public void userCanSignOut() {
        HerokuappLoginPage.clearUsername();
        HerokuappLoginPage.clearPassword();
        HerokuappLoginPage.insertUsername("tomsmith");
        HerokuappLoginPage.insertPassword("SuperSecretPassword!");
        HerokuappLoginPage.clickLogin();
        Assert.assertTrue(HerokuappLogoutPage.SuccessfulLogin.isDisplayed());
        HerokuappLogoutPage.clickSignOut();
        Assert.assertTrue(HerokuappLoginPage.ValidNotification.isDisplayed());
    }

    @Test
    public void closeNotifications() {
        HerokuappLoginPage.clearUsername();
        HerokuappLoginPage.clearPassword();
        HerokuappLoginPage.insertUsername("tom");
        HerokuappLoginPage.clickLogin();
        Assert.assertTrue(HerokuappLoginPage.InvalidNotification.isDisplayed());
        HerokuappLoginPage.closeNotificationLogin();
        Assert.assertFalse(HerokuappLoginPage.flash());
        HerokuappLoginPage.clearUsername();
        HerokuappLoginPage.clearPassword();
        HerokuappLoginPage.insertUsername("tomsmith");
        HerokuappLoginPage.insertPassword("SuperSecret");
        HerokuappLoginPage.clickLogin();
        Assert.assertTrue(HerokuappLoginPage.InvalidNotification.isDisplayed());
        HerokuappLoginPage.closeNotificationLogin();
        Assert.assertFalse(HerokuappLoginPage.flash());
        HerokuappLoginPage.clearUsername();
        HerokuappLoginPage.clearPassword();
        HerokuappLoginPage.insertUsername("tomsmith");
        HerokuappLoginPage.insertPassword("SuperSecretPassword!");
        HerokuappLoginPage.clickLogin();
        Assert.assertTrue(HerokuappLogoutPage.SuccessfulLogin.isDisplayed());
        HerokuappLogoutPage.closeNotificationLogout();
        Assert.assertFalse(HerokuappLogoutPage.flash());
        HerokuappLogoutPage.clickSignOut();
        Assert.assertTrue(HerokuappLoginPage.ValidNotification.isDisplayed());
        HerokuappLoginPage.closeNotificationLogin();
        Assert.assertFalse(HerokuappLoginPage.flash());

    }

    @Test
    public void usernameAndPasswordTitlesArePresent() {
        assertEquals("Username", HerokuappLoginPage.usernameTitle());
        assertEquals("Password", HerokuappLoginPage.passwordTitle());
    }

    @Test
    public void loginButtonTitleIsPresent() {
        assertEquals("Login", HerokuappLoginPage.loginTitle());
    }

    @After
    public void tearDown() throws InterruptedException {
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }

}
