package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class currencyElements {

    public WebElement currencylist() {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> allproducts() {
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }


}
