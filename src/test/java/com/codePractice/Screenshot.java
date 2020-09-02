package com.codePractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public static void screenshot (WebDriver driver, String s) throws IOException { //we use static 
		
		TakesScreenshot tk = (TakesScreenshot)driver;//interface from selenium
		File fl = tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fl, new File(s+".png"));
		//FileUtils.copyFile(f,  new File(s+".png"))
	}
}
