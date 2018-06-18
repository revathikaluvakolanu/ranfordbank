package pagelibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wipro.ranford.BaseClass;


public class HomePage extends BaseClass{
	
	public static WebElement username_Editbox(WebDriver driver)
	{
		return driver.findElement(getLocator("username_txt_id"));
	}
	
	public static WebElement password_Editbox(WebDriver driver)
	{
		return driver.findElement(getLocator("password_txt_id"));
	}
	
	public static WebElement login_button(WebDriver driver)
	{
		return driver.findElement(getLocator("login_btn_id"));
	}



}
