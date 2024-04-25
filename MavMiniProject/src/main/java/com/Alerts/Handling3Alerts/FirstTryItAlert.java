package com.Alerts.Handling3Alerts;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Alerts.DriverAndScreenShot.ScreenShotUsingRoboClass;

import UserDefinedLibrary.ElementsOfWebPage;
/*Requirements:
 * Click on first Try it button. 
 Check the message displayed on Alert box is "Press a button!". 
 Take Screenshot.
 Click on Cancel button in the message box. */

public class FirstTryItAlert   {
	public static WebElement firstTryItButton;
	
	WebDriver driver;
	FirstTryItAlert(WebDriver driver){
		this.driver = driver;
	}
	
	public void testcase_clickonfisttryIt_verifyalerttext() throws InterruptedException, AWTException, IOException {
		//clicking on first"TryIt"Button on web page
		firstTryItButton = ElementsOfWebPage.firstTry();
		firstTryItButton .click();
		Thread.sleep(1000);
		//after clicking first"TryIt" button switching to the alert
	Alert alert2 = driver.switchTo().alert();
	 //capturing screenshot of alert
	ScreenShotUsingRoboClass.screenCapture();
	//getting text from the alert message
	String alemsg = alert2.getText();
	String alemsg2 = "Press a button!";
	//verifying with actual text of the alert message
	if(alemsg.equals(alemsg2)) {
		System.out.println("alert2 message is verified");
	}
	else {
		System.out.println("alert2 message is not accurate");
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	//clicking on cancel button of the alert
	alert2.dismiss();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

}

}
