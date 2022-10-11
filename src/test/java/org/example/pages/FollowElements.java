package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FollowElements {
    public WebElement facebook()
    { return Hooks.driver.findElement(By.className("facebook"));}
    public WebElement twitter()
    { return Hooks.driver.findElement(By.className("twitter"));}
    public WebElement rss()
    { return Hooks.driver.findElement(By.className("rss"));}
    public WebElement youtube()
    { return Hooks.driver.findElement(By.className("youtube"));}

}
