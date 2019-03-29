package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BasePage {

    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchField;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isPageLoaded() {
        return searchField.isDisplayed();
    }

    public SearchPage startSearch(String searchTerm) {
        searchField.sendKeys(searchTerm + Keys.ENTER);
        return new SearchPage(driver);
    }

}
