/**
 * 
 */
package com.qa.Testcases;

import org.testng.annotations.Test;

import com.qa.Baseclass.pagebaseclass;
import com.qa.Pages.Coffeepage;
import com.qa.Pages.Landingpage;
import com.qa.Pages.Searchpage;

public class Logintest {
	Landingpage landingpage;
	Coffeepage coffeepage;
	Searchpage search;

	@Test
	public void logintest() throws InterruptedException {
		pagebaseclass page = new pagebaseclass();
		page.invokeBrowser("chrome");
		landingpage = page.openwebsite();
		// PageFactory.initElements(driver, landingpage);
		coffeepage = landingpage.clickcoffeelink();
		coffeepage.hoverlinks();
		search = coffeepage.clickonsearch();
		search = search.searchitem();
		// Loginpage loginpage = landingpage.clicksignin();
		// Coffeepage cofeepage = loginpage.dologin();
	}
}
