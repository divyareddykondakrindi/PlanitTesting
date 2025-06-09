package org.example.Pages;

import org.example.utility.reusablemethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends reusablemethod{
   // WebDriver driver;
   private WebDriver driver;


    private By productsList = By.cssSelector("div[class =\"product details product-item-details\"]");
    private By secondProduct = By.xpath("//li[2]//strong/a");
    private By sizeM = By.id("option-label-size-143-item-168");
    private By colorBlack = By.id("option-label-color-93-item-53");
   private  By alertmessage =By.cssSelector("[data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]");

   By submitbutton = By.cssSelector("button[title =\"Add to Cart\"]");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
   public void clickonButton(){
       driver.findElement(submitbutton).click();
   }
   public String getAlertmessage(){
       String message = driver.findElement(alertmessage).getText();
       return message;
   }


    public int getProductCount() {
        reusablemethod.duration(driver);
       List<WebElement>items = driver.findElements(productsList);
       return items.size();
    }

    public void selectSecondProduct() {
        driver.findElement(secondProduct).click();
    }

    public void selectSize() {
        driver.findElement(sizeM).click();
    }

    public void selectColor() {
        driver.findElement(colorBlack).click();
    }
}
