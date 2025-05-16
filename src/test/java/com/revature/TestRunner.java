package com.revature;

import com.revature.pom.HomePage;
import com.revature.pom.LoginPage;
import com.revature.pom.RegistrationPage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "com.revature.step",
        plugin = {"pretty", "html:src/test/resources/reports/Cucumber-Report.html"}
)
public class TestRunner {
    // Here is where we will create our test resources: make them static for easy access in our steps
    public static WebDriver driver;
    public static LoginPage loginPage;
    public static HomePage homePage;
    public static RegistrationPage registrationPage;

    @BeforeClass
    public static void setup() throws InterruptedException {
        // Here we initialize the resources and perform any other setup configurations
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        loginPage = new LoginPage(driver, "Planetarium Login");
        registrationPage = new RegistrationPage(driver, "Account Creation");
        homePage = new HomePage(driver, "Home");
    }
    @AfterClass
    public static void tearDown(){
        if (driver != null) driver.quit();
    }
}
