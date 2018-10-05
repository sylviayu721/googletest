package com.sylviayu.pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.sylviayu.util.Logger;

public class WebPage {

    private static Integer TIME_OUT = 20;
    private FluentWait<WebDriver> mWait;
    protected WebDriver mDriver;

    public WebPage(WebDriver driver) {
        Logger.Debug("launching page ");
        PageFactory.initElements(driver, this);
        mWait = new FluentWait<WebDriver>(driver).withTimeout(TIME_OUT, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
        mDriver = driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    protected void waitForNewPageLoad() {
        Logger.Debug("waiting for new page to load");
        final String lastUrl = mDriver.getCurrentUrl();
        try {
            ExpectedCondition e = new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver d) {
                    return (d.getCurrentUrl() != lastUrl);
                }
            };

            mWait.until(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void switchToNewPage() {
        Logger.Debug("switching to new page from " + mDriver.getWindowHandle());
        // Switch to new window opened
        for (String winHandle : mDriver.getWindowHandles()) {
            Logger.Debug("winHandler : " + winHandle);
            mDriver.switchTo().window(winHandle);
        }
    }

    protected void clickElement(String cssSelector) {
        Logger.Debug("clicking element [" + cssSelector + "]");
        WebElement element = mDriver.findElement(By.cssSelector(cssSelector));
        mWait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    
    //"//html"
    protected void clickBlankArea(String cssSelector) {
        Logger.Debug("clicking blank area [" + cssSelector + "]");
        WebElement element = mDriver.findElement(By.xpath(cssSelector));
        //mWait.until(ExpectedConditions.elementToBeClickable(element));
        //element.click();
    }

    protected void inputValue(String cssSelector, String value) {
        Logger.Debug("input value [" + value + "] ");
        mWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));
        WebElement element = mDriver.findElement(By.cssSelector(cssSelector));
        element.sendKeys(value);

    }

    protected void verifyElementVisible(String cssSelector) {
        Logger.Debug("verifying element [" + cssSelector + "] visible ");
        mWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));
    }

    protected void verifyElementText(String cssSelector, String value) {
        Logger.Debug("verifying element value to be [" + value + "]");
        WebElement element = mDriver.findElement(By.cssSelector(cssSelector));
        String text = element.getText();
        Assert.assertEquals(text.toLowerCase(), value.toLowerCase());
    }

}
