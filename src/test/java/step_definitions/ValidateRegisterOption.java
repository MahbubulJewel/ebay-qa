package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.EbayLogin;
import utilities.ReadConfigFiles;

public class ValidateRegisterOption {

    private static Logger LOGGER = LogManager.getLogger(LoginSteps.class);
    WebDriver driver = Hooks.driver;

    @Given("^user is on the home page$")
    public void navigateToLoginPage(){
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("AppURL"));

        LOGGER.info("User is in the login page");
    }

    @When("^user enter first name$")
    public void enterFirstName(){
        new EbayLogin(driver)
                .clickingTheRegisterButton()
                .enterFirstName();
        LOGGER.info("user has entered first name");
    }

    @And("^user enter last name$")
    public void enterLastName(){
        new EbayLogin(driver)
                .enterLastName();
        LOGGER.info("user has entered last name");
    }

    @And("^enter valid new email address$")
    public void enterValidEmail(){
        new EbayLogin(driver)
                .enterValidEmailAddress();
        LOGGER.info("user has entered valid email address");
    }

    @And("^enter valid password$")
    public void enterPassword(){
        new EbayLogin(driver)
                .enterValidPassword();
        LOGGER.info("user has entered valid password");
    }

    @Then("^create account option will active$")
    public void createNewAccount(){
        new EbayLogin(driver)
                .validateTheCreateAccountOption();
        LOGGER.info("user is able to create new account");
        ActOn.browser(driver).closeBrowser();
    }

        @And("^enter used email address$")
        public void enterDuplicateEmail(){
            new EbayLogin(driver)
                    .enterExistingEmail();
            LOGGER.info("user has entered existing email address");
        }

        @Then("^user will get error message$")
        public void errorMessage(){
            new EbayLogin(driver)
                    .clickPassword()
                    .validateErrorMessage();
            LOGGER.info("user can see the error message");
    }
}
