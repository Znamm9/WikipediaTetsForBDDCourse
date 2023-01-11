package pageObjects;

import io.cucumber.plugin.event.WriteEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;

public class SearchResultsPage extends BasePage{
    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAreaElement() {
        return getElementByXpath("//a[@href='/wiki/List_of_countries_and_dependencies_by_area']/../../td");
    }
}
