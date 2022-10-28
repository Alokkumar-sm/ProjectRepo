package TestMethods;


import org.testng.annotations.Test;

import POM.pom;
import Reusables.BaseClass;

public class FirstTest extends BaseClass {


	@Test
	public void test() {
		
		pom data = new pom(driver);
		data.test();

	}
	
}
