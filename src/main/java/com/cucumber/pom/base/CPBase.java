package com.cucumber.pom.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cucumber.pom.util.CPUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CPBase {

	public static WebDriver driver;

	public static Properties props;

	public CPBase() {
		props = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\indeztruk\\eclipse-workspace\\CucumberPOM\\src\\main\\java\\com\\cucumber\\pom\\config\\config.properties");
			props.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browser = props.getProperty("browser");

		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(CPUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(CPUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(props.getProperty("url"));

	}

}
