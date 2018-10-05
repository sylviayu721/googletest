package com.sylviayu.pages;

import java.sql.Driver;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.sylviayu.util.Util;
import com.sylviayu.util.Logger;
import com.sylviayu.util.PageProperties;
import com.sylviayu.util.PageProperties.SearchResult;

public class SearchResultPage extends WebPage {
    SearchResult _prop;

    public SearchResultPage(WebDriver driver,PageProperties properties) {
        super(driver);
        _prop = properties.searchResult;
    }

    /**
     * verify below main UI elements being visible
     *  1. New Transaction button
     *  2. Account Summary Section
     *  3. My Transactions Section
     *  4. Recent Transactions Section
     */
    public void verifyUI() {
        verifyElementVisible(_prop.tabAll);
        verifyElementVisible(_prop.tabImages);
        verifyElementVisible(_prop.tabVideos);
        verifyElementVisible(_prop.tabNews);
        verifyElementVisible(_prop.tabShopping);
    }

    /**
     * verify Url to be https://www.google.ca/search?q=selenium&source=lnms&sa=X&ved=0ahUKEwjR3cOhye3dAhVFpFkKHdI8CGAQ_AUI1gEoAA&biw=1076&bih=939
     */
    public void verifyUrl() {
        Logger.Debug("verify url contains - " + "Selenium");
        Assert.assertTrue(mDriver.getCurrentUrl().contains("Selenium"));
    }

}
