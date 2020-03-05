package MavenTest.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test{
	
	
	@Test
	public void testing() {
		System.setProperty("webdriver.chrome.driver", "/Users/cb-sarathkumar/Documents/chromedriver");
	WebDriver	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo/");
		
		
		
		
	}
	
	
}
