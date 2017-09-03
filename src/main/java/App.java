import com.sun.javafx.image.BytePixelSetter;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class App {
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver",
            "chromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver ();
        driver.get ("http://google.ru");
        System.out.println (driver.getTitle ());
        System.out.println (driver.getCurrentUrl ());
        driver.findElement (By.id ("gs_htif0"));
        //driver.findElement (By.className ("gsfi"));
        //driver.findElement (By)
        driver.quit ();

    }
}