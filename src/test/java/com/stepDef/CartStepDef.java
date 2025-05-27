package com.stepDef;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.driverManager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.pages.HomePage;

import java.time.Duration;

public class CartStepDef {
    public WebDriver driver;
    private HomePage hp;

    @Before
    public void setUp() {
        driver = DriverManager.driverSetUp("chrome");
    }

    @Given("User is on HomePage")
    public void user_is_on_home_page() {
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        hp = new HomePage(driver);
    }

    @When("User searches a perticular vegitables")
    public void user_searches_a_perticular_vegitables() {
        hp.searchVegitables("tomato");
    }

    @When("add more than {int} vegitables with quantity more than {int}")
    public void add_more_than_vegitables_with_quantity_more_than(Integer int1, Integer int2) {
        hp.searchVegitables("tomato");
    }

    @Then("User Validate the selected vegitables are added to the cart")
    public void user_validate_the_selected_vegitables_are_added_to_the_cart() {
        hp.searchVegitables("tomato");
    }
}
