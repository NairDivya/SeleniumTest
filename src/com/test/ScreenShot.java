package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import java.awt.Dimension;
import java.awt.Rectangle;

import org.junit.Test;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class ScreenShot {
	
	

	@Test
	
	public void list() throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver d1 = new ChromeDriver();
		
		d1.get("http://demo.automationtesting.in/Alerts.html");
		
		Robot robot1 = new Robot();
		Dimension screen_size = Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rect1 = new Rectangle(screen_size);
		
		BufferedImage Source = robot1.createScreenCapture(rect1);
		
		File destination = new File("C:\\Users\\Chandran Nair\\Desktop\\SelSS\\SS1.png");
		
		ImageIO.write(Source,"png",destination);
		
		
		
	}

}
