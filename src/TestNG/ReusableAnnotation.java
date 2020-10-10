package TestNG;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReusableAnnotation {
	
	@BeforeMethod (groups={"Priority 1"})
	public void ServerUpandRunning()
	{
		System.out.println("1st Servers are up and running");
	}

	@Test(groups={"Priority 1"})
	public void SearchFligh()
	{
		System.out.println("2nd Search flights");
	}
	
	@Test(dependsOnMethods={"SearchFligh"})
	public void CompareFlight()
	{
		System.out.println("3rd Compare Flights");
	}
	
	@Test(dependsOnMethods={"SearchFligh"}, groups={"Priority 1"})
	public void ConfirmFlight()
	{	
		System.out.println("4th Flight Confirmation after booking");
	}
	
	@AfterMethod (groups={"Priority 1"})
	public void LogCaptured()
	{
		System.out.println("5th End 2 End log captured for seleccted flight");
		
	}
}
