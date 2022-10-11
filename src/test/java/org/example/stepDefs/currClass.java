package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.currencyElements;
import org.example.pages.loginElements;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
public class currClass {


    currencyElements ele = new currencyElements();
    SoftAssert soft = new SoftAssert();

    @Given("user is in homepage")
    public void open_browser() throws InterruptedException {

        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
        soft.assertAll();

    }

    @When("user selects euro")
    public void select_euro()
    {

        Select select = new Select(ele.currencylist());
        select.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
    }

    @Then("currency has changed in all items")
    public void check_curr()
    {

        for(int i =0; i<ele.allproducts().size();i++)
        {
          soft.assertTrue(ele.allproducts().get(i).getText().contains("€"));

        }
        soft.assertAll();
    }
}
