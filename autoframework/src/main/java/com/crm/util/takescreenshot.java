package com.crm.util;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.crm.base.Testbase;
import com.google.common.io.Files;

public class takescreenshot extends Testbase {
	
	public static void Getscreenshot(WebDriver ldriver, String screenshotname) throws IOException {
		// WebDriver driver = null;
		Calendar calendar = Calendar.getInstance();
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int min = calendar.get(Calendar.MINUTE);
		int seconds = calendar.get(Calendar.SECOND);

		File scrfile = ((TakesScreenshot) ldriver).getScreenshotAs(OutputType.FILE);
		String filename = ("\\src\\main\\resources\\img" + screenshotname + hour + min + "" + seconds + ".png");
		Files.copy(scrfile, new File(filename));
		//FileHandler.copy(scrfile, new File(filename)); // Newly added to Selenium-java-3.12.0

	}

}
