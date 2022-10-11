package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SliderElement {

    public WebElement Nokiaslider() {
        return Hooks.driver.findElement(By.cssSelector("a[rel=\"0\"]"));
    }
    public WebElement Iphoneslider() {
        return Hooks.driver.findElement(By.cssSelector("a[rel=\"1\"]"));
    }
}

