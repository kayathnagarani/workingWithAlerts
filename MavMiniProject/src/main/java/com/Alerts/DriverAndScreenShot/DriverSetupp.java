package com.Alerts.DriverAndScreenShot;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/* Requirement:
 * Open the web application, http://cookbook.seleniumacademy.com/Alerts.html*/

public class DriverSetupp {
	public static WebDriver driver;
	public static String url ="http://cookbook.seleniumacademy.com/Alerts.html";
	public static String browsertype;
	@SuppressWarnings("static-access")
	public DriverSetupp(WebDriver driver) {
		this.driver = driver;
	}

	
	public WebDriver driverInitiate(String browsingdriver) {
		browsertype = browsingdriver;
		if (browsingdriver.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();//Initializing chrome browser
		} else if (browsingdriver.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();//Initializing edge browser
		}
	
		
		driver.get(url);//launching the web application
		driver.manage().window().maximize();//maximizing the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		return driver;
	}
	
	public static void driverQuit() {
		driver.quit();//closing the browser
	}

}
