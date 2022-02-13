import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_FirstTry {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/ufimtsevtim/Downloads/chromedriver-2");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://yandex.ru");
        System.out.println(driver.getTitle());
        driver.quit();


    }


}
