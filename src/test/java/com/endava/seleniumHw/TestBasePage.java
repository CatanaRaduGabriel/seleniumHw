package com.endava.seleniumHw;

import com.gargoylesoftware.htmlunit.Page;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by racatana on 8/4/2016.
 */
public class TestBasePage {
    public static WebDriver webDriver;
    protected HomePage homePage;
    protected CartPage cartPage;

    @BeforeClass
    public static void setUp(){
        webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://ro.oriflame.com");
    }
    @Before
    public void initPageObjects(){
        homePage = PageFactory.initElements(webDriver, HomePage.class);
    }
    public void initializePage(){
        cartPage = PageFactory.initElements(webDriver,CartPage.class);
    }
}
