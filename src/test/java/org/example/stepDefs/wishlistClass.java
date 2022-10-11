package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.wishlistElement;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class wishlistClass {
    SoftAssert soft = new SoftAssert();
    wishlistElement ele = new wishlistElement();
    @Given("user is in the homepage for htc")
    public void homepage()
    {
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));

    }
    @When("user clicks on like icon for htc mobile")
    public void choose_htc()
    {
        ele.item_user_wants().get(2).click();
    }
    @Then("success message is displayed above")
    public void check_success_msg()
    {
        soft.assertTrue(ele.content().getText().contains("added"));

    }


    @And("message is green")
    public void check_if_green()
    {


       String actual = ele.bar().getCssValue("background-color");
        String actual_hex = Color.fromString(actual).asHex();
        soft.assertEquals( actual_hex,"#4bb07a");
        soft.assertAll();

    }
    @And("user clicks on wishlist")
    public void click_on_wishlist_icon() throws InterruptedException {
        Thread.sleep(5000);
        ele.wishlist_icon().click();
    }
    @Then("user finds more than 1 product")
    public void check_quantity()
    {
        int num  = Integer.parseInt(ele.quantity().getAttribute("value"));


        soft.assertTrue(num >= 1);
        soft.assertAll();
    }
}
