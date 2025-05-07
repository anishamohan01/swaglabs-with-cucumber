package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class LoginSteps {

    static WebDriver driver;
    LoginPage login;

    @Given("I launch the browser and open the login page")
    public void i_launch_the_browser_and_open_the_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        login = new LoginPage(driver);
    }

    
    @When("I login using valid credentials")
    public void i_login_using_valid_credentials() {
        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLogin();
    }

    @Then("I should land on the product page")
    public void i_should_land_on_the_product_page() {
        assertTrue(driver.getCurrentUrl().contains("inventory"));
        driver.quit();
    }
}
