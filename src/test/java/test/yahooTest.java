package test;

import base.baseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.yahooHomePage;

public class yahooTest extends baseTest {

    yahooHomePage YahooHomePage;

    @Before
    public void setUpPage() {
        YahooHomePage = new yahooHomePage();
    }

    @Test
    public void checkingYahooLogo() throws Exception {
        Thread.sleep(2000);
        Assert.assertTrue(YahooHomePage.verifyYahooLogoIsDisplayed());
    }

    @Test
    public void checkingGoogleSearchResultFromYahooNews() {
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("News")));
        YahooHomePage.clickNewsLink();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.name("p")));
        YahooHomePage.inputSearchDataIntoSearchField("google");
        YahooHomePage.clickSearchButton();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".fw-n.lh-xs.fz-14")));
        Assert.assertEquals("Technology company", YahooHomePage.techCompText());
    }

    @Test
    public void hoverTest() {
        YahooHomePage.popupKill();
        YahooHomePage.clickOtvoriNalogLink();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".button.btn.btn-primary.btn-continue.pull-right.btn-lg")));
        YahooHomePage.hoverOverMenu();
    }

}