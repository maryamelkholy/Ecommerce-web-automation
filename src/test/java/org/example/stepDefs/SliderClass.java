package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.SliderElement;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

public class SliderClass {
    SoftAssert soft = new SoftAssert();
    SliderElement ele = new SliderElement();

    @Given("user is in the home")
    public void user_in_homepage() throws InterruptedException {

        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
    }
    @When("user clicks on nokia slider")
    public void check_if_it_is_nokia() throws InterruptedException {
        Thread.sleep(1000);
        ele.Nokiaslider().click();

    }
    @Then("user is directed to nokia page")
    public void directed_to_nokia_successfully()
    {
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("nokia-lumia-1020"));
        soft.assertAll();
    }
    @When("user clicks on iphone slider")
    public void check_if_it_is_iphone() throws InterruptedException {
        Thread.sleep(1000);
        ele.Iphoneslider().click();

    }
    @Then("user is directed to iphone page")
    public void directed_to_iphone_successfully()
    {
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("iphone-6"));
        soft.assertAll();
    }



}
