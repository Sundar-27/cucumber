package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_steps {

    public  WebDriver driver;

    @Given("i launch the the application")
    public void i_launch_the_the_application() {
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/login.html");
        driver.manage().window().maximize();
    }

    @When("i click the the option'")
    public void i_click_the_the_option() {
        driver.findElement(By.xpath("//a[normalize-space()='Security Project']")).click();

    }

    @Then("i close the application")
    public void i_close_the_application() {
        driver.quit();

    }

}
