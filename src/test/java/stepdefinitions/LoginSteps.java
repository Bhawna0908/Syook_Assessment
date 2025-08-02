package stepdefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginSteps {

    WebDriver driver;

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bugbash.syook.com/");
    }

    @When("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("User clicks on the Sign In button")
    public void user_clicks_on_the_sign_in_button() {
        driver.findElement(By.xpath("//button[@type='submit' and contains(text(),'Sign In')]")).click();
    }

    @Then("User should be navigated to the dashboard page")
    public void user_should_be_navigated_to_the_dashboard_page() throws InterruptedException {
        Thread.sleep(2000);
        String expectedUrl = "https://bugbash.syook.com/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "Login failed: URL mismatch.");
        driver.quit();
    }
}
