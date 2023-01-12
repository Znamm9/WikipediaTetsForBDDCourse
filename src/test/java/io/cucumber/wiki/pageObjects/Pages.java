package io.cucumber.wiki.pageObjects;

import io.cucumber.wiki.SearchResultsPage;
import org.openqa.selenium.WebDriver;

public class Pages extends BasePage{

    public HomePage homePage;
    public LoginPage loginPage;
    public SearchResultsPage searchResultsPage;


    public Pages(WebDriver driver) {
        super(driver);
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        searchResultsPage = new SearchResultsPage(driver);
    }
}
