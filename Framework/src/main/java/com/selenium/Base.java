package com.selenium;





import com.Action.Headeraction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.commands.CaptureNetworkTrafficCommand;

/**
 * Created by in.Babushaik on 7/24/2017.
 */
public class Base {

    protected static WebDriver driver;
    public Headeraction headeraction;
    public static String Url = new Propertyreader().readProperty("Url");

    public Base(){
        initpages();
    }


public void initpages() {

    headeraction = new Headeraction (driver);
     if (driver == null)

         createNewDriverInstance();
    }

    public void createNewDriverInstance(){
        String browser = new Propertyreader().readProperty("browser");

        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:\\Framework\\Driver\\Chrome\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.navigate().to(Url);

        } else{
            System.out.println("can't read browser type");
        }

    }
    public WebDriver getDriver(){
        return driver;
    }
    public void destroyDriver(){
        driver.quit();
        driver = null;
    }
}
