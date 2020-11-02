/**
 * 
 */
package com.qa.util;

import java.util.Date;

/**
 * @author Thimmegowda
 *
 */
public class DateUtil {

	public static String getTimeStamp() {
		Date date = new Date();
		return date.toString().replaceAll(":", "_").replaceAll(" ", "_");
	}
}
