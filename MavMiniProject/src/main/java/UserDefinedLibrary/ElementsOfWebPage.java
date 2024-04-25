package UserDefinedLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsOfWebPage {
	public static WebElement element  = null;
	static 	WebDriver driver;
	@SuppressWarnings("static-access")
	public ElementsOfWebPage(WebDriver driver){
		this.driver=driver;
	}
	public static WebElement showAlert() {
		 element =driver.findElement(By.id("simple"));
		return element;
	}
	public static  WebElement firstTry() {
		 element =driver.findElement(By.id("confirm"));
		return element;
	}
	public static WebElement secondTry() {
		 element =driver.findElement(By.id("prompt"));
		return element;
	}
	

}
