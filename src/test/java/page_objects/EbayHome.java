package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EbayHome {

    private static final By EbayLogo = By.id("gh-l-h1");
    private static final By SearchOption = By.id("gh-btn");
    private static final By ClickShopByCategory = By.id("gh-shop-a");
    private static final By MotorButton = By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/h3[1]/a");
    private static final By ElectronicButton = By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[2]/h3[1]/a");
    private static final By CollectiblesAndArtButton = By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[3]/h3[1]/a");
    private static final By ClothingButton = By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/h3[2]/a");
    private static final By ClickSellButton = By.xpath("//*[@id=\"gh-p-2\"]/a");
    private static final By ClickMakeAList = By.xpath("//*[@id=\"image_banner_1\"]/div/div/a");
    private static final By StartYourListing = By.xpath("//*[@id=\"mainContent\"]/div/div/h1");
    private static final By SearchItem = By.id("gh-ac");
    private static final By ClickSearchOption = By.id("gh-btn");
    private static final By SearchItemAppear = By.xpath("//*[@id=\"mainContent\"]/div[1]/div[2]/div[2]/div[1]/div[1]/h1/span[2]");
    public WebDriver driver;
    private static final Logger LOGGER = LogManager.getLogger(EbayHome.class);
    public EbayHome(WebDriver driver) {
        this.driver = driver;
    }

    public void validateTheEbayLogo() {
        LOGGER.debug("Validate the ebay logo");
        AssertThat.elementAssertions(driver, EbayLogo).elementIsDisplayed();
    }

    public void validateTheSearchOption(){
        LOGGER.debug("Validate the search option is appear");
        AssertThat.elementAssertions(driver, SearchOption).elementIsDisplayed();
    }

    public void clickingShopByCategory(){
        LOGGER.debug("Click the shop by category button");
        ActOn.element(driver, ClickShopByCategory).click();
    }

    public EbayHome motorButtonOption(){
        LOGGER.debug("Motor button will appear");
        AssertThat.elementAssertions(driver, MotorButton).elementIsDisplayed();
        return this;
    }

    public EbayHome electricButtonOption() {
        LOGGER.debug("Electric button will appear");
        AssertThat.elementAssertions(driver, ElectronicButton).elementIsDisplayed();
        return this;
    }

    public EbayHome collectiblesAndArtButtonOption() {
        LOGGER.debug("Collectibles and art button will appear");
        AssertThat.elementAssertions(driver, CollectiblesAndArtButton).elementIsDisplayed();
        return this;
    }

    public void clothingButtonOption() {
        LOGGER.debug("Clothing button will appear");
        AssertThat.elementAssertions(driver, ClothingButton).elementIsDisplayed();
    }

    public void clickingSellButtonOption(){
        LOGGER.debug("User clicks the sell option");
        ActOn.element(driver, ClickSellButton).click();
    }
    public void clickingMakeAListOption(){
        LOGGER.debug("User clicks the make a list option");
        ActOn.element(driver, ClickMakeAList).click();
    }

    public void startYourListingOption(){
        LOGGER.debug("User can see start your listing");
        AssertThat.elementAssertions(driver, StartYourListing).elementIsDisplayed();
    }

    public void searchForItem() {
        LOGGER.debug("user search for iphone");
        ActOn.element(driver, SearchItem).setValue("iphone");
    }

    public void clickForSearch() {
        LOGGER.debug("user clicks the search option");
        ActOn.element(driver, ClickSearchOption).click();
    }

    public void validateSearchItem() {
        LOGGER.debug("user can see the search item");
        AssertThat.elementAssertions(driver, SearchItemAppear).elementIsDisplayed();
    }
}

