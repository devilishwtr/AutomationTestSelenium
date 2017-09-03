import com.sun.javafx.image.BytePixelSetter;
import jdk.nashorn.internal.runtime.ECMAException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class App {
    public static void main (String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver",
            "chromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver ();
        driver.get ("http://google.ru");
//        System.out.println (driver.getTitle ());
//        System.out.println (driver.getCurrentUrl ());
//        //поиск элемента по id, передаем строку Hello world
//        driver.findElement (By.id ("lst-ib")).sendKeys ("Hello world");
//        //передаем кнопку Enter;
//        //driver.findElement (By.id ("lst-ib")).sendKeys(Keys.RETURN);
//        driver.findElement (By.className ("lsb")).click ();
//        //driver.findElement (By)
//        //ожидание перед следующим действием
//        driver.get ("htpp://google.ru");
        driver.findElement (By.className ("gsst_a")).click ();
        Thread.sleep (500);
        driver.findElement (By.id ("K71")).click ();
        Thread.sleep (500);
        driver.findElement (By.id ("K72")).click ();
        Thread.sleep (500);
        driver.findElement (By.id ("K66")).click ();
        Thread.sleep (500);
        driver.findElement (By.id ("K68")).click ();
        Thread.sleep (500);
        driver.findElement (By.id ("K84")).click ();
        Thread.sleep (500);
        driver.findElement (By.id ("K78")).click ();
        Thread.sleep (500);
        driver.findElement (By.id ("K32")).click ();
        Thread.sleep (500);
        driver.findElement (By.id ("K86")).click ();
        Thread.sleep (500);
        driver.findElement (By.id ("K66")).click ();
        Thread.sleep (500);
        driver.findElement (By.id ("K72")).click ();
        Thread.sleep (500);

        driver.quit ();

    }
}