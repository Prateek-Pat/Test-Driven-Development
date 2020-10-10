package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependencyAnootation {
	
	@BeforeMethod  // 2nd Execution
	public void beforemethod()
	{
		System.out.println("2nd Execution This method will execcuted befroe each test execution ");
	}
	
	@Test  // 3rd Execution
	public void FlightSearch()
	{
		System.out.println("3rd Execution This method will be execcuted BeforeMethod anootation ");
	}
	
	//@Test  // 7th Execution
	public void FlightReservation()
	{
		System.out.println("7th Execution This method will be execcuted BeforeMethod anootation ");
	}
	
	@Test(dependsOnMethods={"FlightSearch"})   // 9th Execution
	//@Test // Since Test would be executed alphabetically this method would execute first
	public void FlightBook()
	{
		System.out.println("9th Execution This method will be execcuted BeforeMethod anootation ");
	}

	@Test(dependsOnMethods={"FlightBook"}) // With this attribute this method would be run after "FlightSearch" method
	//@Test(dependsOnMethods={"FlightSearch"})
	//@Test
	public void FlightPayment()
	{
		System.out.println("Flight payment done");
	}
	
	@AfterMethod // 4th Execution
	public void aftermethod()
	{
		System.out.println("4th Execution This method will be execcuted after each test execution ");
	}	

	/*
	@Test(dependsOnMethods={"FlightBook"},alwaysRun=true)
	public void FlightBook()
	{
		System.out.println("9th Execution This method will be executed BeforeMethod annotation ");
	}
	*/
	
	/*
	@Test(timeOut=4000)
	public void FlightBook()
	{
		System.out.println("9th Execution This method will be executed BeforeMethod annotation ");
	}
	*/
	
}
