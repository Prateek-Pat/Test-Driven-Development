package TestNG2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationT2 {

	@BeforeTest  // 2nd Execution
	public void beforetest()
	{
		System.out.println("2nd Execution This test will be execcuted before all test execution");
	}
	
	@BeforeMethod  // 3rd Execution
	public void beforemethod()
	{
		System.out.println("3rd Execution This method will execcuted befroe each test execution ");
	}
	
	@Test (groups ={"Priority 2"}) // 4th Execution
	public void FlightSearch()	
	{
		System.out.println("4th Execution This method will be execcuted BeforeMethod anootation ");
	}
	
	@Test (groups ={"Priority 2"})  // 7th Execution
	public void Reservation()
	{
		System.out.println("7th Execution This method will be execcuted BeforeMethod anootation ");
	}
	
	@Test(dependsOnMethods={"FlightSearch"})   // 8th Execution
	//@Test // Since Test would be executed alphabetically this method would execute first
	public void FlightBook()
	{
		System.out.println("9th Execution This method will be execcuted BeforeMethod anootation ");
	}
	
	@AfterMethod // 5th Execution
	public void aftermethod()
	{
		System.out.println("5th Execution This method will be execcuted after each test execution ");
	}	
	
	@AfterTest // 10th Execution
	public void aftertest()
	{
		System.out.println("10th Execution This method will be execcuted after the execcution of all test");	
	}
	
}
