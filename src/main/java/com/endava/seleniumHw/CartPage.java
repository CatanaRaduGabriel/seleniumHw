package com.endava.seleniumHw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by racatana on 8/4/2016.
 */
public class CartPage  {

    @FindBy(xpath = "//input[@class='k-formatted-value prod-quantity k-input']")
    WebElement cantitate;

    @FindBy(xpath = "//span[@class='total-bp']")
    WebElement puncte;

    @FindBy(xpath = "//span[@class='price']/span[@class='value']")
    WebElement price;

}
