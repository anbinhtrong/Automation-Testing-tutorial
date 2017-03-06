import com.browsers.test.ChromeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by anbin on 3/4/2017.
 */
public class MainProgram {

    public static void main(String[] args) throws Exception {

        ChromeTest chromeBrowser = new ChromeTest();
        //chromeBrowser.callIt();
        chromeBrowser.clearCache();
    }
}