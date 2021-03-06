package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.LandingPage;


public class BaseTest {

    private WebDriver driver;
    LandingPage landingPage;

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pikhterova_y\\IdeaProjects\\exam29032019\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        landingPage = new LandingPage(driver);
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
