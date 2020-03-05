package MavenTest.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages {
	WebDriver driver;
	
	@FindBy(xpath = "")
	WebElement el;
	
	Pages(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
