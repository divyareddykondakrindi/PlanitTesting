package org.example.Pages;

import org.example.utility.reusablemethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class HomePage extends reusablemethod {
    private WebDriver driver;
    private Actions actions;

    private By women = By.cssSelector("[id=\"ui-id-4\"]");
    private By tops = By.xpath("//a[@id='ui-id-9']//span[contains(@class,'carat-1-e')]");
    private By tees = By.id("ui-id-13");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }

    public void navigateToTees() {
        reusablemethod.duration(driver);
       reusablemethod.movetoElement(driver, women);
       reusablemethod.movetoElement(driver, tops);
        reusablemethod.movetoElement(driver, tees);
        driver.findElement(tees).click();

    }
}
