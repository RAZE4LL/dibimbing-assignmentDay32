package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverManager;

public class TokopediaPage extends BasePage {

    private final By imagePopupAds = By.className("css-dfpqc0");
    private final By buttonClosePopup = By.xpath("/html/body/div[5]/div[2]/article/div/div[2]/button");
    private final By buttonLogin = By.cssSelector("[data-testid='btnHeaderLogin']");
    private final By about = By.id("btnHeaderAbout");

    public TokopediaPage() {
        DriverManager.getDriver();
    }

    public void goToTokopediaPage() {
        goToUrl("https://tokopedia.com");
    }

    public void closePopupAds() {
        if (isElementPresent(imagePopupAds)) {
            clickElement(buttonClosePopup);
            System.out.println("Ads popup displayed and closed.");
        } else {
            System.out.println("No popup ads displayed.");
        }
    }

    public void clickLoginButton() {
        clickElement(buttonLogin);
        System.out.println("Button login is displayed and clicked.");
    }

    public void clickAbout() {
        clickElement(about);
        System.out.println("About button is clicked.");
    }
}