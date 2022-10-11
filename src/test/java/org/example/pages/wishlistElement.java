package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class wishlistElement {
    public List<WebElement> item_user_wants()
    {

        return Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
    }
    public WebElement content()
    {

        return Hooks.driver.findElement(By.className("content"));
    }

    public WebElement wishlist_icon()
    {
        return Hooks.driver.findElement(By.className("ico-wishlist"));
    }
    public WebElement quantity()
    {
        return Hooks.driver.findElement(By.className("qty-input"));
    }
    public WebElement bar()
    {

        return Hooks.driver.findElement(By.className("bar-notification"));
    }
}
