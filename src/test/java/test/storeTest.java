package test;

import base.baseStore;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.storeAccount;
import pages.storeHomepage;
import pages.storeLogin;
import pages.storeRegistration;

public class storeTest extends baseStore {

    storeHomepage StoreHomepage;
    storeLogin StoreLogin;
    storeRegistration StoreRegistration;
    storeAccount StoreAccount;

    @Before
    public void SetUpPage() {
        StoreHomepage = new storeHomepage();
        StoreLogin = new storeLogin();
        StoreRegistration = new storeRegistration();
        StoreAccount = new storeAccount();
    }

    @Test
    public void SuccessfulRegistration() throws Exception{
        StoreHomepage.clickSignIn();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("email_create")));
        StoreLogin.clearEmail();
        StoreLogin.inputEmail("habannan@gnail.com");
        StoreLogin.signInButton();
        Thread.sleep(3000);
        StoreRegistration.clearFirstName();
        StoreRegistration.inputFirstName("Drago");
        StoreRegistration.clearLastName();
        StoreRegistration.inputLastName("Ljub");
        StoreRegistration.clearPassword();
        StoreRegistration.inputPassword("testing");
        StoreRegistration.clearAddress();
        StoreRegistration.inputAddress("Kralja Bodina 11");
        StoreRegistration.clearCity();
        StoreRegistration.inputCity("Beograd");
        StoreRegistration.clickState();
        StoreRegistration.inputState("Florida");
        StoreRegistration.enterState();
        StoreRegistration.clearPostcode();
        StoreRegistration.inputPostcode("81754");
        StoreRegistration.clearMobile();
        StoreRegistration.inputMobile("38163451822");
        StoreRegistration.clickRegistration();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".account")));
        Assert.assertTrue(StoreAccount.AccountButton.isDisplayed());


    }

}
