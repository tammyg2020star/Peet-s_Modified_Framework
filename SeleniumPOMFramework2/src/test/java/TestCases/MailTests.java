package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageClasses.LandingPage;
import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass;
import baseClasses.TopMenuClass;

public class MailTests extends BaseTestClass {
	LandingPage landingPage;
	TopMenuClass topmenu;

	@Test
	public void writeMailTest() {
		invokeBrowser("chrome");
		PageBaseClass pageBase = new PageBaseClass(driver, logger);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
		// topmenu.login(userName, password)
		// landingPage.validatetopmenulinks();
	}

}
