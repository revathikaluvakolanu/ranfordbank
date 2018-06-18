package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Validation{
	
	
	public static boolean isTextDisplayed(WebDriver driver, String expectedText)
	{
		return driver.findElement(By.tagName("tbody")).getText().contains(expectedText);
	}


}
