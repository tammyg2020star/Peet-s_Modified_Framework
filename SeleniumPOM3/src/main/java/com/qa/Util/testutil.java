package com.qa.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.Baseclass.pagebaseclass;

/**
 * Author: @Tammyg
 */

public class testutil extends pagebaseclass {
	// this is insted of giving the timeout in baseclass, we can give here and call
	// that in base class
	// public static long page_load_timeout=20;

	public static long implicit_wait = 40;

	public static String TESTDATA_SHEET_PATH = "C:\\Users\\Thimmegowda\\git\\Peets_Prod_Regression\\Peets_Prod_automation\\src\\main\\java\\com\\crm\\qa\\testdata\\peets_reg_testdata.xlsx";

	static Workbook book;

	static Sheet sheet;

	public static Object[][] getTestData(String sheetname) {

		FileInputStream fip = null;
		try {
			fip = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		try {
			book = WorkbookFactory.create(fip);
		} catch (InvalidFormatException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		}

		sheet = book.getSheet(sheetname);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			}
		}

		return data;

	}

	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
}
