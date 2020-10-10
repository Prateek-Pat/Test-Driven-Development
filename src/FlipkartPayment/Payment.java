package FlipkartPayment;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Payment {

	@BeforeMethod
	public void credentialVerification()
	{
		System.out.println("credentailVerification is correct");
	}
	
	@Test(groups ={"Sanity"})
	public void ValidCardDetails()
	{
		System.out.println("User Entered Valid Card Details");
	}
	
	@Test
	public void InvalidCardDetails()
	{
		System.out.println("User Entered Invalid Card Details");
	}
	
	//@Test(groups={"Sanity"},dependsOnMethods={"ValidCardDetails"})
	@Test(dependsOnMethods={"AddToCart"}) // this method run even if depends on method present in diff class, but not workes with group
	public void paymentSuccess()
	{
		System.out.println("Payment in successfull");
	}
}
