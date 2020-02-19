package tests;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.MainPage;
import tests.abstractBaseTest.TestBase;

@CucumberOptions(
        strict = true,
        monochrome = true,
        features = "src/test/resources",
        plugin = {"pretty"}
)

public class MainTest extends TestBase {

    private MainPage mainPage;

    @Given("^Open the app$")
    public void setUpPage() {
        mainPage = new MainPage(driver);
    }

    @When("^set a value of (.*) bucks$")
    public void setAValue(String arg) {
        mainPage.typeAmount(arg);
        System.out.format("Thread ID - %2d - %s. \n",
                Thread.currentThread().getId(), arg);
    }

    @When("^click calculate button$")
    public void clickCalculate() {
        mainPage.clickCalculateButton();
    }

    @Then("^button is displayed$")
    public void buttonDisplayed() {
        Assert.assertTrue(mainPage.buttonDisplayed());
    }

    @Then("^validate total should be (.*)$")
    public void validateTotal(String total) {
        Assert.assertEquals(mainPage.getTotalBill(),total);
    }

    @Then("^validate tip value should be (.*)$")
    public void validateTipAmount(String tip) {
        Assert.assertEquals(mainPage.tipAmount(),tip);
    }
}