package Reusables;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
		
	
	public Properties prop;
	
	 public ReadConfig() {
		
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\Alok\\eclipse-workspace\\Testvgarant\\ConfigFile\\ReadConfig.properties");
			
			prop = new Properties();
			prop.load(file);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	 
	 public String browser() {
			
			String browser = prop.getProperty("browsername");
			return browser;
		
		}
	 
	 public String url1() {
			
			String url1 = prop.getProperty("url1");
			return url1;
		
		}

	 
	 
	 public String url2() {
			
			String url2 = prop.getProperty("url2");
			return url2;
		
		}
}


