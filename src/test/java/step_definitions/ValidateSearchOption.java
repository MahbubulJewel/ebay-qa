package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.EbayHome;
import utilities.ReadConfigFiles;

public class ValidateSearchOption {
    private static Logger LOGGER = LogManager.getLogger(ValidateSearchOption.class);
    WebDriver driver = Hooks.driver;

    @Given("^user open the browser$")
    public void openBrowser(){
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("AppURL"));
        LOGGER.info("user can open the browser");

    }

    @When("^user on the home page")
    public void NavigateToHomepage(){
        LOGGER.info("user is on the home page");
    }

    @Then("^user can see the search option$")
    public void validateSearchOption(){
        new EbayHome(driver)
                .validateTheSearchOption();
        LOGGER.info("user can see the search option");
    }
}
