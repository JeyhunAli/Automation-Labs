package com.automationlabs.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * 
 * @author jey
 *
 */

public class BasePage {

	/**
	 * this class is responsible of the web driver concept
	 *  so all the initialization form will take browser from this class
	 */


	WebDriver driver;
	Properties prop;

	public WebDriver initialize_driver(String browserName) {


		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}
		else if (browserName.equalsIgnoreCase("safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();

		}

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://naveenautomationlabs.com/");

		return driver;




	}
/**
 * this method is one of most important method in framework which is 
 * giving us complete control of the config file 
 * FileInputStream class make the connection with config file 
 * prop.load method loading FileInputStream 
 * 
 * @return properties 
 */

	public Properties initialize_prop() {


		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("./src/main/java/com/automationlabs/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


		return prop;


	}



}