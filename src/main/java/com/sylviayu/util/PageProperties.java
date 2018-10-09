package com.sylviayu.util;

/**
 * Define the properties for each web page
 *
 * @author Sylvia
 */
@SuppressWarnings("deprecation")
public class PageProperties {

    public class Common {
    	public String pageName;
    	public String mainUrl;
    }
    
    public class Google {
    	public String pageName;
    	public String inputSearch;
    	public String searchSelenium;
    	public String btnGoogleSearch;
    	public String btnGoogleSearchDropDown;
    	public String btnIFeelLucky;
    	public String btnSearchByVoice;
    	public String linkFrench;
    	public String linkAbout;
    	public String linkStore;
    	public String linkGmail;
    	public String linkImage;
    	public String linkAdvertising;
    	public String linkBusiness;
    	public String linkPrivacy;
    	public String linkTerms;
    	public String linkPreferences;
    	public String tabSearchSettings;
    }
    
    public class SearchResult {
    	public String pageName;
    	public String tabAll;
    	public String tabImages;
    	public String tabVideos;
    	public String tabNews;
    	public String tabShopping;

    }

     public Common common;
     public Google google;
     public SearchResult searchResult;
}
