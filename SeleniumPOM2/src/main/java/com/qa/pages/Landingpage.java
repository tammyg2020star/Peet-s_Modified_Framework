/**
 * 
 */
package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Base.pagebaseclass;

public class Landingpage extends pagebaseclass {

	public Landingpage(WebDriver driver) {
		this.driver = driver;
	}

	public Loginpage clicksignin() {

		return PageFactory.initElements(driver, Loginpage.class);
	}

}
