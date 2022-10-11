package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.regElements;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

public class regClass {

    regElements ele = new regElements();
    SoftAssert soft = new SoftAssert();

    @Given("user go to register page")
    public void username_opened_browser() throws InterruptedException {

        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
    }

    @When("user select gender type")
    public void selectGender() throws InterruptedException {
        System.out.println("gender reveal");
        ele.gender().click();

    }

    @Then("click on reg button")
    public void regclick() throws InterruptedException {

        ele.Registerbutton().click();

    }

    @And("user enter first name and last name")
    public void FirstAndLastName() throws InterruptedException {
        ele.Firstname().sendKeys("test");
        ele.Lastname().sendKeys("automation");
        //Thread.sleep(2000);

    }

    @And("user enter date of birth")
    public void dob() throws InterruptedException {
        ele.Day().sendKeys("20");
        ele.Month().sendKeys("10");
        ele.Year().sendKeys("1990");
       // Thread.sleep(2000);

    }

    @And("user enter email field")
    public void email() throws InterruptedException {
        ele.Email().sendKeys("blablablablabla@gmgm.com");
        //Thread.sleep(2000);

    }
    @And("user fills Password fields")
    public void password() throws InterruptedException {
        ele.password().sendKeys("p@ssw0rd");
        ele.Repassword().sendKeys("p@ssw0rd");


    }
    @And("user clicks on confirm reg button")
    public void regbtn() throws InterruptedException {
        ele.Confirmbutton().click();

    }

    @Then("success message is displayed")
    public void checksuccess() throws InterruptedException {
        Thread.sleep(2000);
        soft.assertTrue(ele.outputmessage().getText().contains("completed"));
        Thread.sleep(1000);
    }


}



