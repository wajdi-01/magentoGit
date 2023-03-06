package com.e2e.lumaProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Properties props = new Properties();

	public Base() {
		try {
			File file = new File("src/test/resources/config.properties");
			FileInputStream fis = new FileInputStream(file);
			props.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void lunchBrowser() {

		if (props.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (props.getProperty("browser").equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            options.setBinary("C:\\Users\\WajdiABDELHAFIDH\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(options);
			

		} else if (props.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		driver.manage().window().maximize();

		// driver.get(props.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		// driver.manage().deleteAllCookies();
	}

}
