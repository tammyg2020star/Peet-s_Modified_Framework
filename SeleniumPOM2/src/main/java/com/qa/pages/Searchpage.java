/**
 * 
 */
package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.pagebaseclass;

/**
 * @author Thimmegowda
 *
 */
public class Searchpage extends pagebaseclass {

	/**
	 * @param driver
	 * @param logger
	 */

	// TODO Auto-generated constructor stub

	@FindBy(xpath = "//a[@href='/products/aged-sumatra' and contains(text(),'Aged Sumatra')]")
	public WebElement item1;

	@FindBy(xpath = "//*[@id='btnAddToBagText']")
	public WebElement addtocart;

	public Searchpage(WebDriver driver) {
		this.driver = driver;
	}

	public Searchpage searchitem() {
//		item1.click();

		return PageFactory.initElements(driver, Searchpage.class);

	}
}
