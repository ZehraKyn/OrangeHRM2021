package com.OrangeHrm.base;

import io.cucumber.core.options.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public static WebDriver driver;

    public static WebDriver initializeDriver() {

        ConfigReader.readProperties("./src/test/resources/configuration/configuration.properties");
        String browser = ConfigReader.getProperty("browser").toLowerCase();
        switch (browser) {

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "opera":
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;
            default:
                throw new RuntimeException("Invalid browser name..");
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("url"));
        PageManager.initializePageObject();
        return driver;
    }
    public static void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}
