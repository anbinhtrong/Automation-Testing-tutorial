import com.browsers.test.ChromeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by anbin on 3/4/2017.
 */
public class FirstTestCase {

    public static void main(String[] args) throws Exception {
        String exePath = ".//libs//browser-drivers//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        ChromeTest chromeBrowser = new ChromeTest();
        chromeBrowser.callIt();
    }
}