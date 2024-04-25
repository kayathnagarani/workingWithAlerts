package com.Alerts.Handling3Alerts;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Alerts.DriverAndScreenShot.ScreenShotUsingRoboClass;


import UserDefinedLibrary.ElementsOfWebPage;
/*Click on second Try it button. 
Take Screenshot.
Enter your name in the Alert box as "Harry Potter". 
Click on OK button in the prompt box.
Take Screenshot.*/



public class SecondTryItAlert {
	public static WebElement secondTryButton;
	WebDriver driver;
	 SecondTryItAlert(WebDriver driver){
		 this.driver=driver;}
	
	public void testcase_clickonsecondTryIt_sendvalueinPromptbox()throws InterruptedException, AWTException, IOException {
		//clicking on the second "TryIt" button
		secondTryButton = ElementsOfWebPage.secondTry();
		secondTryButton.click();
		 Thread.sleep(1000);
		 //switching to the alert
		 Alert promptAlert = driver.switchTo().alert();
		 //capturing screenshot of alert message
		 ScreenShotUsingRoboClass.screenCapture();
		 //sending keys as"Harry Potter" in prompt field
		 promptAlert.sendKeys("Harry Potter");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 //clicking on the "OK" in alert
		 promptAlert.accept(); 
		 Thread.sleep(1000);
		 
		 ScreenShotUsingRoboClass.screenCapture();
	}

}
