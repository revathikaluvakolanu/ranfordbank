package wipro.ranford;

import org.testng.annotations.Test;

public class TestExecution extends Repository{
	
	@Test(priority=1)
	public void verify_Launch()
	{
		launch();
	}
	
	
	@Test(priority=2)
	public void verify_Login()
	{
		login();
	}
	
	
	@Test(priority=3)
	public void createBranch()
	{
		clickBranches();
		createNewBranch();
	}

}
