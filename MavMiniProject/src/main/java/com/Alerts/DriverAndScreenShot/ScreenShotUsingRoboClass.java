package com.Alerts.DriverAndScreenShot;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ScreenShotUsingRoboClass {
	static int i; 
	
	public static void  screenCapture() throws AWTException, IOException {
		
			     Robot robotClassObject = new Robot();
				
				// Get screen size
				Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
				
				// Capturing screenshot by providing size
		        BufferedImage tmp = robotClassObject.createScreenCapture(screenSize); 
		        
		        // Defining destination file path
		        String path="C:\\workspaceeclipse\\MavMiniProject\\screenshot\\alertmessage" + i + ".png";
		        i++;
		        
		        // To copy temp image in to permanent file
		        ImageIO.write(tmp, "png",new File(path)); 
			
		 
	 }


}
