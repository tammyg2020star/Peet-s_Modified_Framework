/**
 * 
 */
package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.pagebaseclass;
import com.aventstack.extentreports.ExtentTest;

/**
 * @author Thimmegowda
 *
 */
public class Searchpage extends pagebaseclass {

	@FindBy(xpath = "//a[@href='/products/aged-sumatra' and contains(text(),'Aged Sumatra')]")
	public WebElement item1;

	@FindBy(xpath = "//*[@id='btnAddToBagText']")
	public WebElement addtocart;

	public Searchpage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
	}

	public Searchpage searchitem() {
//		item1.click();

		return PageFactory.initElements(driver, Searchpage.class);

	}
}
