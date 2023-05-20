package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.EbayHome;
import utilities.ReadConfigFiles;

public class ValidateSellOption {

    private static final Logger LOGGER = LogManager.getLogger(ValidateSellOption.class);
    WebDriver driver = Hooks.driver;

    @Given("^user can see the home page$")
    public void navigateToHomePage(){
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("AppURL"));

        LOGGER.info("user is on the home page");

    }

    @When("^user click sell option")
    public void clickSell(){
        new EbayHome(driver)
                .clickingSellButtonOption();
        LOGGER.info("user clicks the sell button");
    }

    @And("^Click list an item")
    public void clickList(){
        new EbayHome(driver)
                .clickingMakeAListOption();
        LOGGER.info("user can click the list item");
    }

    @Then("^Start your listing will appear$")
    public void validateSellOption(){
        new EbayHome(driver)
                .startYourListingOption();
        LOGGER.info("user can see your listing option");
    }
}
