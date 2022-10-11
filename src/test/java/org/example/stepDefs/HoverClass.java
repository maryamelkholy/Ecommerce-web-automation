package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HoverElements;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class HoverClass {
    SoftAssert soft = new SoftAssert();
    HoverElements ele = new HoverElements();
    String chosenElement="";
     @Given("user is in the homepage")
    public void in_homepage()
     {
         soft.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
     }
     @When("main menu is clicked")
    public void click_on_computers()
     {
         Actions actions = new Actions(driver);
         actions.moveToElement(ele.mainMenu()).perform();

     }
     @And("first choice is chosen from submenu")
    public void click_on_laptops()
     {
        chosenElement = ele.subMenu().getText();
       ele.subMenu().click();
     }
     @Then("user is directed to the intended page")
    public void check_user_reached_safely()
     {

         soft.assertTrue(chosenElement.contains(ele.subCategoryTitle().getText().toLowerCase().trim()));
         soft.assertAll();
     }




}
