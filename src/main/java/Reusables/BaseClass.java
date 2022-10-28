package Reusables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {


	ReadConfig readpropfile = new ReadConfig();
	
	public WebDriver driver ;
	public String browser = readpropfile.browser();
	
	@BeforeClass
	public void setup() {
		
		
		if(browser.equals("firefox")) {
			
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
			
		}else if(browser.equals("chrome")) {
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	}
	
	
	
	

