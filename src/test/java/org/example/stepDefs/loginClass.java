package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.loginElements;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class loginClass {



    loginElements ele = new loginElements();
    SoftAssert soft = new SoftAssert();

    @Given("user go to login page")
    public void open_browser() throws InterruptedException {

        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));


    }


    @And("went to login page")
    public void went_to_login_page()
    {
        ele.loginup().click(); }

    @When("^user enters \"(.*)\" and \"(.*)\"$")
    public void valid_data(String username, String password) throws InterruptedException {
        ele.presteps(username,password);
        Thread.sleep(1000);
    }

    @And("click on login button")
    public void click_login() throws InterruptedException {
        ele.button().click();
        Thread.sleep(3000);
    }

    @Then("user login successfully")
    public void check_success() throws InterruptedException {

        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
        soft.assertFalse(Hooks.driver.getCurrentUrl().contains("login"));

        Thread.sleep(1000);
    }

    @Then("user cannot login")
    public void check_fail() throws InterruptedException {
        soft.assertTrue(ele.msgerror().getText().contains("unsuccessful"));

        Thread.sleep(1000);
    }




}
