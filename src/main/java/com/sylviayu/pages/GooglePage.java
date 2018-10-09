package com.sylviayu.pages;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.sylviayu.util.PageProperties;
import com.sylviayu.util.PageProperties.Google;
import com.sylviayu.util.Util;


public class GooglePage extends WebPage {
	Google _prop;

    public GooglePage(WebDriver driver,PageProperties properties) {
        super(driver);
        _prop = properties.google;
    }

    public void inputSearchString(String value) {
        inputValue(_prop.inputSearch, value);
    }

    public void clickGoogleSearchButtonDropDown() {
        clickElement(_prop.btnGoogleSearchDropDown);
    }

    public void clickIFeelingLucky() {
        clickElement(_prop.btnIFeelLucky);
    }

    public void clickFrench() {
        clickElement(_prop.linkFrench);
    }

    public void clickAbout() {
        clickElement(_prop.linkAbout);
    }

    public void clickStore() {
        clickElement(_prop.linkStore);
    }

    public void clickGmail() {
        clickElement(_prop.linkGmail);
    }

    public void clickImages() {
        clickElement(_prop.linkImage);
    }

    public void clickAdvertising() {
        clickElement(_prop.linkAdvertising);
    }

    public void clickBusiness() {
        clickElement(_prop.linkBusiness);
    }

    public void clickPrivacy() {
        clickElement(_prop.linkPrivacy);
    }
    
    public void clickTerms() {
        clickElement(_prop.linkTerms);
    }
    
    public void clickSettings() {
        clickElement(_prop.linkPreferences);
        clickElement(_prop.tabSearchSettings);
    }
    
    public void verifySwichingToAboutPage() {
        switchToNewPage();
        String url = mDriver.getCurrentUrl();
        Assert.assertTrue(url.contains("about"));
    }
    
    public void verifySwichingToStorePage() {
        switchToNewPage();
        String url = mDriver.getCurrentUrl();
        Assert.assertTrue(url.contains("store"));
    }
    
    public void verifySwichingToGmailPage() {
        switchToNewPage();
        String url = mDriver.getCurrentUrl();
        Assert.assertTrue(url.contains("mail"));
    }

    public void verifySwichingToImagesPage() {
        switchToNewPage();
        String url = mDriver.getCurrentUrl();
        Assert.assertTrue(url.contains("img"));
    }
    
    public void verifySwichingToAdvertisingPage() {
        switchToNewPage();
        String url = mDriver.getCurrentUrl();
        Assert.assertTrue(url.contains("ads"));
    }
    
    public void verifySwichingToBusinessPage() {
        switchToNewPage();
        String url = mDriver.getCurrentUrl();
        Assert.assertTrue(url.contains("services"));
    }
    
    public void verifySwichingToPrivacyPage() {
        switchToNewPage();
        String url = mDriver.getCurrentUrl();
        Assert.assertTrue(url.contains("privacy"));
    }
    
    public void verifySwichingToTermsPage() {
        switchToNewPage();
        String url = mDriver.getCurrentUrl();
        Assert.assertTrue(url.contains("terms"));
    }
    
    public void verifySwichingToSettingsPage() {
        switchToNewPage();
        String url = mDriver.getCurrentUrl();
        Assert.assertTrue(url.contains("preferences"));
    }

}
