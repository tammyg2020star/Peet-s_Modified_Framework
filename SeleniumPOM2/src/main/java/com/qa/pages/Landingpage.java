/**
 * 
 */
package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.pagebaseclass;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Landingpage extends pagebaseclass {

	public Landingpage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
	}

	@FindBy(xpath = "//i[@class='icon icon--account-black' and ancestor::div[contains(@class,'header__container')]]")
	public WebElement Mainlgn;

	@FindBy(id = "okta-signin-username")
	public WebElement username;

	@FindBy(id = "okta-signin-password")
	public WebElement password;

	@FindBy(id = "okta-signin-submit")
	public WebElement signin;

	@FindBy(xpath = "//a[@data-id='coffee-nav' and contains(text(),'Coffee')]")
	public WebElement coffeelink;

	public Loginpage clicksignin(String uname, String passw) throws InterruptedException {
		logger.log(Status.INFO, "Clicking on Signin link");
		Mainlgn.click();
		logger.log(Status.PASS, "Clicked on Sigin in link");
		logger.log(Status.INFO, "Clicking on Signin link");
		logger.log(Status.INFO, "Entering the username");
		username.sendKeys(uname);
		logger.log(Status.PASS, "Username is enterd");
		password.sendKeys(passw);
		// signin.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", signin);
		// WebDriverWait wait = new WebDriverWait(driver, 30);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signin"))).click();
		return PageFactory.initElements(driver, Loginpage.class);
	}

	public Coffeepage clickcoffeelink() {
		coffeelink.click();
		return PageFactory.initElements(driver, Coffeepage.class);
	}
}
