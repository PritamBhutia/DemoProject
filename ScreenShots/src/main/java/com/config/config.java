package com.config;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class config {
	WebDriver driver;
	public void driverSetting(String url) {
		System.setProperty("webdriver,chrome,driver", "H:/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);
		
	}
	public void TakeScreenShots() {
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\PRITAM\\Desktop\\screen shot\\Test1.png");
		
	try {
		FileHandler.copy(source, target);
	} catch (IOException e) {
	
		e.printStackTrace();
	}catch (Exception e) {
		e.printStackTrace();
	}
	
		
	}

}
