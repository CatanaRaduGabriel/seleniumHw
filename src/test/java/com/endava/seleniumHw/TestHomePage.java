package com.endava.seleniumHw;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by racatana on 8/4/2016.
 */

public class TestHomePage extends TestBasePage {

    @Test
    public void testInitial() {

        homePage.ingrijireCorp.click();
        homePage.numarProduse.getSize();
        homePage.filtruInchis.click();
        webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
        homePage.celMaiMarePret.click();
        homePage.firstItemName.getText();
        homePage.firstItem.click();
        homePage.backButton.click();
        homePage.news.click();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        assert homePage.numapProduse2.isDisplayed();
        homePage.secondItem.click();
        assert homePage.addToCartButton.isDisplayed();
        homePage.addToCartButton.click();
        assert homePage.cartIcon.isDisplayed();
        homePage.cartIcon.click();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        cartPage.cantitate.click();
        cartPage.cantitate.click();
        assert cartPage.price.isDisplayed();
        assert cartPage.puncte.isDisplayed();
        homePage.pentruEl.click();
        homePage.accesorii.click();
        homePage.ceasuri.click();
        webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
        homePage.lastWatch.click();
        System.out.println(homePage.rating);
        assert homePage.eMail.isDisplayed();
        homePage.eMail.click();

    }
}
