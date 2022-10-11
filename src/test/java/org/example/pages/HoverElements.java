package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HoverElements {

    public WebElement mainMenu()
    { return Hooks.driver.findElement(By.cssSelector("a[href=\"/computers\"]"));}

    public WebElement subMenu()
    { return Hooks.driver.findElement(By.cssSelector("a[href=\"/desktops\"]"));}

    public WebElement subCategoryTitle()
    { return Hooks.driver.findElement(By.className("page-title"));}



}
