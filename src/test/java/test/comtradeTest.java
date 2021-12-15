package test;

import base.baseTestComtrade;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.comtradeRegistration;

public class comtradeTest extends baseTestComtrade {

    comtradeRegistration comtradeRegistration;

    @Before
    public void setUpPage() {
        comtradeRegistration = new comtradeRegistration();
    }

    @Test
    public void povratnaPoruka() {
        Assert.assertTrue(comtradeRegistration.verifyPorukaIsDisplayed());
    }


}
