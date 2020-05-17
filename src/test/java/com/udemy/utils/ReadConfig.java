package com.udemy.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfig implements IReader {

	Properties prop;

	public void loadPropeties(String fileName) {

		if (IsDefaulFile(fileName)) {

			prop = ReadPropertiesFile("config.properties");
		} else {

			prop = ReadPropertiesFile(fileName);
		}

	}

	public ReadConfig(String fileName) {
		loadPropeties(fileName);
	}

	public ReadConfig() {
		loadPropeties("");
	}

	private Properties ReadPropertiesFile(String fileName) {
		// TODO Auto-generated method stub
		String filePath = ResourceUtils.getResourcePath(fileName);
		Properties p = new Properties();
		try {
			InputStream fis = new FileInputStream(new File(filePath));
			p.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e.getMessage());
		}
		return p;

	}

	private boolean IsDefaulFile(String fileName) {
		if ("".equalsIgnoreCase(fileName))
			return true;
		return false;

	}

	@Override
	public String getAppUrl() {
		// TODO Auto-generated method stub
		return prop.getProperty("url");
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return prop.getProperty("username");
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return prop.getProperty("password");
	}

	@Override
	public int getExplicitWait() {
		// TODO Auto-generated method stub
		return Integer.parseInt(prop.getProperty("explicitwait"));
	}

	@Override
	public String getBrowserType() {
		// TODO Auto-generated method stub
		return prop.getProperty("browser");
	}

}
