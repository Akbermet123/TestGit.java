package com.talentlms.UI.driverFactory;


import com.talentlms.UI.dataProvider.ConfigReader;
import org.openqa.selenium.WebDriver;


public class Driver {
    private  Driver(){
        // SingleTon pattern
    }

    private static WebDriver driver;

    public  static WebDriver getDriver(){
        if(driver==null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                case "chrome":
                    driver =ChromeWebDriver.loadPromDriver();
                    break;
                case "firefox":
                    driver=FirefoxWebDriver.loadFirefoxDriver();
                    break;
                case "edge":
                    driver =EdgeWebDriver.loadEdgeDriver();
                    break;
                default:
                    driver=ChromeWebDriver.loadPromDriver();
            }
        }

        return driver;
    }

    public static void closeDriver(){
        try {
            if(driver != null){
                driver.close();
                driver.quit();
                driver=null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
