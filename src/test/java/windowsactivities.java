import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsactivities {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.navigate().to("https://facebook.com");
        driver.navigate().back();
       driver.navigate().forward();
        driver.navigate().refresh();


    }
}
