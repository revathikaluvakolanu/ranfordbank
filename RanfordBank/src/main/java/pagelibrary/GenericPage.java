package pagelibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.wipro.ranford.BaseClass;


public class GenericPage extends BaseClass{
	
	public static Select dropdownSelection(WebDriver driver, By locator)
	{
		Select x = new Select(driver.findElement(locator));
		return x;
	}




}
