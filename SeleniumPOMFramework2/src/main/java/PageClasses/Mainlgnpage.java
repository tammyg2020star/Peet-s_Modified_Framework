package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.PageBaseClass;
import baseClasses.TopMenuClass;

public class Mainlgnpage extends PageBaseClass {

	public TopMenuClass topmenu;

	public Mainlgnpage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		topmenu = new TopMenuClass(driver, logger);
		PageFactory.initElements(driver, topmenu);
	}

	@FindBy(xpath = "//i[@class='icon icon--account-black' and ancestor::div[contains(@class,'header__container')]]")
	public WebElement Mainlgn;

	@FindBy(xpath = "//*[@id='okta-signin-username']")
	public WebElement username;

	@FindBy(xpath = "//*[@id='okta-signin-password']")
	public WebElement password;

	@FindBy(xpath = "//*[@id='okta-signin-submit']")
	public WebElement signin;

	public PortFolioLoginPage clickSingInLink(String uname, String pass) {
		logger.log(Status.INFO, "Clicking the Sing-In Link");
		Mainlgn.click();
		logger.log(Status.PASS, "Clicked the Sing-In Link");
		username.sendKeys(uname);
		logger.log(Status.PASS, "username passed");
		password.sendKeys(pass);
		logger.log(Status.PASS, "password passed");
		signin.click();
		logger.log(Status.PASS, "Clicked on signin");
		PortFolioLoginPage portfolioLogin = new PortFolioLoginPage(driver, logger);
		PageFactory.initElements(driver, portfolioLogin);
		return portfolioLogin;
	}

}
