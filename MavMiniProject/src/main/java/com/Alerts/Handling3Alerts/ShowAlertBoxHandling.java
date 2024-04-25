package com.Alerts.Handling3Alerts;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Alerts.DriverAndScreenShot.ScreenShotUsingRoboClass;


import UserDefinedLibrary.ElementsOfWebPage;
/* Requirements
 * Click on Show alert box button. 
Check the message displayed on Alert box is "Hello! I am an alert box!". 
Take Screenshot.
Click on OK button in the message box. */

public class ShowAlertBoxHandling{
	public static WebElement alertbox;
	WebDriver driver;
	ShowAlertBoxHandling(WebDriver driver){
		this.driver=driver;
	}
	
	public  void testcase_clickshowAlertBox_verifyAlertText() throws InterruptedException, AWTException, IOException {
		//clicking on the "show alert box " on webpage
		alertbox = ElementsOfWebPage.showAlert();
		alertbox.click();
		Thread.sleep(1000);
		//switch to the alert
		Alert alert = driver.switchTo().alert();
		//capture screen shot of alert message
		ScreenShotUsingRoboClass.screenCapture();
		//verifying the text
		String  almsg = alert.getText();//getting the alert text
		String al1msg = "Hello! I am an alert box!";
		if(almsg.equals(al1msg)) {
			System.out.println("alert message is verified");
		}
		else {
			System.out.println("alert message is not accurate");
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//clicking on "OK" button
		alert.accept();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
