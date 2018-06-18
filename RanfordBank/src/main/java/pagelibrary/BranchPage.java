package pagelibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wipro.ranford.BaseClass;

public class BranchPage extends BaseClass{
	
	public static WebElement newBranch_Button(WebDriver driver)
	{
		return driver.findElement(getLocator("newBranchesButton_id"));
	}
	
	public static WebElement branchName_Editbox(WebDriver driver)
	{
		return driver.findElement(getLocator("branchName_name"));
	}
	
	public static WebElement address1_Editbox(WebDriver driver)
	{
		return driver.findElement(getLocator("address1_name"));
	}
	 
	 public static WebElement branchZipTxt(WebDriver driver)
	 {
	  return driver.findElement(getLocator("ZipCode_id"));
	 }
	 
	 public static WebElement branchSubmitLink(WebDriver driver)
	 {
	  return driver.findElement(getLocator("submit_id"));
	 }	 	  


}
