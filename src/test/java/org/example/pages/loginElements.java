package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginElements {


        public WebElement username()
        {
            return Hooks.driver.findElement(By.id("Email"));
        }
        public WebElement password()
        {
            return Hooks.driver.findElement(By.id("Password"));
        }
        public WebElement button( )
        {
            return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
        }


        public WebElement loginup ()
    {
        return Hooks.driver.findElement(By.className("ico-login"));
    }

    public WebElement msgerror ()
    {
        return Hooks.driver.findElement(By.className("message-error"));
    }

        public void presteps ( String username , String pass)
        {

            username().sendKeys(username);
            password().sendKeys(pass);

        }
    }


