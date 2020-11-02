/**
 * 
 */
package com.qa.Baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Pages.Landingpage;

/**
 * @author Thimmegowda
 *
 */
public class pagebaseclass {
	public static WebDriver driver;
	public static Properties prop;

	public pagebaseclass() {
		try {

			prop = new Properties();

			FileInputStream fip = new FileInputStream(
					"C:\\Users\\Thimmegowda\\Desktop\\Eclipse_work\\SeleniumPOM2\\src\\main\\java\\com\\config\\config.properties");

			prop.load(fip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/****************** Invoke Browser ***********************/
	public void invokeBrowser(String browserName) {

		try {

			if (browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Thimmegowda\\Desktop\\selenium jars\\Drivers\\New chrome\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("Mozila")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\Thimmegowda\\Desktop\\selenium jars\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();

			}
		} catch (Exception e) {
			// reportFail(e.getMessage());
			System.out.println(e.getMessage());
		}

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	/************* open application ***********/
	public Landingpage openwebsite() {
		driver.get("https://peets-coffee-staging.myshopify.com");
		return PageFactory.initElements(driver, Landingpage.class);
	}

	/****************** Get Page Title ***********************/
	public void getTitle(String expectedTitle) {
		try {
			Assert.assertEquals(driver.getTitle(), expectedTitle);
			// reportPass("Actual Title : " + driver.getTitle() + " - equals to Expected
			// Title : " + expectedTitle);
		} catch (Exception e) {
			// reportFail(e.getMessage());
		}

	}

}
