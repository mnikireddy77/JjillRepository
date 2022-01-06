package com.JJill.testcases;
import java.awt.event.AWTEventListener;
import java.beans.EventHandler;
import java.io.File;
import java.util.EventListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +
		 * File.separator + "geckodriver.exe"); WebDriver driver = new FirefoxDriver();
		 */
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "chromedriver.exe");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-notifications");
		options.addArguments("--enable-automation");
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-save-password-bubble");
		options.addArguments("--test-type");
		//options.addArguments("--headless");
		//options.addArguments("--start-maximized");
	//	options.addArguments("--window-size=1920,1080");
//options.addArguments("--headless", "--disable-gpu", "--window-size=1936,1056");		

		//			Reporter.log("Chrome options added successfully",true);
		WebDriver driver = new ChromeDriver(options);
 
		EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
//         WebDriverEventListener eventListener = new WebDriverEventListener();
         eventDriver.register(null);
		eventDriver.get("https://toolsqa.com/automation-practice-switch-windows/");
		WebElement element = eventDriver.findElement(By.id("target"));
		element.click();
		eventDriver.unregister(null);

	}

}
