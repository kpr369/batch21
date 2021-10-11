package util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GenericMethods {


    public static void takesScreenshot(WebDriver driver)
    {
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        file.renameTo(new File("Z:\\Selenium Softwares\\Screenshots\\screenshot"+ new SimpleDateFormat("dd-MM-yy-hh-mm-ss").format(new Date())+".jpeg"));

    }
}
