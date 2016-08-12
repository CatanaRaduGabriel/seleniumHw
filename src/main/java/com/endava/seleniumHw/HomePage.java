package com.endava.seleniumHw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by racatana on 8/3/2016.
 */
public class HomePage {
    CartPage cartPage ;

    @FindBy(xpath ="//a[@href='/bath-body']")
    WebElement ingrijireCorp;

    @FindBy(xpath = "//span[@class='total-count']")
    WebElement numarProduse;

    @FindBy(xpath = "//span[@class='k-input']")
    WebElement filtruInchis;

    @FindBy(xpath = "//li[@class='k-item' and @data-offset-index='2']")
    WebElement celMaiMarePret;

    @FindBy(xpath= "//a[@ href='/products/product?code=30083']")
    WebElement firstItemName;

    @FindBy(xpath = "//a[@href='/products/product?code=30083']")
    WebElement firstItem;

    @FindBy(xpath = "//span[@class='v-icon-side-menu-arrow-left']")
    WebElement backButton;

    @FindBy(xpath = "//a[@href='/bath-body/new']")
    WebElement news;

    @FindBy(xpath = "//span[@class='total-count']")
    WebElement numapProduse2;

    @FindBy(xpath = "//a[@href='/products/product?code=33010']")
    WebElement secondItem;

    @FindBy(xpath = "//button[@id='addToBasketButton']")
    WebElement addToCartButton;

    @FindBy(xpath = "//span[@class='v-icon-mini-bag']")
    WebElement cartIcon;

    @FindBy(xpath = "//a[@data-category='men']")
    WebElement pentruEl;

    @FindBy(xpath = "//a[@href='/men/accessories']")
    WebElement accesorii;

    @FindBy(xpath = "//a[@href='/men/accessories/watches']")
    WebElement ceasuri;

    @FindBy(xpath = "//a[@href='/products/product?code=27386']")
    WebElement lastWatch;

    @FindBy(xpath = "//div[@class='product-rating-container']//img[@title='5 / 5']")
    WebElement rating;

    @FindBy(xpath = "//a[@title='Email']")
    WebElement eMail;


    private WebDriver webDriver;
    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


}
