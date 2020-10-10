package FlipkartLogin;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {

	@BeforeMethod
	public void userExists()
	{
		System.out.println("User account should exists before login");
	}
	@Test(groups = {"Sanity"})
	public void LoginSuccess()
	{
		System.out.println("User is Successfully LogedIn");
	}
	@Test
	public void Loginfailure()
	{
		System.out.println("User is not LogedIn");
	}
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("User close the browser without loged out");
	}
}
