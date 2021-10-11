import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Collections;

public class DesiredCapabilitiesDemo {

    public static void main(String[] args) {

        /*DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(InternetExplorerDriver);*/

        ChromeOptions cp = new ChromeOptions();
        cp.addArguments("start-maximized");
        cp.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        cp.setExperimentalOption("useAutomationExtension", false);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(cp);
    }
}
