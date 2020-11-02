package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.PageBaseClass;

public class LandingPage extends PageBaseClass {

	public LandingPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
	}

	@FindBy(xpath = "//a[@data-id='coffee-nav' and contains(text(),'Coffee')]")
	public WebElement coffeelink;

	@FindBy(xpath = "//a[@data-id='tea-nav' and contains(text(),'Tea')]")
	public WebElement tealink;

	@FindBy(xpath = "//a[@data-id='subscriptions-nav' and contains(text(),'Subscriptions')]")
	public WebElement subscriptionlink;

	@FindBy(xpath = "//a[@data-id='visit-us-nav' and contains(text(),'Visit Us')]")
	public WebElement visituslink;

	@FindBy(xpath = "//a[@data-id='learn-nav' and contains(text(),'Learn')]")
	public WebElement learnlink;

	public Mainlgnpage validatetopmenulinks() {
		action.moveToElement(coffeelink).build().perform();
		logger.log(Status.PASS, "Hoverd on coffeelink");
		action.moveToElement(tealink).build().perform();
		logger.log(Status.PASS, "Hoverd on tealink");
		action.moveToElement(subscriptionlink).build().perform();
		logger.log(Status.PASS, "Hoverd on subscriptionlink");
		action.moveToElement(visituslink).build().perform();
		logger.log(Status.PASS, "Hoverd on visituslink");
		action.moveToElement(learnlink).build().perform();
		logger.log(Status.PASS, "Hoverd on learnlink");
		Mainlgnpage Mainlgnpage = new Mainlgnpage(driver, logger);
		PageFactory.initElements(driver, Mainlgnpage);
		return Mainlgnpage;
	}

	/*
	 * public PortFolioLoginPage clickSingIn() { // Perform the Click
	 * PortFolioLoginPage portFolioLoginPage = new PortFolioLoginPage(driver,
	 * logger); PageFactory.initElements(driver, portFolioLoginPage); return
	 * portFolioLoginPage; }
	 */
}
