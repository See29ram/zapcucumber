package com.udemy.helper;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GenericHelper {

	private static WebDriver dr;
	private static GenericHelper genericHelper;

	private GenericHelper(WebDriver driver) {
		dr = driver;
	}

	public static GenericHelper getInstance(WebDriver driver) {

		if (genericHelper == null || driver.hashCode() != dr.hashCode())
			genericHelper = new GenericHelper(driver);
		return genericHelper;

	}
	
	public void getScreenShot(String scrDir,String scrFileName) throws IOException
	{
		
		File file=new File(scrDir);
		if(!file.exists())
			file.mkdirs();
		
		File screenshot=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(scrDir+File.separator+scrFileName));
		
		
	}
	
	public byte[] getScreenshot()
	{
		
		return ((TakesScreenshot)dr).getScreenshotAs(OutputType.BYTES);
		
	}

}
