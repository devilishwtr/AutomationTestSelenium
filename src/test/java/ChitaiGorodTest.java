import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * The test verifies that the number of links on the page is less than or equal to 10.
 */
public class ChitaiGorodTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty ("webdriver.chrome.driver","chromeDriver/chromedriver.exe");
        driver = new ChromeDriver ();
    }

    @Test
    public void testGoogleLinkPerPage () throws InterruptedException {
        driver.get ("http://google.ru");
        driver.findElement (By.id ("lst-ib")).sendKeys ("Рыбалка");
        driver.findElement (By.id ("lst-ib")).sendKeys (Keys.RETURN);
        Assert.assertTrue (driver.findElement (By.id ("rso")).findElements (By.className ("g")).size () <= 10);
    }

    @After
    public void tearDown() {
        if (driver != null) driver.quit ();
    }
}
