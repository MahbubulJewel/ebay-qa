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

public class ValidateEbayLogo {
    private static Logger LOGGER = LogManager.getLogger(ValidateEbayLogo.class);
    WebDriver driver = Hooks.driver;

    @Given("^user open the website$")
    public void OpenWebsite(){
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("AppURL"));

        LOGGER.info("User can open the browser");
    }

    @When("^user is on the ebay home page")
    public void navigateToHomePage(){
        LOGGER.info("user is on the home page");
    }

    @Then("^user can see the ebay logo$")
    public void validateEbayLogo(){
        new EbayHome(driver)
                .validateTheEbayLogo();
        LOGGER.info("user can see the ebay logo");
    }
}
