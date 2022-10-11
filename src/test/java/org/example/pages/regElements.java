package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class regElements {

    public WebElement Firstname()
    {
        return Hooks.driver.findElement(By.name("FirstName"));
    }

    public WebElement Lastname( )
    {
        return Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement password( )
    {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement Repassword( )
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }


    public WebElement Day( )
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }
    public WebElement Month( )
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }
    public WebElement Year( )
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }

    public WebElement gender( )
    {
        return Hooks.driver.findElement(By.id("gender-male"));
    }


    public WebElement Email( )
    {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement Confirmbutton( )
    {
        return Hooks.driver.findElement(By.id("register-button"));
    }

    public WebElement Registerbutton( )
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }

    public WebElement outputmessage ( )
    {
        return Hooks.driver.findElement(By.className("result"));
    }


}
