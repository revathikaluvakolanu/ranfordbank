package wipro.ranford;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pagelibrary.AdminPage;
import pagelibrary.BranchPage;
import pagelibrary.GenericPage;
import pagelibrary.HomePage;
import Utility.Validation;

import com.wipro.ranford.BaseClass;

public class Repository extends BaseClass{
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();
	
	public void launch()
	{
		/*System.setProperty("webdriver.chrome.driver", "E:\\Parkside Disk\\SassafrasDinesh\\Revathi\testing\\chrome\\chromedriver.exe");*/
		driver = new FirefoxDriver();
		driver.get(config("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		if(Validation.isTextDisplayed(driver,"Welcome to Personalized Banking"))
		{
			Reporter.log("Home page loaded successfully");
		}
		else
		{
			Reporter.log("Home page NOT loaded");
		}
	}
	
	public void login()
	{
		HomePage.username_Editbox(driver).sendKeys(config("username"));
		HomePage.password_Editbox(driver).sendKeys(config("password"));
		HomePage.login_button(driver).click();
		String title = driver.getTitle();
		
		if(title.equalsIgnoreCase("KEXIM BANK"))
		{
			Reporter.log("Title correctly displayed as:"+title);
		}
		else
		{
			Reporter.log("Incorrect Title displayed");
		}
		
	}
	
	public void clickBranches()
	{
		AdminPage.branches_Button(driver).click();
	}
	
	public void createNewBranch()
	{
		BranchPage.newBranch_Button(driver).click();
		BranchPage.branchName_Editbox(driver).sendKeys(config("branchName"));
		BranchPage.address1_Editbox(driver).sendKeys(config("address1"));
		BranchPage.branchZipTxt(driver).sendKeys(config("zipcode"));
		GenericPage.dropdownSelection(driver, getLocator("Country_id")).selectByValue(config("countryName"));
		GenericPage.dropdownSelection(driver, getLocator("State_id")).selectByValue(config("stateName"));
		GenericPage.dropdownSelection(driver, getLocator("City_id")).selectByValue(config("cityname"));
		BranchPage.branchSubmitLink(driver).click();
		
		String alertMsg = driver.switchTo().alert().getText();
		
		if(alertMsg.contains("created Sucessfully"))
		{
			Reporter.log("Branch created successfully. Displayed:"+alertMsg);
		} else {
			//softAssert.assertTrue(alertMsg.contains("created Successfully"));
			softAssert.assertEquals(alertMsg, "created Sucessfully");
			Reporter.log("Branch creation failed");
		}
		
		driver.switchTo().alert().accept();
		
		softAssert.assertAll();
	}

}
