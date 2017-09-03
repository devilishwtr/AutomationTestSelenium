import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;
/**
 * The test verifies that the number of links on the page is less than or equal to 10.
 */
public class GoogleSearchTest {
    @Test
    public void testGoogleLinkPerPage () throws InterruptedException {
        System.setProperty ("webdriver.chrome.driver",
                "chromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver ();
        Random random = new Random ();
        String query = random.toString ();
//        WebDriverWait driverWait = new WebDriverWait (driver, 30, 500);
        driver.get ("http://google.ru");
        driver.findElement (By.id ("lst-ib")).sendKeys (query);
        driver.findElement (By.id ("lst-ib")).sendKeys (Keys.RETURN);
//        driverWait.until (ExpectedConditions.presenceOfElementLocated (By.className ("rso")));
        Assert.assertTrue (driver.findElement (By.id ("rso")).findElements (By.className ("g")).size () <= 10);
            driver.quit ();
        }
    }
