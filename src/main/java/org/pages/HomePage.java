package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "search-keyword")
    private WebElement searchBox;

    @FindBy(className = "increment")
    private WebElement increamentButton;


    public void searchVegitables(String input)
    {
        searchBox.sendKeys(input);
        increamentButton.click();
    }
}
