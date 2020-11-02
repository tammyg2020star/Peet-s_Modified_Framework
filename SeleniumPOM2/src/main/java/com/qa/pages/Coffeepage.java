/**
 * 
 */
package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.pagebaseclass;
import com.aventstack.extentreports.ExtentTest;

/**
 * @author Thimmegowda
 *
 */
public class Coffeepage extends pagebaseclass {

	@FindBy(xpath = "//button[@class='btn-icon js-search-toggle' and ancestor::div[@class='header__container container container--small container--full-bleed']]")
	public WebElement mainsearch;

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

	public Coffeepage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
	}

	public Landingpage hoverlinks() {
		Actions action = new Actions(driver);
		action.moveToElement(coffeelink).build().perform();
		action.moveToElement(tealink).build().perform();
		action.moveToElement(subscriptionlink).build().perform();
		action.moveToElement(visituslink).build().perform();
		action.moveToElement(learnlink).build().perform();
		// TODO Auto-generated catch block
		return PageFactory.initElements(driver, Landingpage.class);
	}

	public Searchpage clickonsearch() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", mainsearch);
		return PageFactory.initElements(driver, Searchpage.class);
	}
}
