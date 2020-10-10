package FlipkartLogout;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Logout {

	@BeforeMethod
	public void taskDone()
	{
		System.out.println("Task Done");
	}
	
	@Test(groups={"Sanity"})
	public void LogoutSuccess()
	{
		System.out.println("User is Successfully Logedout");
	}
	
	@Test
	public void LogoutFailure()
	{
		System.out.println("User is not LogedOut");
	}
}
