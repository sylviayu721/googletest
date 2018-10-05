package com.sylviayu.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.sylviayu.util.Util;
import com.sylviayu.util.PageProperties;
import com.sylviayu.util.Logger;

public abstract class TCBase {
	
    private static String CHROME_DRIVER_FILE_PATH = "assets\\chromedriver.exe";
    private static String _pagePropertiesFileName = "assets\\page_properties.json";
    
    //Properties mProp;
    WebDriver mDriver;
    static PageProperties mProp=Util.readPageProperties(_pagePropertiesFileName);  
    
    @BeforeMethod(description = "Getting test Method Name")
    void beforeTest(Method method) throws Exception  {
    	Logger.Debug("Before Method");
        //Util.loadProperties();
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_FILE_PATH);
        mDriver = new ChromeDriver();
        Logger.Debug("---Running test case " + method.getName() + "----");
        mDriver.manage().window().maximize();
        mDriver.navigate().to(mProp.common.mainUrl);
    }
    
    @AfterMethod(description = "Tear Down method")
    void afterTest(Method method)throws Exception{
    	Logger.Debug("Tear down");
    	mDriver.quit();
        Logger.Debug("---test case " + method.getName() + " : SUCCEED!!!!----");
    }

}
