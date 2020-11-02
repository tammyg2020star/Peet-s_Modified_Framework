/**
 * 
 */
package com.qa.Pages;

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

	public Landingpage(WebDriver driver) {
		this.driver = driver;
	}

	public Loginpage clicksignin() {

		return PageFactory.initElements(driver, Loginpage.class);
	}

	public Coffeepage clickcoffeelink() {
		coffeelink.click();
		return PageFactory.initElements(driver, Coffeepage.class);
	}

}
