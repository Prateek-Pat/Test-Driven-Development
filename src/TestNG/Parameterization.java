package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameterization {

	@BeforeMethod  // 2nd Execution
	public void beforemethod()
	{
		System.out.println("2nd Execution This method will execcuted befroe each test execution ");
	}
	
	/*@Test  // 3rd Execution
	public void FlightSearch()
	{
		System.out.println("3rd Execution This method will be executed BeforeMethod annotation ");
	}*/
	
	@Test (dataProvider = "postData")
	public void FlightReservation(String FirstName, String LastName, String FullName)
	{
		System.out.println("7th Execution This method will be execcuted BeforeMethod anootation ");
		System.out.println("FirstName of the user is " + FirstName);
		System.out.println("LastName of the user is " + LastName);
		System.out.println("FullName of the user is " + FullName);
	}

	
	/*@Test (dataProvider = "postData", dependsOnMethods = {"FlightSearch"})
	public void FlightReservation(String FirstName, String LastName, String FullName)
	{
		System.out.println("7th Execution This method will be executed BeforeMethod annotation ");
		System.out.println("FirstName of the user is " + FirstName);
		System.out.println("LastName of the user is " + LastName);
		System.out.println("FullName of the user is " + FullName);
	} */

	@AfterMethod // 4th Execution
	public void aftermethod()
	{
		System.out.println("4th Execution This method will be execcuted after each test execution ");
	}	

	@DataProvider(name = "postData")
	public Object[][] Dpmethod()
	{   
		//[2] No of Iteration,
		//[3] No of Parameter
		Object[][] data = new Object [2][3] ;
		
		data[0][0] = "Max";    // 1st Iteration
		data[0][1] = "Payne";
		data[0][2] = "Dr MP";
		
		data[1][0] = "Serious";   // 2nd Iteration
		data[1][1] = "Sam";
		data[1][2] = "Dr Serious Sam";
		
		return data;
	}
}
