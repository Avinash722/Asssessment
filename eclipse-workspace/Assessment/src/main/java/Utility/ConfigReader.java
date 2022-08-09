package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader{
	public Properties prop;

	public  ConfigReader() {


		try {
			File F1 = new File("./src/Config/config.properties");
			FileInputStream fis = new FileInputStream(F1);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

	
	public  String getUrl() {
		return prop.getProperty("url");
	}
	public  String getEmail() {
		return prop.getProperty("Email");
		
	}
	public  String getPass() {
		return prop.getProperty("Pass");
	}

}

