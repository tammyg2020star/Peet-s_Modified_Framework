/**
 * 
 */
package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.Baseclass.pagebaseclass;

/**
 * @author Thimmegowda
 *
 */
public class Loginpage extends pagebaseclass {

	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}

	public Coffeepage dologin() {

		return PageFactory.initElements(driver, Coffeepage.class);

	}

}
