import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import util.GenericMethods;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CalendarTable {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.apsrtconline.in/oprs-web/");
        GenericMethods.takesScreenshot(driver);
        driver.findElement(By.id("txtJourneyDate")).click();
        GenericMethods.takesScreenshot(driver);
       List<WebElement> dates =  driver.findElements(By.xpath("(//table)[1]//td//a"));
        GenericMethods.takesScreenshot(driver);
       for(WebElement ele : dates)
       {
           System.out.println(ele.getCssValue("background"));
          if(ele.getCssValue("background").contains("255, 0, 0"))
           {
               ele.click();
               break;
           }
       }

       WebElement ele =  driver.findElement(By.className("fb_image"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",ele);
        //ele.click();
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()",ele);

    }
}
