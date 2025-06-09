import org.example.Pages.HomePage;
import org.example.Pages.ProductPage;
import org.example.utility.reusablemethod;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class HomePageTests extends BaseTest {

    @Test
    public void verifyProductsCount() {

        HomePage menu = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        menu.navigateToTees();

        int count = productPage.getProductCount();

      assertEquals(12, count);

    }
    @Test(dependsOnMethods ="verifyProductsCount" )
    public void verifyAlertMessage(){
        ProductPage productPage = new ProductPage(driver);
        productPage.selectSecondProduct();
        productPage.selectSize();
        productPage.selectColor();
        productPage.clickonButton();
        String message =productPage.getAlertmessage();
        Assert.assertEquals(
                "You added Gwyn Endurance Tee to your shopping cart.", message);
    }

}
