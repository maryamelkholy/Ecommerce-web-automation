package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class searchElements {


    public WebElement searchBar()
    {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public WebElement searchbutton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));


    }



    public List<WebElement> productname() {
        return Hooks.driver.findElements(By.className("product-title"));
    }

}
