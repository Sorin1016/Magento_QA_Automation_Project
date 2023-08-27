package tests;
import constants.ConstantData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get(ConstantData.URL);
    }

    @AfterMethod
    public void closeDriver() {
        this.driver.close();
    }
}
