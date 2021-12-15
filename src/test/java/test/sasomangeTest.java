package test;

import base.baseSasomange;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.sasomangeHomepage;

public class sasomangeTest extends baseSasomange {

    sasomangeHomepage SasomangeHomepage;

    @Before
    public void SetUpPage() {
        SasomangeHomepage = new sasomangeHomepage();
    }

    @Test
    public void unsuccessfulLogin() throws Exception {
        SasomangeHomepage.clickLogin();
        Thread.sleep(5000);
        SasomangeHomepage.clickPrijaviSe();
        Thread.sleep(3000);
        Assert.assertFalse(SasomangeHomepage.UspesanLogin.isDisplayed());
    }

}
