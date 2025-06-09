package org.example.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class reusablemethod {
    public static void movetoElement (WebDriver driver, By element){
        Actions ac = new Actions(driver);
        ac.moveToElement(driver.findElement(element)).build().perform();
    }
    public static void duration(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }



}
