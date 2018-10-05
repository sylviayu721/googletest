package com.sylviayu.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Properties;

import com.sylviayu.util.Logger;
import com.google.gson.Gson;
import com.sylviayu.util.PageProperties;;

public class Util {
	
	static Properties mProp = new Properties();

    public static Properties getProperties() {
        return mProp;

    }
    
    /**
	 * Read properties for every web page from JSON file. For e.g., the button
	 * CSSSelectors, title, content, etc..<br>
	 *
	 * @param fileName
	 *            the file name
	 * @return the PageProperties object.
	 */
	public static PageProperties readPageProperties(String fileName) {
		final Gson gson = new Gson();
		try {
			InputStream fileSource = new FileInputStream(fileName);
			final BufferedReader reader = new BufferedReader(
					new InputStreamReader(fileSource, StandardCharsets.UTF_8));
			PageProperties prop = gson.fromJson(reader, PageProperties.class);
			Logger.Debug("loading page properties success");
			return prop;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	
    public static void deleteFile(String filename) {
        File file = new File(filename);
        try {
             	Files.deleteIfExists(file.toPath());
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
    
    
    public static  void delay(int seconds){
    	try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
