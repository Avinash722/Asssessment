package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configData {
	public Properties prop;

	public configData() {

		try {
			File F1 = new File("./Config/config.properties");
			FileInputStream fis = new FileInputStream(F1);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

	
	public  String getAmazonUrl() {
		return prop.getProperty("url");
	}
	
}
