/**
 * 
 */
package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Base.Topmenuclass;
import com.Base.pagebaseclass;
import com.aventstack.extentreports.ExtentTest;

/**
 * @author Thimmegowda
 *
 */
public class Loginpage extends pagebaseclass {

	public Topmenuclass topmenu;

	public Loginpage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);

		topmenu = PageFactory.initElements(driver, Topmenuclass.class);

	}

	public Coffeepage dologin() {
		String pagetitle = driver.getTitle();
		if (pagetitle.equals("Account – Peet's Coffee Staging"))
			System.out.println("Login successful");
		return PageFactory.initElements(driver, Coffeepage.class);

	}

}
