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

public class VerifySearchIntelligence {

    private static Logger LOGGER = LogManager.getLogger(VerifySearchIntelligence.class);
    WebDriver driver = Hooks.driver;

    @Given("^user is on ebay website home page$")
    public void navigateToHomePage(){
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("AppURL"));
        LOGGER.info("User is on home page");
    }

    @When("^user search for SearchItem$")
    public void searchNewItem(){
        new EbayHome(driver)
                .searchForItem();
        LOGGER.info("user can search the item");
    }

    @And("^Click the search option$")
    public void clickTheSearchOption(){
        new EbayHome(driver)
                .clickForSearch();
        LOGGER.info("user clicks the search button");
    }

    @Then("^user can see result for the SearchItem$")
    public void validateSearchItem(){
        new EbayHome(driver)
                .validateSearchItem();
        LOGGER.info("user can see the search item");
    }
}
