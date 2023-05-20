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

public class ShopByCategory {

    private static Logger LOGGER = LogManager.getLogger(ShopByCategory.class);
    WebDriver driver = Hooks.driver;

    @Given("^customer is on home page$")
    public void openBrowser(){
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("AppURL"));

        LOGGER.info("user can open the browser");

    }

    @When("^user clicks shop by category$")
    public void ClickShopByCategory(){
        new EbayHome(driver)
                .clickingShopByCategory();
        LOGGER.info("user has clicked the shop by category button");
    }

    @Then("^all option will appear$")
    public void validateAllOption(){
        new EbayHome(driver)
                .motorButtonOption()
                .electricButtonOption()
                .collectiblesAndArtButtonOption()
                .clothingButtonOption();
        LOGGER.info("user can see all option");
    }
}
