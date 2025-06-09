import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    public WebDriver driver;
    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        driver.navigate().to("https://magento.softwaretestingboard.com/women.html");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown(){
        if(driver != null){
            driver.quit();
        }
    }

}
