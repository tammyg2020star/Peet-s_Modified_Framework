/**
 * 
 */
package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Baseclass.pagebaseclass;

/**
 * @author Thimmegowda
 *
 */
public class Searchpage extends pagebaseclass {
	@FindBy(xpath = "//*[@id='searchInput']")
	WebElement itemsearch;

	@FindBy(xpath = "//*[@id='searchMenuBtn']")
	public WebElement searchclick;

	public Searchpage(WebDriver driver) {
		this.driver = driver;
	}

	public Searchpage searchitem() {
		itemsearch.sendKeys("aged sumatra");
		searchclick.click();
		return PageFactory.initElements(driver, Searchpage.class);

	}
}
