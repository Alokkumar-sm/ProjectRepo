package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import Reusables.BaseClass;
import Reusables.ReadConfig;


public class pom extends BaseClass{


	WebDriver driver;
	ReadConfig readfile = new ReadConfig();
	
	
	public pom(WebDriver driver){
	
	PageFactory.initElements(driver, this);
	this.driver = driver;
}
	
	

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[6]/td[1]") WebElement countryinIMDB;
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[6]/td[2]") WebElement RealeaseDateinIMDB;
	@FindBy(xpath = "//td[normalize-space()='India']") WebElement countryinWIKI;
	@FindBy(xpath = "//tbody/tr[12]/td[1]/div[1]/ul[1]/li[1]") WebElement RealeaseDateinWIKI;
	
	
	public void test() {
		
		//url in IMDB
		driver.get(readfile.url1());

		String CountryinIMDB = countryinIMDB.getText();
		
		System.out.println(CountryinIMDB);
		
		
		String DateinIMDB = RealeaseDateinIMDB.getText();
		
		System.out.println(DateinIMDB);


		
		// URL IN wiki
		driver.get(readfile.url2());
		
		String CountryinWIKI = countryinWIKI.getText();
		
		System.out.println(CountryinWIKI);
		
		
		String DateinWIKI = RealeaseDateinWIKI.getText();
			
		System.out.println(DateinWIKI);
				

		if(CountryinIMDB.equalsIgnoreCase(CountryinWIKI) && DateinIMDB.equalsIgnoreCase(DateinWIKI)){
			
		
		Assert.assertEquals("Data matching", "Data matching");	
			
			System.out.println("Test case pass");
			
			
		} else {
			
			System.out.println("Test case fail");
			Assert.assertEquals("Data is Not matching", "Data matching");	
		
			

}
		
		


		
	}	
}
	
	

	
	