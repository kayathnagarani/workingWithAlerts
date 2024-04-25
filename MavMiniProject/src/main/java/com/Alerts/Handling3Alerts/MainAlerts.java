package com.Alerts.Handling3Alerts;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.Alerts.DriverAndScreenShot.DriverSetupp;

import UserDefinedLibrary.ElementsOfWebPage;


public class MainAlerts{
    static WebDriver driver;
	@SuppressWarnings("static-access")
	public MainAlerts(WebDriver driver) {
		this.driver = driver;
	}

	static String  browsertype = "chrome";


	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		DriverSetupp des = new DriverSetupp(driver);//creating object of DriverSetupp
		  driver =des.driverInitiate(browsertype);//invoking driverInitiate(browsertype) method to launch the browser
		 ElementsOfWebPage eof = new ElementsOfWebPage(driver);//creating object of ElementsOfWebPage
		 //invoking the methods in the ElementsOfWebPage
		 eof.showAlert();
		 eof.firstTry();
		 eof.secondTry();
		 ShowAlertBoxHandling sat = new ShowAlertBoxHandling(driver);//creating object of ShowAlertBoxHandling 
		 sat.testcase_clickshowAlertBox_verifyAlertText();//invoking the method testcase_clickshowAlertBox_verifyAlertText();
		 FirstTryItAlert fta = new  FirstTryItAlert (driver) ;//creating object of FirstTryItAlert
		 fta.testcase_clickonfisttryIt_verifyalerttext();//invoking the method testcase_clickonfisttryIt_verifyalerttext()
		 SecondTryItAlert sta = new SecondTryItAlert(driver);//creating object of  SecondTryItAlert 
		 sta.testcase_clickonsecondTryIt_sendvalueinPromptbox();//invoking the method testcase_clickonsecondTryIt_sendvalueinPromptbox()
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 DriverSetupp.driverQuit();//closing the browser
		 
		
	}

}
