package test;

import base.baseHerokuapp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.herokuappLoginPage;
import pages.herokuappLogoutPage;

public class herokuappTest extends baseHerokuapp {

    herokuappLoginPage HerokuappLoginPage;
    herokuappLogoutPage HerokuappLogoutPage;

    @Before
    public void setUpPage() {
        HerokuappLoginPage = new herokuappLoginPage();
        HerokuappLogoutPage = new herokuappLogoutPage();
    }

//valid username is only "tomsmith" and valid password is only "SuperSecretPassword!", everything else is invalid

    @Test
    public void successfulLogin() {
        HerokuappLoginPage.clearUsername();
        HerokuappLoginPage.clearPassword();
        HerokuappLoginPage.insertUsername("tomsmith");
        HerokuappLoginPage.insertPassword("SuperSecretPassword!");
        HerokuappLoginPage.clickLogin();
        Assert.assertTrue(HerokuappLogoutPage.SuccessfulLogin.isDisplayed());
    }

    @Test
    public void validnoIspisanTekstNakonLogIna() {
        HerokuappLoginPage.clearUsername();
        HerokuappLoginPage.clearPassword();
        HerokuappLoginPage.insertUsername("tomsmith");
        HerokuappLoginPage.insertPassword("SuperSecretPassword!");
        HerokuappLoginPage.clickLogin();
        Assert.assertEquals(HerokuappLogoutPage.dva(),HerokuappLogoutPage.jedan());

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
        Assert.assertEquals("Username", HerokuappLoginPage.usernameTitle());
        Assert.assertEquals("Password", HerokuappLoginPage.passwordTitle());
    }

    @Test
    public void loginButtonTitleIsPresent() {
        Assert.assertEquals("Login", HerokuappLoginPage.loginTitle());
    }

}
