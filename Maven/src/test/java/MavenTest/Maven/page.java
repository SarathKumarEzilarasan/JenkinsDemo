package MavenTest.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page {

@FindBy(css = "[class=\"btn btn-hero btns btn-success hero-right\"]")	
WebElement c;
	
WebDriver driver;
page(WebDriver driver){
	PageFactory.initElements(driver, this);
}
}
