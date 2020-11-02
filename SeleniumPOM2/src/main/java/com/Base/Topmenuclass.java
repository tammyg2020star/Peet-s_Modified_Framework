/**
 * 
 */
package com.Base;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.qa.pages.Searchpage;

public class Topmenuclass extends pagebaseclass {
	@FindBy(xpath = "//button[@class='btn-icon js-search-toggle' and ancestor::div[@class='header__container container container--small container--full-bleed']]")
	public WebElement mainsearch;

	@FindBy(xpath = "//*[@id='searchInput']")
	public WebElement itemsearch;

	public Topmenuclass(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
	}

	public Searchpage search() {
		try {
			mainsearch.click();
			itemsearch.sendKeys("Aged Sumatra");
			action.sendKeys(Keys.ENTER).build().perform();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return PageFactory.initElements(driver, Searchpage.class);
	}

}
