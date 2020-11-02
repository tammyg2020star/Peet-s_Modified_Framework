/**
 * 
 */
package Testcases;

import org.testng.annotations.Test;

import com.Base.BaseTestClass;
import com.qa.pages.Coffeepage;
import com.qa.pages.Landingpage;
import com.qa.pages.Loginpage;
import com.qa.pages.Searchpage;

public class Logintest extends BaseTestClass {
	Landingpage landingpage;
	Coffeepage coffeepage;
	Searchpage search;
	Loginpage login;

	/*
	 * @BeforeMethod public void setup() { // logger.log(Status.INFO,
	 * "Opening the chrome browser"); // pagebaseclass pagebase = new
	 * pagebaseclass(); invokeBrowser("chrome"); openwebsite(); landingpage =
	 * PageFactory.initElements(driver, Landingpage.class); }
	 */

	@Test(priority = 1)
	public void logintest() throws InterruptedException {
		invokeBrowser("chrome");
		openwebsite();
		logger = report.createTest("Login test");
		login = landingpage.clicksignin(prop.getProperty("uname"), prop.getProperty("pwd"));
		// logger.log(Status.PASS, "User logged in");
		coffeepage = landingpage.clickcoffeelink();
		landingpage = coffeepage.hoverlinks();
		search = coffeepage.clickonsearch();
		search = search.searchitem();
		// Loginpage loginpage = landingpage.clicksignin();
		// Coffeepage cofeepage = loginpage.dologin();
	}

}
