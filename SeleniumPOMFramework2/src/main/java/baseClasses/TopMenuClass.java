package baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import PageClasses.LandingPage;

public class TopMenuClass extends PageBaseClass {

	public TopMenuClass(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
	}

	@FindBy(xpath = "//i[@class='icon icon--account-black' and ancestor::div[contains(@class,'header__container')]]")
	public WebElement Mainlgn;

	@FindBy(xpath = "//*[@name='username']")
	public WebElement uname;

	@FindBy(xpath = "//*[@name='password']")
	public WebElement pwd;

	@FindBy(xpath = "//*[@id='okta-signin-submit']")
	public WebElement signin;

	public LandingPage login(String userName, String password) {
		uname.sendKeys(userName);
		logger.log(Status.PASS, "Entered the UserName : " + userName);
		pwd.sendKeys(password);
		logger.log(Status.PASS, "Entered the UserName : " + password);
		signin.click();
		logger.log(Status.PASS, "clicked on signin : " + signin);
		waitForPageLoad();
		LandingPage landingpage = new LandingPage(driver, logger);
		PageFactory.initElements(driver, landingpage);
		return landingpage;
	}

}
