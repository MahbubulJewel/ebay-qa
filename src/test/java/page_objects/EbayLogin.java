package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EbayLogin {

    private static final By ClickRegister = By.xpath("//*[@id=\"gh-ug-flex\"]/a");
    private static final By EnterFirstName = By.id("firstname");
    private static final By EnterLastName = By.id("lastname");
    private static final By EnterEmail = By.id("Email");
    private static final By EnterPassword = By.id("password");
    private static final By CreateAccount = By.name("EMAIL_REG_FORM_SUBMIT");
    private static final By EnterDuplicateEmail = By.id("Email");
    private static final By ErrorEmail = By.id("Email_err");

    public WebDriver driver;
    private static final Logger LOGGER = LogManager.getLogger(EbayLogin.class);

    public EbayLogin(WebDriver driver) {
        this.driver = driver;
    }

    public EbayLogin clickingTheRegisterButton(){
        LOGGER.debug("user clicks the register in button");
        ActOn.element(driver, ClickRegister).click();
        return this;
    }

    public EbayLogin enterFirstName(){
        LOGGER.debug("user enters first name");
        ActOn.element(driver, EnterFirstName).setValue("Mahbubul");
        return this;
    }

    public EbayLogin enterLastName() {
        LOGGER.debug("user enters last name");
        ActOn.element(driver, EnterLastName).setValue("Jewel");
        return this;
    }

    public EbayLogin enterValidEmailAddress() {
        LOGGER.debug("user enters new email address");
        ActOn.element(driver, EnterEmail).setValue("mahbubulalam2802@gmail.com");
        return this;
    }

    public EbayLogin enterValidPassword() {
        LOGGER.debug("user validate create new account option");
        ActOn.element(driver, EnterPassword).setValue("Moonmimo1129");
        return this;
    }

    public EbayLogin validateTheCreateAccountOption() {
        LOGGER.debug("user can see create new account option");
        AssertThat.elementAssertions(driver, CreateAccount).elementIsDisplayed();
        return this;
    }

    public EbayLogin enterExistingEmail() {
        LOGGER.debug("user enters existing email address");
        ActOn.element(driver, EnterDuplicateEmail).setValue("ummemoon1109@gmail.com");
        return this;
    }

    public EbayLogin validateErrorMessage() {
        LOGGER.debug("user can see error message");
        AssertThat.elementAssertions(driver, ErrorEmail).elementIsDisplayed();
        return this;
    }

    public EbayLogin clickPassword() {
        LOGGER.debug("user clicks the password button");
        ActOn.element(driver, EnterPassword).click();
        return this;
    }


}
