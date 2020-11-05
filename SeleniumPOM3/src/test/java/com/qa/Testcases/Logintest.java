/**
 * 
 */
package com.qa.Testcases;

import org.testng.annotations.Test;

import com.qa.Baseclass.pagebaseclass;
import com.qa.Pages.Coffeepage;
import com.qa.Pages.Landingpage;
import com.qa.Pages.Loginpage;
import com.qa.Pages.Searchpage;

public class Logintest extends pagebaseclass {
	Landingpage landingpage;
	Coffeepage coffeepage;
	Searchpage search;
	Loginpage login;

	@Test
	public void logintest() throws InterruptedException {
		pagebaseclass page = new pagebaseclass();
		invokeBrowser("chrome");
		landingpage = openwebsite();
		login = landingpage.clicksignin(prop.getProperty("uname"), prop.getProperty("pwd"));
		// landingpage = page.openwebsite();
		// PageFactory.initElements(driver, landingpage);
		coffeepage = landingpage.clickcoffeelink();
		coffeepage.hoverlinks();
		search = coffeepage.clickonsearch();
		search = search.searchitem();
		// Loginpage loginpage = landingpage.clicksignin();
		// Coffeepage cofeepage = loginpage.dologin();

	}
}
