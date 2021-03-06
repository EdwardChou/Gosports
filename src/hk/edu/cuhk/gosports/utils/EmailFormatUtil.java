package hk.edu.cuhk.gosports.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Verify format of email address
 * 
 * @author EdwardChou edwardchou_gmail_com
 * @date 2014-10-16 PM4:13:16
 * @version V1.0
 * 
 */
public class EmailFormatUtil {
	/**
	 * verify email format
	 * 
	 * @param email
	 * @return is format correct
	 */
	public static boolean emailFormat(String email) {
		boolean tag = true;
		String patternStr = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+"
				+ "(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(patternStr);
		Matcher mat = pattern.matcher(email);
		if (!mat.find()) {
			tag = false;
		}
		return tag;
	}
}
