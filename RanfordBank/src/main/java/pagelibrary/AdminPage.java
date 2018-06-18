package pagelibrary;



import com.wipro.ranford.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class AdminPage extends BaseClass{
	public static WebElement branches_Button(WebDriver driver)
	{
		return driver.findElement(getLocator("branches_btn_xpath"));
	}
	
	
	

	public static WebElement Admin_Button(WebDriver driver)
	{
		return driver.findElement(getLocator("admin_btn_xpath"));
	}


}
