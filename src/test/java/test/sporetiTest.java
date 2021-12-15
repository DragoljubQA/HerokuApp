package test;

import base.baseTestComtrade;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.*;

public class sporetiTest extends baseTestComtrade {

    comtradeSporeti ComtradeSporeti;
    comtradeSporetiDva ComtradeSporetiDva;
    comtradeSporetiTri ComtradeSporetiTri;
    comtradeSporetiSivi ComtradeSporetiSivi;
    comtradeSporetiBeli ComtradeSporetiBeli;

    @Before
    public void setUpPage() {ComtradeSporeti = new comtradeSporeti();
    ComtradeSporetiDva = new comtradeSporetiDva();
    ComtradeSporetiTri = new comtradeSporetiTri();
    ComtradeSporetiSivi = new comtradeSporetiSivi();
    ComtradeSporetiBeli = new comtradeSporetiBeli();}

    @Test
    public void sporetiTest1() {
        //ComtradeSporeti.popupKill();
        ComtradeSporeti.hoverOverMenu();
        ComtradeSporeti.hoverOverSecondMenu();
        ComtradeSporeti.clickSporeti();
        //wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//a[@title=\"/kombinovani-sporeti\"]")));
        ComtradeSporetiDva.clickKombinovaniSporet();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title=\"K5111SG kombinovani šporet\"]")));
        ComtradeSporetiTri.clickSporet1();
        Assert.assertEquals("Siva metalik",ComtradeSporetiSivi.bojaText());
        driver.navigate().back();
        //ComtradeSporeti.popupKill();
        ComtradeSporetiTri.clickSporet2();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//strong[contains(text(),'Bela')]")));
        Assert.assertEquals("Bela",ComtradeSporetiBeli.drugaBojaText());
    }
}
