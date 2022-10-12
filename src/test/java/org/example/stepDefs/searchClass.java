package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.searchElements;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import org.example.stepDefs.Hooks;

public class searchClass {


    searchElements ele = new searchElements();

    String search = "";
    SoftAssert soft = new SoftAssert();
    @Given("user is inside homepage")
    public void open_browser_search() throws InterruptedException {
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
       ele.searchBar().click();


    }

    @When("^user enters product \"(.*)\"$")
    public void searchitembyname(String product_name)
    {
        ele.searchBar ().sendKeys(product_name);
        ele.searchbutton().click();
        search = product_name;

    }

    @Then("product shows by name")
    public void check_search_result_by_name()
    {
        for(int i =0; i<ele.productname().size();i++)
        {
            soft.assertTrue(ele.productname().get(i).getText().toLowerCase().contains(search));
        }
    soft.assertAll();
    }
    @Then("product shows by sku")
    public void check_search_result_by_sku()
    {

        for(int i =0; i<ele.productname().size();i++)
        {
            soft.assertTrue(ele.productname().get(i).getText().toLowerCase().contains(search));
        }
        soft.assertAll();
    }
}
