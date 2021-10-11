import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {


    @Test(dataProvider = "dataSender")
    public void testGoogle(String query,String data) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys(query);
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys(data);

    }

        @DataProvider
        public Object[][] dataSender()
        {

            Object[][] obj = new Object[2][2];
            obj[0][0]= "Automation";
            obj[0][1]= "Selenium";
            obj[1][0] ="Python";
            obj[1][1]="Java script";

            return  obj;
        }


}
