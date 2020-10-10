package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation2 {
	
	@BeforeSuite  // This is on high priority, This Annotation would be executed 1st
	public void befroesuite()
	{
		System.out.println("1st Execcution This method will be scan all the calsses and checck for beforesuite annotation if present then it prints firsts");
	}

	@Test(enabled=false)  // Since this test is not enable this won't run
	public void FlightConfirmation()
	{
		System.out.println("Flight payment done");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("7th Execution This method will be executed after all test");
	}
}
