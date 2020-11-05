/**
 * 
 */
package com.qa.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Baseclass.pagebaseclass;

public class Landingpage extends pagebaseclass {

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

	@FindBy(xpath = "//i[@class='icon icon--account-black' and ancestor::div[contains(@class,'header__container')]]")
	public WebElement Mainlgn;

	@FindBy(id = "okta-signin-username")
	public WebElement username;

	@FindBy(id = "okta-signin-password")
	public WebElement password;

	@FindBy(id = "okta-signin-submit")
	public WebElement signin;

	public Landingpage(WebDriver driver) {
		this.driver = driver;
	}

	public Loginpage clicksignin(String uname, String passw) throws InterruptedException {
		// logger.log(Status.INFO, "Clicking on Signin link");
		Mainlgn.click();
		// logger.log(Status.PASS, "Clicked on Sigin in link");
		// logger.log(Status.INFO, "Clicking on Signin link");
		// logger.log(Status.INFO, "Entering the username");
		username.sendKeys(uname);
		// logger.log(Status.PASS, "Username is enterd");
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
