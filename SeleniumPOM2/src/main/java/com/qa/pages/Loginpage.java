/**
 * 
 */
package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Topmenuclass;
import com.Base.pagebaseclass;

/**
 * @author Thimmegowda
 *
 */
public class Loginpage extends pagebaseclass {
	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}

	public Topmenuclass topmenu;

	@FindBy(xpath = "//i[@class='icon icon--account-black' and ancestor::div[contains(@class,'header__container')]]")
	public WebElement Mainlgn;

	@FindBy(id = "okta-signin-username")
	public WebElement username;

	@FindBy(id = "okta-signin-password")
	public WebElement password;

	@FindBy(id = "okta-signin-submit")
	public WebElement signin;

	public Coffeepage dologin(String uname, String pwd) {
		Mainlgn.click();
		username.sendKeys(uname);
		password.sendKeys(pwd);
		signin.click();
		return PageFactory.initElements(driver, Coffeepage.class);
	}

}