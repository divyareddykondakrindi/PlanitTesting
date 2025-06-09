package org.example;

import org.example.Pages.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://magento.softwaretestingboard.com/women.html");
        Actions ac = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//a[@id =\"ui-id-4\"]//span[@class = \"ui-menu-icon ui-icon ui-icon-carat-1-e\"]"));
        ac.moveToElement(ele).build().perform();
        WebElement tops = driver.findElement(By.xpath("//a[@id =\"ui-id-9\"]//span[@class = \"ui-menu-icon ui-icon ui-icon-carat-1-e\"]"));
        ac.moveToElement(tops).build().perform();
        WebElement tees = driver.findElement(By.id("ui-id-13"));
        ac.moveToElement(tees).build().perform();
        tees.click();
        List<WebElement> countofItems = driver.findElements(By.cssSelector("div[class =\"product details product-item-details\"]"));
        int count = countofItems.size();
        System.out.println(count);
       driver.findElement(By.xpath("//li[2]/div/div/strong/a[1]")).click();
       driver.findElement(By.id("option-label-size-143-item-168")).click();
       driver.findElement(By.id("option-label-color-93-item-53")).click();
//        ProductPage p = new ProductPage();



    }
}