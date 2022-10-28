import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	
	WebDriver driver = new ChromeDriver();
	
	
	
	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();				
		
	}
	
	public String countryinIMDB ;
	public String RealeaseDateinIMDB ;
	public String countryinWIKI ;
	public String RealeaseDateinWIKI ;
	
	
	@Test
	public void test() {
		
		driver.get("https://www.imdb.com/title/tt9389998/releaseinfo?ref_=tt_dt_rdat");
		
		countryinIMDB = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[6]/td[1]")).getText();
		
		System.out.println(countryinIMDB);
		
		
       RealeaseDateinIMDB = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[6]/td[2]")).getText();
		
		System.out.println(RealeaseDateinIMDB);

	
		driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		
		 countryinWIKI = driver.findElement(By.xpath("//td[normalize-space()='India']")).getText();
		
		System.out.println(countryinWIKI);
		
		
		 RealeaseDateinWIKI = driver.findElement(By.xpath("//tbody/tr[12]/td[1]/div[1]/ul[1]/li[1]")).getText();
			
			System.out.println(RealeaseDateinWIKI);
			
			
			
			
			if(countryinWIKI.equalsIgnoreCase("usa") && RealeaseDateinWIKI.equalsIgnoreCase(RealeaseDateinIMDB)){
				
				
				System.out.println("Test case pass");
				
				
			} else 
				
				
				System.out.println("Test case fail");
	
	}
	

	
	
	
		
}
