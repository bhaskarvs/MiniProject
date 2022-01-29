package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public Configuration_Reader() throws IOException {

		File f = new File(
				"C:\\Users\\Vekshana\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\properties\\configuration.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();// null

		p.load(fis);
	}

	public static Properties p;

	public String getUrl() {

		String url = p.getProperty("url");

		return url;

	}

	public String getEmail() throws IOException {

		File f = new File(
				"C:\\Users\\Vekshana\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\properties\\configuration.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();// null

		p.load(fis);

		String email = p.getProperty("email");

		return email;

	}

	public String getPassword() throws IOException {

		String password = p.getProperty("password");

		return password;

	}

	public String getIndex() {

		String index = p.getProperty("index");

		return index;

	}

	public String getQty() {

		String qty = p.getProperty("qty");

		return qty;

	}

	public String getScreenshot() {

		String screenshot = p.getProperty("screenshot");

		return screenshot;

	}

}
