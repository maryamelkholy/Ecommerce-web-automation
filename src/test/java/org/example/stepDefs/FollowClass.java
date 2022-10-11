package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.FollowElements;
import org.testng.asserts.SoftAssert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FollowClass {
    SoftAssert soft = new SoftAssert();
FollowElements ele = new FollowElements();
    @Given("user is in the homepage for follow")
    public void open_browser() throws InterruptedException {

        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
        soft.assertAll();

    }
    @When("user clicks on facebook icon")
    public void click_on_fb()
    {
        ele.facebook().click();
    }
    @When("user clicks on twitter icon")
    public void click_on_twitter()
    {
        ele.twitter().click();
    }
    @When("user clicks on rss icon")
    public void click_on_rss()
    {
        ele.rss().click();
    }
    @When("user clicks on youtube icon")
    public void click_on_youtube()
    {
        ele.youtube().click();
    }
    @Then("^user is directed to \"(.*)\" page$")
    public void check_page(String website)
    {
        Set<String> windows = Hooks.driver.getWindowHandles();
        Iterator<String> i = windows.iterator();
        String parent = i.next();
        String child = i.next();

        soft.assertTrue(Hooks.driver.switchTo().window(child).getCurrentUrl().contains(website));
        soft.assertAll();

    }

}
