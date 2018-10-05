package com.sylviayu.testcases;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

import org.testng.annotations.Test;

import com.sylviayu.pages.SearchResultPage;
import com.sylviayu.pages.GooglePage;
import com.sylviayu.util.Util;

	//@Listeners(TestListener.class)
	@Test(groups = { "Regression" })
	public class TCGoogle extends TCBase {
	    /**
	     * Smoke Test case 001 : verify search string - "Selenium"
	     */
	    @Test(groups = { "Smoke", "Google Page" }, description = "<br>verify login successfully:<br>")
	    public void TCGoogle_Smoke_001() throws Exception{
	    	mDriver.navigate().to(mProp.common.mainUrl);
	        GooglePage googlePage = new GooglePage(mDriver,mProp);

	        googlePage.inputSearchString(mProp.google.searchSelenium);
	        googlePage.clickGoogleSearchButton();
	        
	        // verify search result page should be launched
	        SearchResultPage searchResultPage = new SearchResultPage(mDriver,mProp);
	        searchResultPage.verifyUI();
	        searchResultPage.verifyUrl();
	        //go back google page;
	        mDriver.navigate().back();
	    }
	    
	    /**
	     * Smoke Test case 002 : verify Google Page - switch to About page
	     */
	    @Test(groups = { "Smoke", "Google Page" }, description = "<br>verify switch to About page:<br>")
	    public void TCGoogle_Smoke_002() throws Exception{
	    	GooglePage googlePage = new GooglePage(mDriver,mProp);
	        // click About link
	    	googlePage.clickAbout();
	    	//Verify switch to About page;
	    	googlePage.verifySwichingToAboutPage();
	    	//go back google page;
	    	 mDriver.navigate().back();

	    }
	    

	    /**
	     * Smoke Test case 003 : verify Google Page - switch to Store page
	     */
	    @Test(groups = { "Smoke", "Google Page" }, description = "<br>verify switch to Store page:<br>")
	    public void TCGoogle_Smoke_003() throws Exception{
	    	GooglePage googlePage = new GooglePage(mDriver,mProp);
	        // click Store link
	    	googlePage.clickStore();
	    	//Verify switch to Store page
	    	googlePage.verifySwichingToStorePage();
	    	//go back google page;
	    	 mDriver.navigate().back();
	    }
	    
	    /**
	     * Smoke Test case 004 : verify Google Page - switch to Gmail page
	     */
	    @Test(groups = { "Smoke", "Google Page" }, description = "<br>verify switch to Gmail page:<br>")
	    public void TCGoogle_Smoke_004() throws Exception{
	    	GooglePage googlePage = new GooglePage(mDriver,mProp);
	        // click About link
	    	googlePage.clickGmail();
	    	//verify switch to Gmail page
	    	googlePage.verifySwichingToGmailPage();
	    	//go back google page;
	    	 mDriver.navigate().back();
	    }
	    
	    /**
	     * Smoke Test case 005 : verify Google Page - switch to Images page
	     */
	    @Test(groups = { "Smoke", "Google Page" }, description = "<br>verify switch to Images page:<br>")
	    public void TCGoogle_Smoke_005() throws Exception{
	    	GooglePage googlePage = new GooglePage(mDriver,mProp);
	        // click About link
	    	googlePage.clickImages();
	    	//verify switch to Images page
	    	googlePage.verifySwichingToImagesPage();
	    	//go back google page;
	    	 mDriver.navigate().back();
	    }
	    
	    /**
	     * Smoke Test case 006 : verify Google Page - switch to Advertising page
	     */
	    @Test(groups = { "Smoke", "Google Page" }, description = "<br>verify switch to Advertising page:<br>")
	    public void TCGoogle_Smoke_006() throws Exception{
	    	GooglePage googlePage = new GooglePage(mDriver,mProp);
	        // click About link
	    	googlePage.clickAdvertising();
	    	//verify switch to Advertising page
	    	googlePage.verifySwichingToAdvertisingPage();
	    	//go back google page;
	    	mDriver.navigate().back();
	    }
	    
	    /**
	     * Smoke Test case 007 : verify Google Page - switch to Business page
	     */
	    @Test(groups = { "Smoke", "Google Page" }, description = "<br>verify switch to Business page:<br>")
	    public void TCGoogle_Smoke_007() throws Exception{
	    	GooglePage googlePage = new GooglePage(mDriver,mProp);
	        // click About link
	    	googlePage.clickBusiness();
	    	//verify switch to Business page
	    	googlePage.verifySwichingToBusinessPage();
	    	//go back google page;
	    	mDriver.navigate().back();
	    }
	    
	    /**
	     * Smoke Test case 008 : verify Google Page - switch to Privacy page
	     */
	    @Test(groups = { "Smoke", "Google Page" }, description = "<br>verify switch to Privacy page:<br>")
	    public void TCGoogle_Smoke_008() throws Exception{
	    	GooglePage googlePage = new GooglePage(mDriver,mProp);
	        // click About link
	    	googlePage.clickPrivacy();
	    	//verify switch to Privacy page
	    	googlePage.verifySwichingToBusinessPage();
	    	//go back google page;
	    	mDriver.navigate().back();
	    }
	    
	    /**
	     * Smoke Test case 009 : verify Google Page - switch to Terms page
	     */
	    @Test(groups = { "Smoke", "Google Page" }, description = "<br>verify switch to Terms page:<br>")
	    public void TCGoogle_Smoke_009() throws Exception{
	    	GooglePage googlePage = new GooglePage(mDriver,mProp);
	        // click About link
	    	googlePage.clickTerms();
	    	//verify switch to Terms page
	    	googlePage.verifySwichingToTermsPage();
	    	//go back google page;
	    	mDriver.navigate().back();
	    }
	    
	    /**
	     * Smoke Test case 010 : verify Google Page - switch to Settings page
	     */
	    @Test(groups = { "Smoke", "Google Page" }, description = "<br>verify switch to Settings page:<br>")
	    public void TCGoogle_Smoke_010() throws Exception{
	    	GooglePage googlePage = new GooglePage(mDriver,mProp);
	        // click About link
	    	googlePage.clickSettings();
	    	//verify switch to Terms page
	    	googlePage.verifySwichingToSettingsPage();
	    	//go back google page;
	    	mDriver.navigate().back();
	    }
	}